package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectConfiguration;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class EntityModelCodeGenerator implements ModelCodeGenerator {

	private List<DomainPackage> domainPackages;
	private ORMTemplate ormTemplate;
	private ProjectConfiguration projectConfiguration;
	
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate, ProjectConfiguration projectConfiguration) {
		domainPackages = entityModel.getOwnedElements()
				.stream()
				.filter(DomainPackage.class::isInstance)
				.map(DomainPackage.class::cast)
				.collect(Collectors.toList());
		
		this.ormTemplate = ormTemplate;
		this.projectConfiguration = projectConfiguration;
	}

	@Override
	public void generate() {
		String templatePath = ormTemplate.getClassTemplate();
		String template = projectConfiguration.getTemplate(templatePath);
		
		String enumTemplatePath = ormTemplate.getEnumerationClassTemplate();
		String enumTemplate = projectConfiguration.getTemplate(enumTemplatePath);
		
		IFolder src = projectConfiguration.getSourceFolder();
		
		domainPackages.forEach(domainPackage -> {
			String packagePath = IFolderUtils.packageNameToPath(domainPackage.getName());

			IFolderUtils.makeDirectory(src, packagePath);

			IFolder package_ = src.getFolder(packagePath);
				
			domainPackage.getOwnedTypes()
					.stream()
					.filter(DomainClass.class::isInstance)
					.map(DomainClass.class::cast)
					.forEach(domainClass -> {
						String code = ClassCodeGenerator.render(domainClass, template);
						
						String fileName = domainClass.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});
			
			domainPackage.getOwnedTypes()
					.stream()
					.filter(Enumeration.class::isInstance)
					.map(Enumeration.class::cast)
					.forEach(enumerationClass -> {
						String code = ClassCodeGenerator.render(enumerationClass, enumTemplate);
						
						String fileName = enumerationClass.getName() + projectConfiguration.getClassExtension();
						IFile file = package_.getFile(fileName);
						
						IFileUtils.createFile(file, code);
					});
		});
	}

}
