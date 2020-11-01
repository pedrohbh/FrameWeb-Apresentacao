package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;

public class ProjectProperties {
	
	// @Inject
	private IProject project;
	
	private FrameWebConfiguration configuration;
	
	public ProjectProperties(IProject project) {
		this.project = project;
	}
	
	public void setConfiguration(FrameWebConfiguration configuration) {
		this.configuration = configuration;
	}
	
	public IFolder getSourceFolder() {
		String srcFolderPath = configuration.getSrcPath();
		
		// Caso o diretorio nao tenha sido definido, sera criado um diretorio padrao chamado "src"
		if (srcFolderPath == null || srcFolderPath.isEmpty() || srcFolderPath.isBlank()) {
			srcFolderPath = "src";
		}
		
		IFolder srcFolder = project.getFolder(srcFolderPath);
		
		if (!srcFolder.exists()) {
			try {
				srcFolder.create(true, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return srcFolder;
	}
	
	public IFolder getTemplateFolder() {
		String templateFolderPath = configuration.getFrameworkDefinitionPath();
		IFolder templateFolder = project.getFolder(templateFolderPath);
		
		if (!templateFolder.exists()) {
			System.out.println("Undefined templates");
			// TODO tratamento para o caso de templates indefinidos
		}
		
		return templateFolder;
	}
	
	public IFolder getViewFolder() {
		String viewFolderPath = configuration.getViewPath();
		
		// Caso o diretorio nao tenha sido definido, sera criado um diretorio padrao chamado "views"
		if (viewFolderPath == null || viewFolderPath.isEmpty() || viewFolderPath.isBlank()) {
			viewFolderPath = "views";
		}
		
		IFolder viewFolder = project.getFolder(viewFolderPath);
		
		if (!viewFolder.exists()) {
			try {
				viewFolder.create(true, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		return viewFolder;
	}
	
	public String getTemplate(String name) {
		return IFileUtils.getText(getTemplateFolder().getFile(name));
	}
	
	public String getClassExtension() {
		return configuration.getClassExtension();
	}
	
	public String getPageExtension() {
		return configuration.getPageExtension();
	}
}
