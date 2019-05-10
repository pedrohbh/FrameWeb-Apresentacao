package br.ufes.inf.nemo.frameweb.codegenerator.e4;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

import com.google.inject.Inject;

import br.ufes.inf.nemo.frameweb.model.frameweb.FrameWebConfiguration;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;

public class ProjectConfiguration {
	
	@Inject
	private IProject project;
	
	private FrameWebConfiguration configuration;
	
	public void setConfiguration(FrameWebConfiguration configuration) {
		this.configuration = configuration;
	}
	
	public IFolder getSourceFolder() {
		String srcFolderPath = configuration.getSrcPath();
		IFolder srcFolder = project.getFolder(srcFolderPath);
		
		return srcFolder;
	}
	
	public IFolder getTemplateFolder() {
		String templateFolderPath = configuration.getTemplatePath();
		IFolder templateFolder = project.getFolder(templateFolderPath);
		
		return templateFolder;
	}
	
	public IFolder getViewFolder() {
		String viewFolderPath = configuration.getViewPath();
		
		IFolder viewFolder = project.getFolder(viewFolderPath);
		
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
