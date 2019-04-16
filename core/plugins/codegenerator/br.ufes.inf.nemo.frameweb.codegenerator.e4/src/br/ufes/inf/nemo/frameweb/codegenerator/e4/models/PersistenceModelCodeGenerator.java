package br.ufes.inf.nemo.frameweb.codegenerator.e4.models;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.classes.ClassCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistenceModel;
import br.ufes.inf.nemo.frameweb.model.frameweb.PersistencePackage;
import br.ufes.inf.nemo.frameweb.utils.IFolderUtils;

public class PersistenceModelCodeGenerator {
	
	private List<PersistencePackage> persistencePackages;
	private DAOTemplate daoTemplate;
	
	/**
	 * 
	 * @param persistenceModel
	 * @param daoTemplate
	 */
	public PersistenceModelCodeGenerator(PersistenceModel persistenceModel, DAOTemplate daoTemplate) {
		persistencePackages = persistenceModel.getOwnedElements()
				.stream()
				.filter(PersistencePackage.class::isInstance)
				.map(PersistencePackage.class::cast)
				.collect(Collectors.toList());
		
		this.daoTemplate = daoTemplate;
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
					.map(daoClass -> new ClassCodeGenerator(daoClass, daoTemplate))
					.forEach(it -> it.generate(package_, diTemplateFolder));
			
			persistencePackage.getOwnedTypes()
					.stream()
					.filter(DAOInterface.class::isInstance)
					.map(DAOInterface.class::cast)
					.map(daoInterface -> new ClassCodeGenerator(daoInterface, daoTemplate))
					.forEach(it -> it.generate(package_, diTemplateFolder));
		});
	}
	
}
