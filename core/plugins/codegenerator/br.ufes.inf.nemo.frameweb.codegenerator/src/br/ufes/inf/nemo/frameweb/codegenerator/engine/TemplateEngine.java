package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import org.apache.velocity.VelocityContext;

public interface TemplateEngine {
	
	public TemplateEngineImpl addParameter(String key, Object value);
	public VelocityContext addBasicLibs();
	public String getCode();
	
}
