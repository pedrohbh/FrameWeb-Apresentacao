package br.ufes.inf.nemo.frameweb.codegenerator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import br.ufes.inf.nemo.frameweb.codegenerator.models.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.models.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;

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
		
		ProjectRepresentation representation = new ProjectRepresentation(selections);

		IProject project = IProjectUtils.getSelectedProject();
		
		IFolder srcFolder = project.getFolder("/src");
		IFolder templatesFolder = project.getFolder("/templates");
		IFolder viewsFolder = project.getFolder("/WebContent/WEB-INF");
		
		if (representation.hasEntityModel()) {
			EntityModelCodeGenerator entityModelCodeGenerator = new EntityModelCodeGenerator(
					representation.getEntityModel(),
					representation.getORMTemplate()
			);

			IFolder ormTemplateFolder = templatesFolder.getFolder("/orm");
			entityModelCodeGenerator.generate(srcFolder, ormTemplateFolder);
		}

		if (representation.hasNavigationModel()) {
			NavigationModelCodeGenerator navigationModelCodeGenerator = new NavigationModelCodeGenerator(
					representation.getNavigationModel(),
					representation.getFrontControllerTemplate()
			);

			IFolder frontControllerTemplateFolder = templatesFolder.getFolder("/frontController");
			navigationModelCodeGenerator.generate(srcFolder, frontControllerTemplateFolder);
			
			navigationModelCodeGenerator.generateViews(viewsFolder, frontControllerTemplateFolder);
		}
	}

}