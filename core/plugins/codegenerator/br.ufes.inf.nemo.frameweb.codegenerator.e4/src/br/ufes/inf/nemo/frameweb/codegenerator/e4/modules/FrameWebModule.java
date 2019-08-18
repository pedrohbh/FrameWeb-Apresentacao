package br.ufes.inf.nemo.frameweb.codegenerator.e4.modules;

import org.eclipse.core.resources.IProject;

// import com.google.inject.AbstractModule;

import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;

/*
 * Essa classe funciona como o modulo de configuracao para injecao de dependencias do
 * Google Guice, mas como o mesmo apresentou problemas apos um bom tempo de uso, deixamos
 * de utiliza-la.
 * 
 * A ideia eh que futuramente utilize o Eclipse E4 e a injecao de dependencias nativa da IDE,
 * assim descartando completamente o Google Guice.
 */
@SuppressWarnings("all")
public class FrameWebModule { // extends AbstractModule {

	// @Override
	protected void configure() {
		// bind(IProject.class).toInstance(IProjectUtils.getSelectedProject());
	}

}
