package br.ufes.inf.nemo.frameweb.codegenerator;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.EntityModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

public class ProjectRepresentation {
	
	private List<EObject> packages;
	
	/**
	 * 
	 * @param selections
	 */
	public ProjectRepresentation(Collection<? extends EObject> selections) {
		DSemanticDiagram dSemanticDiagram = selections
				.stream()
				.filter(DSemanticDiagram.class::isInstance)
				.map(DSemanticDiagram.class::cast)
				.findFirst()
				.get();
		
		packages = dSemanticDiagram.eContents()
				.stream()
				.filter(DNodeContainer.class::isInstance)
				.map(DRepresentationElement.class::cast)
				.map(DRepresentationElement::getTarget)
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @return
	 */
	public List<FrameworkProfile> getFrameworkProfiles() {
		List<FrameworkProfile> frameworkProfile = packages
				.stream()
				.filter(FrameworkProfile.class::isInstance)
				.map(FrameworkProfile.class::cast)
				.collect(Collectors.toList());
		
		return frameworkProfile;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<FramewebModel> getFramewebModels() {
		List<FramewebModel> framewebModel = packages
				.stream()
				.filter(FramewebModel.class::isInstance)
				.map(FramewebModel.class::cast)
				.collect(Collectors.toList());
		
		return framewebModel;
	}

	/**
	 * 
	 * @return
	 */
	public FrontControllerTemplate getFrontControllerTemplate() {
		List<FrameworkProfile> frameworkProfiles = getFrameworkProfiles();
		
		try {
			FrontControllerTemplate frontrControllerTemplate = frameworkProfiles
					.stream()
					.filter(FrontControllerTemplate.class::isInstance)
					.map(FrontControllerTemplate.class::cast)
					.findFirst()
					.get();
			
			return frontrControllerTemplate;
			
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public ORMTemplate getORMTemplate() {
		List<FrameworkProfile> frameworkProfiles = getFrameworkProfiles();
	
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
	public EntityModel getEntityModel() {
		List<FramewebModel> framewebModels = getFramewebModels();

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
		List<FramewebModel> framewebModels = getFramewebModels();
		
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

}
