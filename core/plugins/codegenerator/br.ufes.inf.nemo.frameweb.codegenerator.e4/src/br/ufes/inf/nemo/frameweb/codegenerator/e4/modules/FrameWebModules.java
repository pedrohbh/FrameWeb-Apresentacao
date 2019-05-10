package br.ufes.inf.nemo.frameweb.codegenerator.e4.modules;

import org.eclipse.core.resources.IProject;

import com.google.inject.AbstractModule;

import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;

public class FrameWebModules extends AbstractModule {

	@Override
	protected void configure() {
		bind(IProject.class).toInstance(IProjectUtils.getSelectedProject());
	}

}
