package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectProperties;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class ApplicationModelCodeGenerator implements ModelCodeGenerator {
	
	private List<ApplicationPackage> applicationPackages;
	private DITemplate diTemplate;
	private ProjectProperties projectConfiguration;
	
	public ApplicationModelCodeGenerator(ApplicationModel applicationModel, DITemplate diTemplate, ProjectProperties projectConfiguration) {
		applicationPackages = applicationModel.getOwnedElements()
				.stream()
				.filter(ApplicationPackage.class::isInstance)
				.map(ApplicationPackage.class::cast)
				.collect(Collectors.toList());
		
		this.diTemplate = diTemplate;
		this.projectConfiguration = projectConfiguration;
	}
	
	@Override
	public void generate() {
		String templatePath = diTemplate.getClassTemplate();
		String template = projectConfiguration.getTemplate(templatePath);
		
		String interfaceTemplatePath = diTemplate.getInterfaceTemplate();
		String interfaceTemplate = projectConfiguration.getTemplate(interfaceTemplatePath);
		
		IFolder src = projectConfiguration.getSourceFolder();
		
		applicationPackages.forEach(applicationPackage -> {
			String packagePath = IFolderUtils.packageNameToPath(applicationPackage.getName());

			IFolderUtils.makeDirectory(src, packagePath);
			
			IFolder package_ = src.getFolder(packagePath);

			applicationPackage.getOwnedTypes()
					.stream()
					.filter(ServiceClass.class::isInstance)
					.map(ServiceClass.class::cast)
					.forEach(serviceClass -> {
						String code = ClassCodeGenerator.render(serviceClass, template);
						
						String fileName = serviceClass.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});

			applicationPackage.getOwnedTypes()
					.stream()
					.filter(ServiceInterface.class::isInstance)
					.map(ServiceInterface.class::cast)
					.forEach(serviceInterface -> {
//						FIXME a busca deve ser feita pela realizacao, mas como ela nao funciona, aqui sera feita por meio de nomes.
//						Isso e errado! As realizacoes devem ser consertadas para que isso funcione adequadamente
						List<ServiceClass> serviceClasses = applicationPackage.getOwnedTypes()
								.stream()
								.filter(ServiceClass.class::isInstance)
								.map(ServiceClass.class::cast)
								.collect(Collectors.toList());
						
						List<ServiceMethod> serviceMethods = new ArrayList<ServiceMethod>();
						
						for (ServiceClass serviceClass : serviceClasses) {
							if (serviceClass.getName().contains(serviceInterface.getName())) {
								serviceMethods.addAll(serviceClass.getOperations()
										.stream()
										.filter(ServiceMethod.class::isInstance)
										.map(ServiceMethod.class::cast)
										.collect(Collectors.toList()));
								
								break;
							}
						}
						
						String code = ClassCodeGenerator.render(serviceInterface, serviceMethods, interfaceTemplate);
						
						String fileName = serviceInterface.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});
		});
	}
	
}
