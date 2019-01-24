package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.ParseException;
import org.apache.velocity.runtime.parser.node.SimpleNode;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;

import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;

public class FramewebTemplateEngine {

	public static String render(Class class_, FrameworkProfile frameworkTemplate) {
		
//		Caso nao haja um template definido para a classe em questao
		if (frameworkTemplate == null) {
			return null;
		}
		
		if (class_ instanceof DomainClass) {
			String generatedCode = renderDomainClass(
					(DomainClass) class_,
					(ORMTemplate) frameworkTemplate
			);
			
			return generatedCode;
			
		} else if (class_ instanceof NavigationClass) {
			/* code */
			return null;
			
		} else if (class_ instanceof DAOClass) {
			/* code */
			return null;
			
		} else if (class_ instanceof ServiceClass) {
			/* code */
			return null;
			
		} else {
//			Classe de entrada invalida
			throw new IllegalArgumentException();
		}
		
	}

/* WARNING!!
 * 
 * UGLY CODE BELOW
 * 
 */
	public static String renderDomainClass(DomainClass domainClass, ORMTemplate ormTemplate) {
		
		String template = EngineUtils.decode(ormTemplate.getClassTemplate());
		
		Template velocityTemplate = prepareVelocityTemplate(template);

		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("class", domainClass);
		
		/* O objeto 'class' fornece todos os atributos e metodos necessarios para
		 * a criacao do template, mas alguns 'alias' sao permitidos com a intencao de
		 * facilitar a vida do dev
		 */
		velocityContext.put("package", domainClass.getPackage());
		velocityContext.put("attributes", domainClass.getAttributes());
		velocityContext.put("methods", domainClass.getOperations()
				.stream()
				.filter(DomainMethod.class::isInstance)
				.map(DomainMethod.class::cast)
				.collect(Collectors.toList())
		);
		
		/* Refazer uma analise sobre as generalizacoes com o Vitor */
		try {
			List<Generalization> generalizations = domainClass.getGeneralizations();
			List<GeneralizationSet> generalizationSets = generalizations.get(0).getGeneralizationSets();
			GeneralizationSet generalizationSet = generalizationSets.get(0);
			
			velocityContext.put("generalization", generalizationSet);
			
		} catch (NullPointerException | IndexOutOfBoundsException e) {
			velocityContext.put("generalization", null);
		}
		
		velocityContext.put("STRING", new StringUtils());
		velocityContext.put("NEWLINE", "\n");
		velocityContext.put("ID", EngineUtils.decode(ormTemplate.getIdAttributeTemplate()));
//		velocityContext.put("EMBEDDED", EngineUtils.decode(ormTemplate.getEmbeddedAttributeTemplate()));
//		velocityContext.put("VERSION", EngineUtils.decode(ormTemplate.getVersionAttributeTemplate()));
//		velocityContext.put("FRAMEWORK_VERSION", EngineUtils.decode(ormTemplate.getVersion()));
//		velocityContext.put("DECIMAL", EngineUtils.decode(ormTemplate.getDecimalAttributeTemplate()));
//		velocityContext.put("DATE_TIME", EngineUtils.decode(ormTemplate.getDateTimeAttributeTemplate()));
//		velocityContext.put("LOB", EngineUtils.decode(ormTemplate.getLobAttributeTemplate()));

		StringWriter stringWriter = new StringWriter();
		velocityTemplate.merge(velocityContext, stringWriter);

		return EngineUtils.sanitize(stringWriter.toString());
	}

/**
 * Prepara o Velocity para renderizar o template 
 * 
 * @param template
 * 
 * @return Template
 */
	private static Template prepareVelocityTemplate(String template) {

		RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
		StringReader stringReader = new StringReader(template);
		Template velocityTemplate = new Template();

		try {
			SimpleNode simpleNode = runtimeServices.parse(stringReader, "Generated Class");
			velocityTemplate.setData(simpleNode);

//		TODO aplicar um exception adequado para erros de parser no template
		} catch (ParseException e) {
			e.printStackTrace();
		}

		velocityTemplate.setRuntimeServices(runtimeServices);
		velocityTemplate.initDocument();

		return velocityTemplate;
	}
	
}

//private final static String PACKAGE = "$Package";
//private final static String ABSTRACT = "\\$Abstract\\{(.*?)\\}";
//private final static String CLASS_NAME = "$ClassName";
//private final static String GENERALIZATION = "\\$Generalization\\{(.*?)\\}";
//private final static String ATTRIBUTES = "$Attributes";
//private final static String GETTERS_AND_SETTERS = "$GettersAndSetters";
//private final static String METHODS = "$Methods";
//private final static String SUPERCLASS_NAME = "$SuperclassName";
//private final static String ATTRIBUTE_VISIBILITY = "$AttributeVisibility";
//private final static String ATTRIBUTE_TYPE = "$AttributeType";
//private final static String ATTRIBUTE_NAME = "$AttributeName";
//private final static String ATTRIBUTE_NAME_CAPITALIZED = "$AttributeNameCapitalized";
//private final static String METHOD_VISIBILITY = "$MethodVisibility";
//private final static String METHOD_RETURN_TYPE = "$MethodReturnType";
//private final static String METHOD_NAME = "$MethodName";
//private final static String METHOD_RETURN = "\\$MethodReturn\\{(.*?)\\}";

//	@Deprecated
//	public String render() {
//		String template = EngineUtils.decode(ormTemplate.getClassTemplate());
//
//		if (template.contains("$Package")) {
//			template = insertPackage(template);
//		}
//
//		if (template.contains("$Abstract")) {
//			template = insertAbstract(template);
//		}
//
//		if (template.contains("$ClassName")) {
//			template = insertClassName(template);
//		}
//
//		if (template.contains("$Generalization")) {
//			template = insertGeneralization(template);
//		}
//
//		if (template.contains("$Attributes")) {
//			template = insertAttributes(template);
//		}
//
//		if (template.contains("$GettersAndSetters")) {
//			template = insertGettersAndSetters(template);
//		}
//
//		if (template.contains("$Methods")) {
//			template = insertMethods(template);
//		}
//
//		String entityClassCode = EngineUtils.sanitize(template);
//
//		return entityClassCode;
//	}
//
//	@Deprecated
//	public String insertPackage(String template) {
//		String inserted = template.replace(PACKAGE, domainClass.getPackage().getName());
//		return inserted;
//	}
//
////	TODO criar um template para classes abstratas
//	@Deprecated
//	public String insertAbstract(String template) {
//		String inserted = null;
//
//		if (domainClass.isAbstract()) {
//			inserted = template.replaceAll(ABSTRACT, EngineUtils.getParameter(ABSTRACT, template));
//		} else {
//			inserted = template.replaceAll(ABSTRACT, "");
//		}
//
//		return inserted;
//	}
//
//	@Deprecated
//	public String insertClassName(String template) {
//		String inserted = template.replace(CLASS_NAME, domainClass.getName());
//		return inserted;
//	}
//
////	TODO retirar duvidas com o Vitor sobre como funcionam as generalizacoes do frameweb
//	@Deprecated
//	public String insertGeneralization(String template) {
//		List<Generalization> generalizations = domainClass.getGeneralizations();
//
//		if (generalizations.size() <= 0) {
//			String noGeneralization = template.replaceAll(GENERALIZATION, "");
//			return noGeneralization;
//		}
//
//		List<GeneralizationSet> generalizationSets = generalizations.get(0).getGeneralizationSets();
//
////		TODO lancar uma excecao adequada caso haja uma generalizacao sem set
//		if (generalizationSets.size() <= 0) {
////			String noGeneralization = template.replace(GENERALIZATION, "");
////			return noGeneralization;
//			System.out.println("Exception::GeneralizationException");
//			System.exit(1);
//		}
//
//		String superclassName = generalizationSets.get(0).getName();
//
//		String generalizationLabel = EngineUtils.getParameter(GENERALIZATION, template);
//		
//		String inserted = template
//				.replaceAll(GENERALIZATION, Matcher.quoteReplacement(generalizationLabel))
//				.replace(SUPERCLASS_NAME, superclassName);
//
//		return inserted;
//	}
//
//	@Deprecated
//	public String insertAttributes(String template) {
//		String attributeTemplate = EngineUtils.decode(ormTemplate.getAttributeTemplate());
//
//		String attributes = domainClass.getAttributes()
//				.stream()
//				.map(attribute -> {
//					String attributeCode = attributeTemplate
//							.replace(ATTRIBUTE_VISIBILITY, attribute.getVisibility().getName())
////							Nao esta sendo tratado o tipo vazio propositalmente. Faz direito esse modelo, meu aliado
//							.replace(ATTRIBUTE_TYPE, attribute.getType().getName())
//							.replace(ATTRIBUTE_NAME, attribute.getName());
//					
//					return attributeCode;
//				})
//				.collect(Collectors.joining("\n"));
//		
//		
//		String inserted = template.replace(ATTRIBUTES, attributes);
//		return inserted;
//	}
//	
//	@Deprecated
//	public String insertGettersAndSetters(String template) {
//		String getterAndSetterTemplate = EngineUtils.decode(ormTemplate.getGetterAndSetterTemplate());
//		
//		String gettersAndSetters = domainClass.getAttributes()
//				.stream()
//				.map(attribute -> {
//					String getterAndSetterCode = getterAndSetterTemplate
//							.replace(ATTRIBUTE_TYPE, attribute.getType().getName())
//							.replace(ATTRIBUTE_NAME_CAPITALIZED, StringUtils.capitalize(attribute.getName()))
//							.replace(ATTRIBUTE_NAME, attribute.getName());
//					
//					return getterAndSetterCode;
//				})
//				.collect(Collectors.joining("\n\n"));
//		
//		String inserted = template.replace(GETTERS_AND_SETTERS, gettersAndSetters);
//		return inserted;
//	}
//	
////	TODO verificacao adequada para o tipo void
//	@Deprecated
//	public String insertMethods(String template) {
//		String methodTemplate = EngineUtils.decode(ormTemplate.getMethodTemplate());
////		TODO verificar se existe um template de metodo para que $MethodReturn seja extraido
//		String methodReturn = EngineUtils.getParameter(METHOD_RETURN, methodTemplate);
//		String abstractMethodTemplate = EngineUtils.decode(ormTemplate.getAbstractMethodTemplate());
//		
//		String methods = domainClass.getOperations()
//				.stream()
//				.filter(DomainMethod.class::isInstance)
//				.map(DomainMethod.class::cast)
//				.map(operation -> {
//						Type methodType = operation.getMethodType();
//						String methodCode = operation.isAbstract() ? abstractMethodTemplate : methodTemplate;
//
////						TODO Lancar um excecao adequada para problemas no template.
////						Se a classe nao for abstrata e acontecer alguma falha no matcher, a
////						configuracao de $MethodReturn nao foi definida no template
//						if (!operation.isAbstract() && methodReturn == null) {
//							System.out.println("Exception::TemplateException");
//							System.exit(1);
//						}
//						
////						TODO lancar uma excecao caso methodType nao seja void e methodReturn == null (NULL, nao String)
//						methodCode = methodCode
//								.replace(METHOD_VISIBILITY, operation.getVisibility().getName())
//								.replace(METHOD_RETURN_TYPE, methodType != null ? methodType.getName() : "void")
//								.replace(METHOD_NAME, operation.getName())
//								.replaceAll(METHOD_RETURN, methodType != null ? methodReturn : "");
//					
//						return methodCode;
//				})
//				.collect(Collectors.joining("\n\n"));
//		
//		String inserted = template.replace(METHODS, methods);
//		return inserted;
//	}
