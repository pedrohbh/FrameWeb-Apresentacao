package br.ufes.inf.nemo.frameweb.codegenerator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import br.ufes.inf.nemo.frameweb.codegenerator.entity.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.navigation.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class CodeGenerator implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		boolean canExecute = selections
			.stream()
			.anyMatch(DSemanticDiagram.class::isInstance);
		
		return canExecute;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		IProject project = ProjectUtils.getSelectedProject();
//		TODO permitir que o usuario selecione o diretorio de codigo fonte (textualmente ou por interface grafica)
		IFolder srcFolder = project.getFolder("src");
//		TODO permitir que o usuario selecione o diretorio da view (textualmente ou por interface grafica)
//		IFolder viewFolder = project.getFolder("view")
		
		ProjectRepresentation representation = new ProjectRepresentation(selections);
		
		if (representation.hasEntityModel()) {
			EntityModelCodeGenerator entityModelCodeGenerator = new EntityModelCodeGenerator(
					representation.getEntityModel(),
					representation.getORMTemplate()
			);
			
			entityModelCodeGenerator.generate(srcFolder);
		}
	
		if (representation.hasNavigationModel()) {
			NavigationModelCodeGenerator navigationModelCodeGenerator = new NavigationModelCodeGenerator(
					representation.getNavigationModel(),
					representation.getFrontControllerTemplate()
			);
			
			navigationModelCodeGenerator.generate(srcFolder, null);
		}
	}

}