package br.ufes.inf.nemo.frameweb.codegenerator.e4.engine;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;

public class JtwigTemplateEngineImpl implements TemplateEngine {

	private JtwigTemplate jtwigTemplate;
	private JtwigModel jtwigModel;

	public void setTemplate(String template) {
		jtwigTemplate = JtwigTemplate.inlineTemplate(template);
		jtwigModel = JtwigModel.newModel();
	}

	public TemplateEngine addParameter(String key, Object value) {
		jtwigModel.with(key, value);
		
		return this;
	}

	public String getCode() {
		return jtwigTemplate.render(jtwigModel);
	}

}