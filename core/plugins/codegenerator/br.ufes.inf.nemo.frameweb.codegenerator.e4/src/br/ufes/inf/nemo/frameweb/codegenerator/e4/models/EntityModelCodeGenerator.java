package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.ProjectProperties;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class EntityModelCodeGenerator implements ModelCodeGenerator {

	private List<DomainPackage> domainPackages;
	private ORMTemplate ormTemplate;
	private ProjectProperties projectConfiguration;
	
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate, ProjectProperties projectConfiguration) {
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
		
		String authUserTemplatePath = ormTemplate.getAuthUserClassTemplate();
		String authUserTemplate = projectConfiguration.getTemplate(authUserTemplatePath);
		
		String authRoleTemplatePath = ormTemplate.getAuthRoleClassTemplate();
		String authRoleTemplate = projectConfiguration.getTemplate(authRoleTemplatePath);
		
		String authPermissionTemplatePath = ormTemplate.getAuthPermissionClassTemplate();
		String authPermissionTemplate = projectConfiguration.getTemplate(authPermissionTemplatePath);
		
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
			
			domainPackage.getOwnedTypes()
				.stream()
				.filter(AuthUser.class::isInstance)
				.map(AuthUser.class::cast)
				.forEach(AuthUser -> {
					String code = ClassCodeGenerator.render(AuthUser, authUserTemplate);
					
					String fileName = AuthUser.getName() + projectConfiguration.getClassExtension();
					IFile file = package_.getFile(fileName);
					
					IFileUtils.createFile(file, code);
				});
			
			domainPackage.getOwnedTypes()
				.stream()
				.filter(AuthRole.class::isInstance)
				.map(AuthRole.class::cast)
				.forEach(AuthRole -> {
					String code = ClassCodeGenerator.render(AuthRole, authRoleTemplate);
					
					String fileName = AuthRole.getName() + projectConfiguration.getClassExtension();
					IFile file = package_.getFile(fileName);
					
					IFileUtils.createFile(file, code);
				});
			
			domainPackage.getOwnedTypes()
				.stream()
				.filter(AuthPermission.class::isInstance)
				.map(AuthPermission.class::cast)
				.forEach(AuthPermission -> {
					String code = ClassCodeGenerator.render(AuthPermission, authPermissionTemplate);
					
					String fileName = AuthPermission.getName() + projectConfiguration.getClassExtension();
					IFile file = package_.getFile(fileName);
					
					IFileUtils.createFile(file, code);
				});
			
		});
	}

}
