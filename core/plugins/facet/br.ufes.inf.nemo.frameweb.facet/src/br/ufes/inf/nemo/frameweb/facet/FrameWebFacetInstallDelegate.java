package br.ufes.inf.nemo.frameweb.facet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public class FrameWebFacetInstallDelegate implements IDelegate {

	@Override
	public void execute(IProject project, IProjectFacetVersion version, Object config, IProgressMonitor monitor)
			throws CoreException {

		/**
		 * A barra de carregamento tera tres estagios, adicao da natureza do Sirius, criacao do .aird e
		 * a criacao do arquivo principal .frameweb
		 */
		monitor.beginTask("", 3);

		FrameWebFacet frameWebFacet = new FrameWebFacet(project);

		try {
			frameWebFacet.addSiriusModelingNature();

			monitor.worked(1);

			frameWebFacet.createRepresentationsFile();

			monitor.worked(1);
			
			frameWebFacet.createFrameWebFile();

			monitor.worked(1);

		} finally {
			monitor.done();
		}
	}
}
