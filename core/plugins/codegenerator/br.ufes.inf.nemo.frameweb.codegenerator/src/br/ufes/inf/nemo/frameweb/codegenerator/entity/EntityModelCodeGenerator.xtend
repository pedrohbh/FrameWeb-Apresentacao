package br.ufes.inf.nemo.frameweb.codegenerator.entity

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

		iterator = domainClasses.iterator()
	}

	override hasNext() {
		iterator.hasNext()
	}

	override next() {
		iterator.next().generate()
	}

}
