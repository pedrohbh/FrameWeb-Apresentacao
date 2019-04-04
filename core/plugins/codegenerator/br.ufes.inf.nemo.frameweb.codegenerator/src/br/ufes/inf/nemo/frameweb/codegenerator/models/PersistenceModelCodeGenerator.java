package br.ufes.inf.nemo.frameweb.codegenerator.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class PersistenceModelCodeGenerator {
	
	private List<PersistencePackage> persistencePackages;
	private DITemplate diTemplate;
	
	/**
	 * 
	 * @param persistenceModel
	 * @param diTemplate
	 */
	public PersistenceModelCodeGenerator(PersistenceModel persistenceModel, DITemplate diTemplate) {
		persistencePackages = persistenceModel.getOwnedElements()
				.stream()
				.filter(PersistencePackage.class::isInstance)
				.map(PersistencePackage.class::cast)
				.collect(Collectors.toList());
		
		this.diTemplate = diTemplate;
	}
	
	/**
	 * 
	 * @param srcFolder
	 * @param diTemplateFolder
	 */
	public void generate(IFolder srcFolder, IFolder diTemplateFolder) {
		persistencePackages.forEach(persistencePackage -> {
			String packagePath = IFolderUtils.packageNameToPath(persistencePackage.getName());

			IFolderUtils.makeDirectory(srcFolder, packagePath);
			
			IFolder package_ = srcFolder.getFolder(packagePath);

			persistencePackage.getOwnedTypes()
					.stream()
					.filter(DAOClass.class::isInstance)
					.map(DAOClass.class::cast)
					.map(daoClass -> new ClassCodeGenerator(
							daoClass,
							diTemplate))
					.forEach(it -> it.generate(package_, diTemplateFolder));
		});
	}
	
}
