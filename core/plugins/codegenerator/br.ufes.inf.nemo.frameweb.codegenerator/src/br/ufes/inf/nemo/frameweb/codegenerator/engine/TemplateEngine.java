package br.ufes.inf.nemo.frameweb.codegenerator.engine;

public interface TemplateEngine {
	
	/**
	 * 
	 * @param template
	 */
	public void setTemplate(String template);
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public TemplateEngine addParameter(String key, Object value);
	
	/**
	 * 
	 * @return
	 */
	public TemplateEngine addBasicLibs();

	/**
	 * 
	 * @return
	 */
	public String getCode();
	
}
