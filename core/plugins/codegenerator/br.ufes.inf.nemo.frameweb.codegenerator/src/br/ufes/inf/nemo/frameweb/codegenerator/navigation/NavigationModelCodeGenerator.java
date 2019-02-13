package br.ufes.inf.nemo.frameweb.codegenerator.navigation;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.model.frameweb.ControllerPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationModel;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class NavigationModelCodeGenerator {

	private List<ControllerPackage> controllerPackages;
	private FrontControllerTemplate frontControllerTemplate;

	/**
	 * @param navigationModel
	 * @param frontControllerTemplate
	 */
	public NavigationModelCodeGenerator(NavigationModel navigationModel,
			FrontControllerTemplate frontControllerTemplate) {
		
		controllerPackages = navigationModel.getOwnedElements()
				.stream()
				.filter(ControllerPackage.class::isInstance)
				.map(ControllerPackage.class::cast)
				.collect(Collectors.toList());
		
		this.frontControllerTemplate = frontControllerTemplate;
	}

	/**
	 * Gera as classes do modelo de navegacao dentro de um dado diretorio (pacote)
	 * 
	 * @param srcFolder
	 */
	public void generate(IFolder srcFolder) {
		
		controllerPackages.forEach(controllerPackage -> {
			String packagePath = controllerPackage.getName().replaceAll("[^A-Za-z0-9]", "/");

			ProjectUtils.makeDirectory(srcFolder, packagePath);

			IFolder package_ = srcFolder.getFolder(packagePath);

			controllerPackage.getOwnedTypes()
					.stream()
					.filter(FrontControllerClass.class::isInstance)
					.map(FrontControllerClass.class::cast)
					.map(frontControllerClass -> new FrontControllerClassCodeGenerator(
							frontControllerClass, frontControllerTemplate))
					.forEach(it -> it.generate(package_));
		});
	}

}
