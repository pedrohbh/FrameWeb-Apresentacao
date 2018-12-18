package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.util.List;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Type;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

public class EntityClassTemplateEngine {
	
	private final static String PACKAGE = "#{PACKAGE}";
	private final static String ABSTRACT = "\\#\\{ABSTRACT=(.*?)\\}";
	private final static String CLASS_NAME = "#{CLASS_NAME}";
	private final static String GENERALIZATION = "\\#\\{GENERALIZATION=(.*?)\\}";
	private final static String ATTRIBUTES = "#{ATTRIBUTES}";
	private final static String GETTERS_AND_SETTERS = "#{GETTERS_AND_SETTERS}";
	private final static String METHODS = "#{METHODS}";
//	private final static String SUPERCLASS_NAME = "#{SUPERCLASS_NAME}";
	private final static String ATTRIBUTE_VISIBILITY = "#{ATTRIBUTE_VISIBILITY}";
	private final static String ATTRIBUTE_TYPE = "#{ATTRIBUTE_TYPE}";
	private final static String ATTRIBUTE_NAME = "#{ATTRIBUTE_NAME}";
	private final static String ATTRIBUTE_NAME_CAPITALIZED = "#{ATTRIBUTE_NAME_CAPITALIZED}";
	private final static String METHOD_VISIBILITY = "#{METHOD_VISIBILITY}";
	private final static String METHOD_RETURN_TYPE = "#{METHOD_RETURN_TYPE}";
	private final static String METHOD_NAME = "#{METHOD_NAME}";
	private final static String METHOD_RETURN = "\\#\\{METHOD_RETURN=(.*?)\\}";
	
	private DomainClass domainClass;
	private ORMTemplate ormTemplate;
	
	public EntityClassTemplateEngine(DomainClass domainClass, ORMTemplate ormTemplate) {
		this.domainClass = domainClass;
		this.ormTemplate = ormTemplate;
	}

	public String render() {
		String template = EngineUtils.decode(ormTemplate.getClassTemplate());

		if (template.contains(PACKAGE)) {
			template = insertPackage(template);
		}

		boolean hasAbstractTag = Pattern.compile(ABSTRACT).matcher(template).find();
		if (hasAbstractTag) {
			template = insertAbstract(template);
		}

		if (template.contains(CLASS_NAME)) {
			template = insertClassName(template);
		}

		boolean hasGeneralizationTag = Pattern.compile(GENERALIZATION).matcher(template).find();
		if (hasGeneralizationTag) {
			template = insertGeneralization(template);
		}

		if (template.contains(ATTRIBUTES)) {
			template = insertAttributes(template);
		}

		if (template.contains(GETTERS_AND_SETTERS)) {
			template = insertGettersAndSetters(template);
		}

		if (template.contains(METHODS)) {
			template = insertMethods(template);
		}

		return template;
	}

	public String insertPackage(String template) {
		String inserted = template.replace(PACKAGE, domainClass.getPackage().getName());
		return inserted;
	}

//	TODO criar um template para classes abstratas
	public String insertAbstract(String template) {
		String inserted = null;

		if (domainClass.isAbstract()) {
			inserted = template.replaceAll(ABSTRACT, EngineUtils.getStringBetweenTags(ABSTRACT, template));

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

//		TODO lancar uma excecao adequada aqui, pois se trata de uma situacao incomum
		if (generalizationSets.size() <= 0) {
//			String noGeneralization = template.replace(GENERALIZATION, "");
//			return noGeneralization;
			System.exit(1);
		}

		String superclassName = generalizationSets.get(0).getName();

		String generalizationLabel = EngineUtils.getStringBetweenTags(GENERALIZATION, template);
		String inserted = template.replaceAll(GENERALIZATION, generalizationLabel + " " + superclassName);

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
		String abstractMethodTemplate = EngineUtils.decode(ormTemplate.getAbstractMethodTemplate());
		
		String methods = domainClass.getOperations()
				.stream()
				.filter(DomainMethod.class::isInstance)
				.map(DomainMethod.class::cast)
				.map(operation -> {
						String methodCode = operation.isAbstract() ? abstractMethodTemplate : methodTemplate;
						
						Type methodType = operation.getMethodType();
						String methodReturn = EngineUtils.getStringBetweenTags(METHOD_RETURN, methodCode);
						
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
