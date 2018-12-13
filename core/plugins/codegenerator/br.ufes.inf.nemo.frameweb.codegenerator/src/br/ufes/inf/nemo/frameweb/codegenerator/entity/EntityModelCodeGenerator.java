package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class EntityModelCodeGenerator {

	private DomainPackage domainPackage;
	private List<DomainClassCodeGenerator> domainClasses;
	
	/**
	 * Responsavel por armazenar todas as classes referentes ao modelo de entidades e
	 * tambem pela geracao de codigo das mesmas.
	 * 
	 * @param entityModel
	 * @param ormTemplate
	 */
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate) {
		domainPackage = entityModel.getDomainPackage();
		
		domainClasses = domainPackage.getDomainClasses()
			.stream()
			.map(it -> new DomainClassCodeGenerator(it, domainPackage, ormTemplate))
			.collect(Collectors.toList());
	}
	
	public DomainPackage getDomainPackage() {
		return domainPackage;
	}
	
	public void generate(IFolder srcFolder) {
		String packagePath = domainPackage.getName().replaceAll("[^A-Za-z0-9]", "/");
		ProjectUtils.createPackage(srcFolder, packagePath);

		IFolder packageFolder = srcFolder.getFolder(packagePath);
		domainClasses.forEach(it -> it.generate(packageFolder));
	}

}
