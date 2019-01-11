package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class EntityModelCodeGenerator {

	private DomainPackage domainPackage;
	private List<EnumerationClassCodeGenerator> enumerationClasses;
	private List<EntityClassCodeGenerator> domainClasses;
	
	/**
	 * Responsavel por armazenar todas as classes referentes ao modelo de entidades
	 * e tambem pela geracao de codigo das mesmas.
	 * 
	 * @param entityModel
	 * @param ormTemplate
	 */
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate) {
		domainPackage = entityModel.getOwnedElements()
				.stream()
				.filter(DomainPackage.class::isInstance)
				.map(DomainPackage.class::cast)
				.findFirst()
				.get();
		
		enumerationClasses = entityModel.getOwnedElements()
				.stream()
				.filter(Enumeration.class::isInstance)
				.map(Enumeration.class::cast)
				.map(enumerationClass -> new EnumerationClassCodeGenerator(enumerationClass, ormTemplate))
				.collect(Collectors.toList());
		
		domainClasses = domainPackage.getOwnedTypes()
				.stream()
				.filter(DomainClass.class::isInstance)
				.map(DomainClass.class::cast)
				.map(domainClass -> new EntityClassCodeGenerator(domainClass, ormTemplate))
				.collect(Collectors.toList());
		
	}

	/**
	 * Gera as classes do modelo de entidades dentro de um dado diretorio (pacote)
	 * 
	 * @param srcFolder
	 */
	public void generate(IFolder srcFolder) {
		String packagePath = domainPackage.getName().replaceAll("[^A-Za-z0-9]", "/");
		
		ProjectUtils.makeDirectory(srcFolder, packagePath);
		
		IFolder package_ = srcFolder.getFolder(packagePath);
		
//		TODO ainda e necessario definir um template para as classes de enumeracao
		enumerationClasses.forEach(it -> it.generate(package_));
		
		domainClasses.forEach(it -> it.generate(package_));
	}
	
}
