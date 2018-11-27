package br.ufes.inf.nemo.frameweb.facet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public class FrameWebFacetUninstallDelegate implements IDelegate {

	@Override
	public void execute(IProject project, IProjectFacetVersion version, Object config, IProgressMonitor monitor)
			throws CoreException {
		
		/**
		 * A barra de carregamento tera dois estagios, remocao da natureza do Sirius e remocao do arquivo .aird
		 * 
		 * Obs: a decidir sobre remover ou nao o arquivo .aird
		 */
		monitor.beginTask("", 2);
		
		FrameWebFacet webProject = new FrameWebFacet(project);
		
		try {
			webProject.removeSiriusModelingNature();
			
			monitor.worked(1);
			
			/**
			 * Revisar se remover o representation.aird eh realmente necessario
			 */
			webProject.removeRepresentationsFile();
			
			monitor.worked(1);
			
		} finally {
			monitor.done();
		}
	}
}
