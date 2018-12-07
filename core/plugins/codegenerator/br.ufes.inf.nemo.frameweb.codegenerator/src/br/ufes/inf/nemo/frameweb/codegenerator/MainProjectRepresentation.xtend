package br.ufes.inf.nemo.frameweb.codegenerator

import java.util.Collection
import org.eclipse.emf.ecore.EObject
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel
import org.eclipse.sirius.diagram.DSemanticDiagram
import org.eclipse.sirius.diagram.DNodeContainer
import org.eclipse.sirius.viewpoint.DRepresentationElement
import java.util.List
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage

class MainProjectRepresentation {
	
	List<EObject> packages

	/**
	 * Mantem uma lista contendo (genericamente) apenas os elementos visuais do modelo frameweb:
	 * Navigation Model, Entity Model, Persistence Model, Application Model e Templates.
	 * 
	 * @param selections
	 */
	new(Collection<? extends EObject> selections) {
		packages = selections
			.findFirst[it instanceof DSemanticDiagram]
			.eAllContents()
			.filter[it instanceof DNodeContainer]
			.map[it as DRepresentationElement]
			.map[it.target]
			.toList()
	}
	
	/**
	 * Retorna todos os packages referentes a Models e Profiles (nao filtrados)
	 */
	def getPackages() {
		packages
			.filter[it instanceof org.eclipse.uml2.uml.Package]
			.map[it as org.eclipse.uml2.uml.Package]
			.toList()
	}
	
	/**
	 * Retorna apenas FrameworkProfiles (templates)
	 */
	def getFrameworkProfiles() {
		packages
			.filter[it instanceof FrameworkProfile]
			.map[it as FrameworkProfile]
			.toList()
	}

	/**
	 * Retorna apenas FramewebModels (entity, application, persistence e navigation)
	 */
	def getFramewebModels() {
		packages
			.filter[it instanceof FramewebModel]
			.map[it as FramewebModel]
			.toList()
	}
	
	/**
	 * Retorna o template do controlador frontal do modelo frameweb
	 */
	def getFrontControllerTemplate() {
		val frontController = frameworkProfiles
			.findFirst[it instanceof FrontControllerTemplate]

		if (frontController !== null) (frontController as FrontControllerTemplate) else null
	}

	/**
	 * Retorna o template do framework de orm do modelo frameweb
	 */
	def getORMTemplate() {
		val orm = frameworkProfiles
			.findFirst[it instanceof ORMTemplate]
			
		if (orm !== null) (orm as ORMTemplate) else null
	}
	
	/**
	 * Retorna o modelo de entidades do modelo frameweb a qual possui um pacote de dominio,
	 * isso serve para que a definicao da linguagem de programacao nao seja inclusa.
	 * 
	 * Obs: pq raios a definicao da linguagem eh um modelo de entidades?
	 */
	def getEntityModel() {
		val entityModel = framewebModels
			.filter[it instanceof EntityModel]
			.findFirst[it.eContents.exists[it instanceof DomainPackage]]
			
		if (entityModel !== null) (entityModel as EntityModel) else null
	}
	
	/**
	 * Retorna o modelo de navegacao do modelo frameweb
	 */
	def getNavigationModel() {
		val navigationModel = framewebModels
			.filter[it instanceof NavigationModel]
			.findFirst[it.eContents.exists[it instanceof ControllerPackage]]
			
		if (navigationModel !== null) (navigationModel as NavigationModel) else null
	}
}