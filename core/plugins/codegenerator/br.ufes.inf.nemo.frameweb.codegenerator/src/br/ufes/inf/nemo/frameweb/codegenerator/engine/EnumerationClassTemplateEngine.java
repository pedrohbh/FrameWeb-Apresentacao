package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.StringWriter;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
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

		Template velocityTemplate = EngineUtils.prepareVelocityTemplate(template);

		VelocityContext velocityContext = new VelocityContext();
//		TODO ainda e necessario permitir que classes de enumeracao fiquem dentro do pacote de dominio (sirius)
//		Por enquanto ela usa "Entity Model" como pacote, logo nao funcionam
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
