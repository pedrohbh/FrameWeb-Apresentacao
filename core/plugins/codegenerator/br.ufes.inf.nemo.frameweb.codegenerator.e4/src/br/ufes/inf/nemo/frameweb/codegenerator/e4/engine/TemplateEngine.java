package br.ufes.inf.nemo.frameweb.codegenerator.e4.engine;

public interface TemplateEngine {
	
	/**
	 * 
	 * @param template
	 */
	public void setTemplate(String templatePath);
	
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
	public String getCode();

}
