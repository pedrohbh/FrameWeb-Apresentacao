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

	private List<DomainPackage> domainPackages;
	private List<EnumerationClassCodeGenerator> enumerationClasses;
	private ORMTemplate ormTemplate;
	
	/**
	 * Responsavel por armazenar o conteudo do modelo de entidades
	 * e tambem pela geracao de codigo do mesmo.
	 * 
	 * @param entityModel
	 * @param ormTemplate
	 */
	public EntityModelCodeGenerator(EntityModel entityModel, ORMTemplate ormTemplate) {

		domainPackages = entityModel.getOwnedElements()
				.stream()
				.filter(DomainPackage.class::isInstance)
				.map(DomainPackage.class::cast)
				.collect(Collectors.toList());
		
		this.ormTemplate = ormTemplate;
		
//		TODO trazer as classes de enumeracao para dentro do pacote de dominio (sirius)
		enumerationClasses = entityModel.getOwnedElements()
				.stream()
				.filter(Enumeration.class::isInstance)
				.map(Enumeration.class::cast)
				.map(enumerationClass -> new EnumerationClassCodeGenerator(enumerationClass, ormTemplate))
				.collect(Collectors.toList());
		
	}

	/**
	 * Gera as classes do modelo de entidades dentro de um dado diretorio (pacote)
	 * 
	 * @param srcFolder
	 */
	public void generate(IFolder srcFolder) {
		domainPackages.forEach(domainPackage -> {
			String packagePath = domainPackage.getName().replaceAll("[^A-Za-z0-9]", "/");

			ProjectUtils.makeDirectory(srcFolder, packagePath);

			IFolder package_ = srcFolder.getFolder(packagePath);

//			TODO ainda e necessario definir um template para as classes de enumeracao
			enumerationClasses.forEach(it -> it.generate(package_));

			domainPackage.getOwnedTypes()
					.stream()
					.filter(DomainClass.class::isInstance)
					.map(DomainClass.class::cast)
					.map(domainClass -> new EntityClassCodeGenerator(domainClass, ormTemplate))
					.collect(Collectors.toList())
					.forEach(it -> it.generate(package_));
		});
	}
	
}
