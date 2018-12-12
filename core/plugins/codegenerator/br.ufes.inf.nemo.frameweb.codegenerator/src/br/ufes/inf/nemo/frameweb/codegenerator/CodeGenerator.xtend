package br.ufes.inf.nemo.frameweb.codegenerator

import br.ufes.inf.nemo.frameweb.codegenerator.entity.EntityModelCodeGenerator
import java.util.Collection
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.sirius.diagram.DSemanticDiagram
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction
import org.eclipse.ui.PlatformUI
import org.eclipse.core.resources.IProject
import org.eclipse.ui.IEditorInput
import org.eclipse.core.resources.IResource
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbenchPage

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
		
		val entityModel = new EntityModelCodeGenerator(
			representation.getEntityModel(),
			representation.getORMTemplate()
		)
		
		entityModel
			.toIterable()
			.forEach[println(it)]
			
		println(getProject().getName())
	}
	
	/**
	 * Extrai o projeto atual que esta selecionado no Eclipse
	 */
	def getProject() {		
	    val IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	    val IWorkbenchPage activePage = window.getActivePage();
		val IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor !== null) {
			val IEditorInput input = activeEditor.getEditorInput();
			val IProject project = input.getAdapter(IProject);
			
			if (project === null) {
				val IResource resource = input.getAdapter(IResource);
				
				if (resource !== null) {
					return resource.getProject();
				}
			}
		}
		
		return null;
	}

}