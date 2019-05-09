package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectConfiguration;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class PersistenceModelCodeGenerator implements ModelCodeGenerator {
	
	private List<PersistencePackage> persistencePackages;
	private DAOTemplate daoTemplate;
	private ProjectConfiguration projectConfiguration;
	
	public PersistenceModelCodeGenerator(PersistenceModel persistenceModel, DAOTemplate daoTemplate, ProjectConfiguration projectConfiguration) {
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
						String code = ClassCodeGenerator.render(daoInterface, interfaceTemplate);
						
						String fileName = daoInterface.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});
		});
	}
	
}
