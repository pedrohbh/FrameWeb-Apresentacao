package br.ufes.inf.nemo.frameweb.codegenerator.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.EngineUtils;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class EntityModelCodeGenerator {

	private List<DomainPackage> domainPackages;
	private ORMTemplate ormTemplate;
	
	/**
	 * @param entityModel
	 * @param ormTemplate
	 */
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate) {
		this.ormTemplate = ormTemplate;
		
		domainPackages = entityModel.getOwnedElements()
				.stream()
				.filter(DomainPackage.class::isInstance)
				.map(DomainPackage.class::cast)
				.collect(Collectors.toList());
	}

	/**
	 * Gera as classes do modelo de entidades dentro de um dado diretorio (pacote)
	 * 
	 * @param srcFolder
	 */
	public void generate(IFolder srcFolder) {
		domainPackages.forEach(domainPackage -> {
			String packagePath = EngineUtils.packageNameToPath(domainPackage.getName());

			ProjectUtils.makeDirectory(srcFolder, packagePath);

			IFolder package_ = srcFolder.getFolder(packagePath);
				
			domainPackage.getOwnedTypes()
					.stream()
					.filter(DomainClass.class::isInstance)
					.map(DomainClass.class::cast)
					.map(domainClass -> new ClassCodeGenerator(domainClass, ormTemplate))
					.forEach(it -> it.generate(package_));
			
			domainPackage.getOwnedTypes()
					.stream()
					.filter(Enumeration.class::isInstance)
					.map(Enumeration.class::cast)
					.map(enumeration -> new ClassCodeGenerator(enumeration, ormTemplate))
					.forEach(it -> it.generate(package_));
		});
	}
	
}
