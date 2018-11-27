package br.ufes.inf.nemo.frameweb.codegenerator

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel

class EntityModelClassGenerator {
	
	EntityModel entityModel
	
	new(EntityModel entityModel) {
		this.entityModel = entityModel
	}
	
	/**
	 * Extrai o pacote de dominio do modelo de entidades
	 */
	def private getDomainPackage(EntityModel entityModel) {
		val domainPackage = entityModel
			.eContents()
			.findFirst[it instanceof DomainPackage]
		
		if (domainPackage !== null) (domainPackage as DomainPackage) else null
	}
	
	/**
	 * Extrai as classes do dominio do pacote de dominio do modelo de entidades
	 */
	def private getDomainClasses(DomainPackage domainPackage) {
		domainPackage
			.eContents
			.filter[it instanceof DomainClass]
			.map[it as DomainClass]
			.toList
	}
	
	/**
	 * Extrai a superclasse de uma classe de dominio
	 * 
	 * Obs: Isso ainda nao funciona no frameweb editor, logo acredite em forcas maiores de que
	 * este metodo esta funcionando plenamente
	 */
	def private getGeneralization(DomainClass domainClass) {
		var generalization = domainClass
			.eContents()
			.findFirst[it instanceof DomainGeneralization]
		
		if (generalization !== null) (generalization as DomainGeneralization).generalizationSets.head else null
	}
	
	/**
	 * THE MAGIC
	 */
	def generate() {
		
	}
}
