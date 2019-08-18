package br.ufes.inf.nemo.frameweb.codegenerator.e4.engine;

import org.jtwig.JtwigModel;
import org.jtwig.JtwigTemplate;
import org.jtwig.environment.EnvironmentConfiguration;
import org.jtwig.environment.EnvironmentConfigurationBuilder;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;

import br.ufes.inf.nemo.frameweb.utils.StringUtils;

public class JtwigTemplateEngineImpl implements TemplateEngine {

	private JtwigTemplate jtwigTemplate;
	private JtwigModel jtwigModel;

	public void setTemplate(String template) {
		/*
		 * Metodo extra no Jtwig para transformar nomes de classes em variaveis de mesmo nome,
		 * porem em camel case. 
		 */
		EnvironmentConfiguration configuration = EnvironmentConfigurationBuilder
			.configuration()
				.functions()
					.add(new SimpleJtwigFunction() {
						@Override
						public Object execute(FunctionRequest args) {
							String str = new StringUtils()
								.toLower(args
									.getEnvironment()
									.getValueEnvironment()
									.getStringConverter()
									.convert(args.get(0)), 0);
							
							return str;
						}

						@Override
						public String name() {
							return "lower_first";
						}
					})
				.and()
			.build();
		
		jtwigTemplate = JtwigTemplate.inlineTemplate(template, configuration);
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
