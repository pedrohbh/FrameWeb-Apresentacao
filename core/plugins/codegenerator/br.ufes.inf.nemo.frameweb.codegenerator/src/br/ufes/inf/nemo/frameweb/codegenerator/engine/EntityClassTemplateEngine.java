package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Type;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

public class EntityClassTemplateEngine {
	
	private final static String PACKAGE = "@Package";
	private final static String ABSTRACT = "@Abstract\\{(.*?)\\}";
	private final static String CLASS_NAME = "@ClassName";
	private final static String GENERALIZATION = "@Generalization\\{(.*?)\\}";
	private final static String ATTRIBUTES = "@Attributes";
	private final static String GETTERS_AND_SETTERS = "@GettersAndSetters";
	private final static String METHODS = "@Methods";
	private final static String SUPERCLASS_NAME = "@SuperclassName";
	private final static String ATTRIBUTE_VISIBILITY = "@AttributeVisibility";
	private final static String ATTRIBUTE_TYPE = "@AttributeType";
	private final static String ATTRIBUTE_NAME = "@AttributeName";
	private final static String ATTRIBUTE_NAME_CAPITALIZED = "@AttributeNameCapitalized";
	private final static String METHOD_VISIBILITY = "@MethodVisibility";
	private final static String METHOD_RETURN_TYPE = "@MethodReturnType";
	private final static String METHOD_NAME = "@MethodName";
	private final static String METHOD_RETURN = "@MethodReturn\\{(.*?)\\}";
	
	private DomainClass domainClass;
	private ORMTemplate ormTemplate;
	
	public EntityClassTemplateEngine(DomainClass domainClass, ORMTemplate ormTemplate) {
		this.domainClass = domainClass;
		this.ormTemplate = ormTemplate;
	}

	public String render() {
		String template = EngineUtils.decode(ormTemplate.getClassTemplate());

		if (template.contains("@Package")) {
			template = insertPackage(template);
		}

		if (template.contains("@Abstract")) {
			template = insertAbstract(template);
		}

		if (template.contains("@ClassName")) {
			template = insertClassName(template);
		}

		if (template.contains("@Generalization")) {
			template = insertGeneralization(template);
		}

		if (template.contains("@Attributes")) {
			template = insertAttributes(template);
		}

		if (template.contains("@GettersAndSetters")) {
			template = insertGettersAndSetters(template);
		}

		if (template.contains("@Methods")) {
			template = insertMethods(template);
		}

		String entityClassCode = EngineUtils.sanitize(template);

		return entityClassCode;
	}

	public String insertPackage(String template) {
		String inserted = template.replace(PACKAGE, domainClass.getPackage().getName());
		return inserted;
	}

//	TODO criar um template para classes abstratas
	public String insertAbstract(String template) {
		String inserted = null;

		if (domainClass.isAbstract()) {
			inserted = template.replaceAll(ABSTRACT, EngineUtils.getParameter(ABSTRACT, template));
		} else {
			inserted = template.replaceAll(ABSTRACT, "");
		}

		return inserted;
	}

	public String insertClassName(String template) {
		String inserted = template.replace(CLASS_NAME, domainClass.getName());
		return inserted;
	}

//	TODO retirar duvidas com o Vitor sobre como funcionam as generalizacoes do frameweb
	public String insertGeneralization(String template) {
		List<Generalization> generalizations = domainClass.getGeneralizations();

		if (generalizations.size() <= 0) {
			String noGeneralization = template.replaceAll(GENERALIZATION, "");
			return noGeneralization;
		}

		List<GeneralizationSet> generalizationSets = generalizations.get(0).getGeneralizationSets();

//		TODO lancar uma excecao adequada caso haja uma generalizacao sem set
		if (generalizationSets.size() <= 0) {
//			String noGeneralization = template.replace(GENERALIZATION, "");
//			return noGeneralization;
			System.out.println("Exception::GeneralizationException");
			System.exit(1);
		}

		String superclassName = generalizationSets.get(0).getName();

		String generalizationLabel = EngineUtils.getParameter(GENERALIZATION, template);
		String inserted = template
				.replaceAll(GENERALIZATION, generalizationLabel)
				.replace(SUPERCLASS_NAME, superclassName);

		return inserted;
	}

	public String insertAttributes(String template) {
		String attributeTemplate = EngineUtils.decode(ormTemplate.getAttributeTemplate());

		String attributes = domainClass.getAttributes()
				.stream()
				.map(attribute -> {
					String attributeCode = attributeTemplate
							.replace(ATTRIBUTE_VISIBILITY, attribute.getVisibility().getName())
							.replace(ATTRIBUTE_TYPE, attribute.getType().getName())
							.replace(ATTRIBUTE_NAME, attribute.getName());
					
					return attributeCode;
				})
				.collect(Collectors.joining("\n"));
		
		
		String inserted = template.replace(ATTRIBUTES, attributes);
		return inserted;
	}
	
	public String insertGettersAndSetters(String template) {
		String getterAndSetterTemplate = EngineUtils.decode(ormTemplate.getGetterAndSetterTemplate());
		
		String gettersAndSetters = domainClass.getAttributes()
				.stream()
				.map(attribute -> {
					String getterAndSetterCode = getterAndSetterTemplate
							.replace(ATTRIBUTE_TYPE, attribute.getType().getName())
							.replace(ATTRIBUTE_NAME_CAPITALIZED, StringUtils.capitalize(attribute.getName()))
							.replace(ATTRIBUTE_NAME, attribute.getName());
					
					return getterAndSetterCode;
				})
				.collect(Collectors.joining("\n\n"));
		
		String inserted = template.replace(GETTERS_AND_SETTERS, gettersAndSetters);
		return inserted;
	}
	
//	TODO verificacao adequada para o tipo void
	public String insertMethods(String template) {
		String methodTemplate = EngineUtils.decode(ormTemplate.getMethodTemplate());
//		TODO verificar se existe um template de metodo para que @MethodReturn seja extraido
		String methodReturn = EngineUtils.getParameter(METHOD_RETURN, methodTemplate);
		String abstractMethodTemplate = EngineUtils.decode(ormTemplate.getAbstractMethodTemplate());
		
		String methods = domainClass.getOperations()
				.stream()
				.filter(DomainMethod.class::isInstance)
				.map(DomainMethod.class::cast)
				.map(operation -> {
						Type methodType = operation.getMethodType();
						String methodCode = operation.isAbstract() ? abstractMethodTemplate : methodTemplate;

//						TODO Lancar um excecao adequada para problemas no template.
//						Se a classe nao for abstrata e acontecer alguma falha no matcher, a
//						configuracao de @MethodReturn nao foi definida no template
						if (!operation.isAbstract() && methodReturn == null) {
							System.out.println("Exception::TemplateException");
							System.exit(1);
						}
						
//						TODO lancar uma excecao caso methodType nao seja void e methodReturn == null (NULL, nao String)
						methodCode = methodCode
								.replace(METHOD_VISIBILITY, operation.getVisibility().getName())
								.replace(METHOD_RETURN_TYPE, methodType != null ? methodType.getName() : "void")
								.replace(METHOD_NAME, operation.getName())
								.replaceAll(METHOD_RETURN, methodType != null ? methodReturn : "");
					
						return methodCode;
				})
				.collect(Collectors.joining("\n\n"));
		
		String inserted = template.replace(METHODS, methods);
		return inserted;
	}
	
}
