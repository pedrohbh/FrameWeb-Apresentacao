package br.ufes.inf.nemo.frameweb.facet;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public class FrameWebFacetRuntimeDelegate implements IDelegate {

	@Override
	public void execute(IProject project, IProjectFacetVersion version, Object config, IProgressMonitor monitor)
			throws CoreException {

		for (;;) {
			System.out.println(getClass().getCanonicalName());
		}
	}

}
