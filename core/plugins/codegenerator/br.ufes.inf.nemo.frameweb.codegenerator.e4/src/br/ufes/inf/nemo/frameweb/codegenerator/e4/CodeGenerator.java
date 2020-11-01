package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.ApplicationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.ModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.NavigationModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.models.PersistenceModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;

public class CodeGenerator implements IExternalJavaAction {
	
	private ProjectProperties projectProperties;
	
	/*
	 * O Google Guice apresentou problemas ao ser importado em outras maquinas, provavelmente
	 * o repositorio dele esteja com problemas, portanto precisamos passar o IProject atual
	 * como parametro.
	 */
	public CodeGenerator() {
		// Injector injector = Guice.createInjector(new FrameWebModule());
		// projectProperties = injector.getInstance(ProjectProperties.class);
		projectProperties = new ProjectProperties(IProjectUtils.getSelectedProject());
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		boolean canExecute = selections
			.stream()
			.anyMatch(DSemanticDiagram.class::isInstance);
		
		return canExecute;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		DiagramRepresentation diagram = new DiagramRepresentation(selections);

		projectProperties.setConfiguration(diagram.getFrameWebConfiguration());
		
		if (diagram.hasEntityModel() && diagram.hasORMTemplate()) {
			EntityModel model = diagram.getEntityModel();
			ORMTemplate template = diagram.getORMTemplate();
			
			ModelCodeGenerator entityModelCodeGenerator = 
					new EntityModelCodeGenerator(model, template, projectProperties);

			entityModelCodeGenerator.generate();
		}
		
		if (diagram.hasApplicationModel() && diagram.hasDITemplate()) {
			ApplicationModel model = diagram.getApplicationModel();
			DITemplate template = diagram.getDITemplate();
			
			ModelCodeGenerator applicationModelCodeGenerator = 
					new ApplicationModelCodeGenerator(model, template, projectProperties);
			
			applicationModelCodeGenerator.generate();
		}
		
		if (diagram.hasPersistenceModel() && diagram.hasDAOTemplate()) {
			PersistenceModel model = diagram.getPersistenceModel();
			DAOTemplate template = diagram.getDAOTemplate();
			
			ModelCodeGenerator persistenceModelCodeGenerator = 
					new PersistenceModelCodeGenerator(model, template, projectProperties);
		
			persistenceModelCodeGenerator.generate();
		}
		
		if (diagram.hasNavigationModel() && diagram.hasFrontControllerTemplate()) {
			NavigationModel model = diagram.getNavigationModel();
			FrontControllerTemplate template = diagram.getFrontControllerTemplate();
			
			ModelCodeGenerator navigationModelCodeGenerator =
					new NavigationModelCodeGenerator(model, template, projectProperties);

			navigationModelCodeGenerator.generate();
		}
	}

}