package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.ViewPackage;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class NavigationModelCodeGenerator {

	private List<ControllerPackage> controllerPackages;
	private List<ViewPackage> viewPackages;
	private FrontControllerTemplate frontControllerTemplate;

	/**
	 * @param navigationModel
	 * @param frontControllerTemplate
	 */
	public NavigationModelCodeGenerator(NavigationModel navigationModel, FrontControllerTemplate frontControllerTemplate) {
		controllerPackages = navigationModel.getOwnedElements()
				.stream()
				.filter(ControllerPackage.class::isInstance)
				.map(ControllerPackage.class::cast)
				.collect(Collectors.toList());
		
		viewPackages = navigationModel.getOwnedElements()
				.stream()
				.filter(ViewPackage.class::isInstance)
				.map(ViewPackage.class::cast)
				.collect(Collectors.toList());
		
		this.frontControllerTemplate = frontControllerTemplate;
	}

	/**
	 * 
	 * @param srcFolder
	 */
	public void generate(IFolder srcFolder, IFolder frontControllerTemplateFolder) {
		controllerPackages.forEach(controllerPackage -> {
			String packagePath = IFolderUtils.packageNameToPath(controllerPackage.getName());

			IFolderUtils.makeDirectory(srcFolder, packagePath);
			
			IFolder package_ = srcFolder.getFolder(packagePath);

			controllerPackage.getOwnedTypes()
					.stream()
					.filter(FrontControllerClass.class::isInstance)
					.map(FrontControllerClass.class::cast)
					.map(frontControllerClass -> new ClassCodeGenerator(frontControllerClass, frontControllerTemplate))
					.forEach(it -> it.generate(package_, frontControllerTemplateFolder));
		});
	}
	
	/**
	 * 
	 * @param viewFolder
	 * @param templateFolder 
	 */
	public void generateViews(IFolder viewFolder, IFolder frontControllerFolder) {
		viewPackages.forEach(viewPackage -> {
			viewPackage.getOwnedTypes()
					.stream()
					.filter(Page.class::isInstance)
					.map(Page.class::cast)
					.map(page -> new ClassCodeGenerator(page, frontControllerTemplate))
					.forEach(it -> it.generate(viewFolder, frontControllerFolder));
		});
	}

}
