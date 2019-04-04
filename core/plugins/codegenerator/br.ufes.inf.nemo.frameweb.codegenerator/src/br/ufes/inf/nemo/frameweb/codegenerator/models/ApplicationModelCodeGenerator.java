package br.ufes.inf.nemo.frameweb.codegenerator.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.ApplicationPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class ApplicationModelCodeGenerator {
	
	private List<ApplicationPackage> applicationPackages;
	private DITemplate diTemplate;
	
	/**
	 * 
	 * @param applicationModel
	 * @param diTemplate
	 */
	public ApplicationModelCodeGenerator(ApplicationModel applicationModel, DITemplate diTemplate) {
		applicationPackages = applicationModel.getOwnedElements()
				.stream()
				.filter(ApplicationPackage.class::isInstance)
				.map(ApplicationPackage.class::cast)
				.collect(Collectors.toList());
		
		this.diTemplate = diTemplate;
	}
	
	/**
	 * 
	 * @param srcFolder
	 * @param diTemplateFolder
	 */
	public void generate(IFolder srcFolder, IFolder diTemplateFolder) {
		applicationPackages.forEach(applicationPackage -> {
			String packagePath = IFolderUtils.packageNameToPath(applicationPackage.getName());

			IFolderUtils.makeDirectory(srcFolder, packagePath);
			
			IFolder package_ = srcFolder.getFolder(packagePath);

			applicationPackage.getOwnedTypes()
					.stream()
					.filter(ServiceClass.class::isInstance)
					.map(ServiceClass.class::cast)
					.map(serviceClass -> new ClassCodeGenerator(
							serviceClass,
							diTemplate))
					.forEach(it -> it.generate(package_, diTemplateFolder));
		});
	}
}
