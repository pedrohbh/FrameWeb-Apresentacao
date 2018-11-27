package br.ufes.inf.nemo.frameweb.codegenerator

import org.eclipse.sirius.tools.api.ui.IExternalJavaAction
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.eclipse.sirius.diagram.DSemanticDiagram
import java.net.URLDecoder

class CodeGenerator implements IExternalJavaAction {

	/**
	 * Verifica se existe um objeto do tipo DSemanticDiagram, fazendo com que seja impossivel
	 * utilizar a geracao de codigo caso nao esteja na raiz do modelo ou o mesmo nao exista.
	 * 
	 * @param selectionsContents
	 * @return Boolean
	 */
	override canExecute(Collection<? extends EObject> selections) {
		selections.exists[it instanceof DSemanticDiagram]
	}

	/**
	 * Onde a magica comeca a acontecer
	 * 
	 * @param selectionsContents
	 * @param parameters
	 */
	override execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		val representation = new MainProjectRepresentation(selections)
		
		val entityModelClassGenerator = new EntityModelClassGenerator(representation.entityModel)
		entityModelClassGenerator.generate()
	}
	
	/**
	 * Decodifica os atributos dos templates do modelo frameweb a partir uma URI
	 */
	def decode(String str) {
		URLDecoder.decode(str, "UTF-8")
	}

}