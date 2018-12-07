package br.ufes.inf.nemo.frameweb.codegenerator

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate
import java.util.Iterator
import java.util.List

class EntityModelCodeGenerator implements Iterator<String> {
	
	Iterator<EntityClassCodeGenerator> iterator
	List<EntityClassCodeGenerator> domainClasses
	
	/**
	 * Armazenamos apenas aquilo que nos eh interessante quanto ao modelo de entidades,
	 * sendo o pacote de dominio e suas classes
	 * 
	 * @param entityModel
	 * @param ormTemplate
	 */
	new(EntityModel entityModel, ORMTemplate ormTemplate) {
		val domainPackage = entityModel.getDomainPackage()
		
		domainClasses = domainPackage
			.getDomainClasses()
			.map[new EntityClassCodeGenerator(it, domainPackage.getName(), ormTemplate)]
			.toList()
			
		iterator = domainClasses.iterator
	}

	/**
	 * Extrai o pacote de dominio do modelo de entidades
	 * 
	 * @param entityModel
	 */
	def getDomainPackage(EntityModel entityModel) {
		val domainPackage = entityModel
			.eContents()
			.findFirst[it instanceof DomainPackage]
		
		if (domainPackage !== null) (domainPackage as DomainPackage) else null
	}
	
	/**
	 * Extrai as classes do dominio do pacote de dominio do modelo de entidades
	 * 
	 * @param domainPackage
	 */
	def getDomainClasses(DomainPackage domainPackage) {
		domainPackage
			.eContents()
			.filter[it instanceof DomainClass]
			.map[it as DomainClass]
			.toList()
	}

	override hasNext() {
		iterator.hasNext()
	}
	
	override next() {
		iterator.next().generate()
	}
	
}
