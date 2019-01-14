package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.StringReader;
import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.ParseException;
import org.apache.velocity.runtime.parser.node.SimpleNode;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

public class EnumerationClassTemplateEngine {

	private Enumeration enumerationClass;
	private ORMTemplate ormTemplate;
	
	public EnumerationClassTemplateEngine(Enumeration enumerationClass, ORMTemplate ormTemplate) {
		this.enumerationClass = enumerationClass;
		this.ormTemplate = ormTemplate;
	}

	public String render() {
		String template = EngineUtils.decode(ormTemplate.getEnumerationClassTemplate());

		RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
		StringReader stringReader = new StringReader(template);		
		Template velocityTemplate = new Template();
		
		try {
			SimpleNode simpleNode = runtimeServices.parse(stringReader, "Generated Class");
			velocityTemplate.setData(simpleNode);
			
		//TODO aplicar um exception adequado para erros de parser no template
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		velocityTemplate.setRuntimeServices(runtimeServices);
		velocityTemplate.initDocument();

		VelocityContext velocityContext = new VelocityContext();
//		TODO ainda e necessario permitir que classes de enumeracao fiquem dentro do pacote de dominio (sirius)
//		Por enquanto ela usa "Entity Model" como pacote
		velocityContext.put("package", enumerationClass.getPackage());
		velocityContext.put("class", enumerationClass);
		velocityContext.put("literals", enumerationClass.getOwnedLiterals());
		velocityContext.put("StringUtils", new StringUtils());
		velocityContext.put("newLine", "\n");
		
		StringWriter stringWriter = new StringWriter();
		velocityTemplate.merge(velocityContext, stringWriter);

		return stringWriter.toString();
	}

}
