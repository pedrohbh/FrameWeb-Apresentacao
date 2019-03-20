package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.StringReader;
import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class TemplateEngineImpl implements TemplateEngine{
	
	private StringReader stringReaderTemplate;
	private VelocityContext velocityContext;
	
	public TemplateEngineImpl() {
		this.velocityContext = new VelocityContext();
	}
	
	public void setTemplate(String template) {
		this.stringReaderTemplate = new StringReader(template);
	}
	
	public TemplateEngine addParameter(String key, Object value) {		
		velocityContext.put(key, value);
		return this;
	}
	
	public String getCode() {
		StringWriter stringWriter = new StringWriter();
		Velocity.evaluate(velocityContext, stringWriter, ""/*Velocity.getLog().toString()*/, stringReaderTemplate);

		return stringWriter.toString();
	}

	public TemplateEngine addBasicLibs() {
		velocityContext.put("STRING", new StringUtils());
		velocityContext.put("NULL", new NullUtils());
		velocityContext.put("NEWLINE", System.getProperty("line.separator"));
		velocityContext.put("WHITESPACE", " ");
		velocityContext.put("TAB", "	");
		return this;
	}
	
}
