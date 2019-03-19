package br.ufes.inf.nemo.frameweb.codegenerator.engine;

public interface TemplateEngine {
	
	public void setTemplate(String template);
	public TemplateEngine addParameter(String key, Object value);
	public TemplateEngine addBasicLibs();
	public String getCode();
	
}
