package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectProperties;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class PersistenceModelCodeGenerator implements ModelCodeGenerator {
	
	private List<PersistencePackage> persistencePackages;
	private DAOTemplate daoTemplate;
	private ProjectProperties projectConfiguration;
	
	public PersistenceModelCodeGenerator(PersistenceModel persistenceModel, DAOTemplate daoTemplate, ProjectProperties projectConfiguration) {
		persistencePackages = persistenceModel.getOwnedElements()
				.stream()
				.filter(PersistencePackage.class::isInstance)
				.map(PersistencePackage.class::cast)
				.collect(Collectors.toList());
		
		this.daoTemplate = daoTemplate;
		this.projectConfiguration = projectConfiguration;
	}

	@Override
	public void generate() {
		String templatePath = daoTemplate.getClassTemplate();
		String template = projectConfiguration.getTemplate(templatePath);
		
		String interfaceTemplatePath = daoTemplate.getInterfaceTemplate();
		String interfaceTemplate = projectConfiguration.getTemplate(interfaceTemplatePath);
		
		IFolder src = projectConfiguration.getSourceFolder();
		
		persistencePackages.forEach(persistencePackage -> {
			String packagePath = IFolderUtils.packageNameToPath(persistencePackage.getName());

			IFolderUtils.makeDirectory(src, packagePath);
			
			IFolder package_ = src.getFolder(packagePath);

			persistencePackage.getOwnedTypes()
					.stream()
					.filter(DAOClass.class::isInstance)
					.map(DAOClass.class::cast)
					.forEach(daoClass -> {
						String code = ClassCodeGenerator.render(daoClass, template);
						
						String fileName = daoClass.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
								
						IFileUtils.createFile(file, code);
					});
			
			persistencePackage.getOwnedTypes()
					.stream()
					.filter(DAOInterface.class::isInstance)
					.map(DAOInterface.class::cast)
					.forEach(daoInterface -> {
//						FIXME a busca deve ser feita pela realizacao, mas como ela nao funciona no editor grafico, nao pode ser resgatada.
//						Aqui sera feita por meio de nomes. Isso e errado! As realizacoes devem ser consertadas para que isso funcione adequadamente.
						List<DAOClass> daoClasses = persistencePackage.getOwnedTypes()
								.stream()
								.filter(DAOClass.class::isInstance)
								.map(DAOClass.class::cast)
								.collect(Collectors.toList());
						
						List<DAOMethod> daoMethods = new ArrayList<DAOMethod>();
						
						for (DAOClass daoClass : daoClasses) {
							if (daoClass.getName().contains(daoInterface.getName()) || daoInterface.getName().contains(daoClass.getName())) {
								daoMethods.addAll(daoClass.getOperations()
										.stream()
										.filter(DAOMethod.class::isInstance)
										.map(DAOMethod.class::cast)
										.collect(Collectors.toList()));
								
								break;
							}
						}
						
						String code = ClassCodeGenerator.render(daoInterface, daoMethods, interfaceTemplate);
						
						String fileName = daoInterface.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});
		});
	}
	
}
