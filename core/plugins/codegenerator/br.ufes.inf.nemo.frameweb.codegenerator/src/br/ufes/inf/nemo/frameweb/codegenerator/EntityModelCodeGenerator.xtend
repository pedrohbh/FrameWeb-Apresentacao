package br.ufes.inf.nemo.frameweb.codegenerator

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel
import java.util.List
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate

class EntityModelCodeGenerator {
	
	List<EntityClassCodeGenerator> domainClasses
	
	/**
	 * Armazenamos apenas aquilo que nos eh interessante quanto ao modelo de entidades,
	 * sendo o pacote de dominio e suas classes
	 */
	new(EntityModel entityModel, ORMTemplate ormTemplate) {
		val domainPackage = entityModel.getDomainPackage()
		
		domainClasses = domainPackage
			.getDomainClasses()
			.map[new EntityClassCodeGenerator(it, domainPackage.getName(), ormTemplate)]
			.toList()
	}

	/**
	 * Extrai o pacote de dominio do modelo de entidades
	 */
	def getDomainPackage(EntityModel entityModel) {
		val domainPackage = entityModel
			.eContents()
			.findFirst[it instanceof DomainPackage]
		
		if (domainPackage !== null) (domainPackage as DomainPackage) else null
	}
	
	/**
	 * Extrai as classes do dominio do pacote de dominio do modelo de entidades
	 */
	def getDomainClasses(DomainPackage domainPackage) {
		domainPackage
			.eContents()
			.filter[it instanceof DomainClass]
			.map[it as DomainClass]
			.toList()
	}
	
	/**
	 * Retorna a lista de classes de entidade contidas no modelo
	 */
	def getEntityClasses() {
		domainClasses
	}
}
