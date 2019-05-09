package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerTemplate;

public class DiagramRepresentation {
	
	private List<EObject> siriusPackages;
	private List<FramewebModel> framewebModels;
	private List<FrameworkProfile> frameworkProfiles;
	
	/**
	 * 
	 * @param selections
	 */
	public DiagramRepresentation(Collection<? extends EObject> selections) {
		DSemanticDiagram dSemanticDiagram = selections
				.stream()
				.filter(DSemanticDiagram.class::isInstance)
				.map(DSemanticDiagram.class::cast)
				.findFirst()
				.get();
		
		siriusPackages = dSemanticDiagram.eContents()
				.stream()
				.filter(DNodeContainer.class::isInstance)
				.map(DRepresentationElement.class::cast)
				.map(DRepresentationElement::getTarget)
				.collect(Collectors.toList());
		
		framewebModels = siriusPackages
				.stream()
				.filter(FramewebModel.class::isInstance)
				.map(FramewebModel.class::cast)
				.collect(Collectors.toList());
		
		frameworkProfiles = siriusPackages
				.stream()
				.filter(FrameworkProfile.class::isInstance)
				.map(FrameworkProfile.class::cast)
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @return
	 */
	public FrontControllerTemplate getFrontControllerTemplate() {
		try {
			FrontControllerTemplate frontControllerTemplate = frameworkProfiles
					.stream()
					.filter(FrontControllerTemplate.class::isInstance)
					.map(FrontControllerTemplate.class::cast)
					.findFirst()
					.get();
			
			return frontControllerTemplate;
			
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	public boolean hasFrontControllerTemplate() {
		return getFrontControllerTemplate() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public RestControllerTemplate getRestControllerTemplate() {
		try {
			RestControllerTemplate restControllerTemplate = frameworkProfiles
					.stream()
					.filter(RestControllerTemplate.class::isInstance)
					.map(RestControllerTemplate.class::cast)
					.findFirst()
					.get();
			
			return restControllerTemplate;
			
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	public boolean hasRestControllerTemplate() {
		return getRestControllerTemplate() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public ORMTemplate getORMTemplate() {
		try {
			ORMTemplate ormTemplate = frameworkProfiles
					.stream()
					.filter(ORMTemplate.class::isInstance)
					.map(ORMTemplate.class::cast)
					.findFirst()
					.get();
		
			return ormTemplate;
			
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasORMTemplate() {
		return getORMTemplate() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public DITemplate getDITemplate() {
		try {
			DITemplate diTemplate = frameworkProfiles
					.stream()
					.filter(DITemplate.class::isInstance)
					.map(DITemplate.class::cast)
					.findFirst()
					.get();
			
			return diTemplate;
			
		} catch (NullPointerException | NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasDITemplate() {
		return getDITemplate() != null;
	}

	/**
	 * 
	 * @return
	 */
	public DAOTemplate getDAOTemplate() {
		try {
			DAOTemplate daoTemplate = frameworkProfiles
					.stream()
					.filter(DAOTemplate.class::isInstance)
					.map(DAOTemplate.class::cast)
					.findFirst()
					.get();
			
			return daoTemplate;
			
		} catch (NullPointerException | NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasDAOTemplate() {
		return getDAOTemplate() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public EntityModel getEntityModel() {
		try {
			EntityModel entityModel = framewebModels
					.stream()
					.filter(EntityModel.class::isInstance)
					.filter(model -> {
							boolean hasDomainPackage = model.eContents()
									.stream()
									.anyMatch(DomainPackage.class::isInstance);
			
							return hasDomainPackage;
					})
					.map(EntityModel.class::cast)
					.findFirst()
					.get();
			
			return entityModel;
			
		} catch (NullPointerException | IndexOutOfBoundsException | NoSuchElementException e) {
			return null;
		}

	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasEntityModel() {
		return getEntityModel() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public NavigationModel getNavigationModel() {
		try {
			NavigationModel navigationModel = framewebModels
					.stream()
					.filter(NavigationModel.class::isInstance)
					.filter(model -> {
						boolean hasControllerPackage = model.eContents()
								.stream()
								.anyMatch(ControllerPackage.class::isInstance);
						
						return hasControllerPackage;
					})
					.map(NavigationModel.class::cast)
					.findFirst()
					.get();
			
			return navigationModel;
			
		} catch (NullPointerException | IndexOutOfBoundsException | NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasNavigationModel() {
		return getNavigationModel() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public PersistenceModel getPersistenceModel() {
		try {
			PersistenceModel persistenceModel = framewebModels
					.stream()
					.filter(PersistenceModel.class::isInstance)
					.filter(model -> {
						boolean hasPersistencePackage = model.eContents()
								.stream()
								.anyMatch(PersistencePackage.class::isInstance);
						
						return hasPersistencePackage;
					})
					.map(PersistenceModel.class::cast)
					.findFirst()
					.get();
			
			return persistenceModel;
			
		} catch (NullPointerException | IndexOutOfBoundsException | NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasPersistenceModel() {
		return getPersistenceModel() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public ApplicationModel getApplicationModel() {
		try {
			ApplicationModel applicationModel = framewebModels
					.stream()
					.filter(ApplicationModel.class::isInstance)
					.filter(model -> {
						boolean hasApplicationPackage = model.eContents()
								.stream()
								.anyMatch(ApplicationPackage.class::isInstance);
						
						return hasApplicationPackage;
					})
					.map(ApplicationModel.class::cast)
					.findFirst()
					.get();
			
			return applicationModel;
			
		} catch (NullPointerException | IndexOutOfBoundsException | NoSuchElementException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasApplicationModel() {
		return getApplicationModel() != null;
	}
	
	/**
	 * 
	 * @return
	 */
	public FrameWebConfiguration getFrameWebConfiguration() {
		try {
			FrameWebConfiguration fwConfig = frameworkProfiles
					.stream()
					.filter(FrameWebConfiguration.class::isInstance)
					.map(FrameWebConfiguration.class::cast)
					.findFirst()
					.get();
			
			return fwConfig;
			
		} catch (NullPointerException | NoSuchElementException e) {
			return null;
		}
	}

}
