package br.ufes.inf.nemo.frameweb.codegenerator.e4.classes;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.engine.JtwigTemplateEngineImpl;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.engine.TemplateEngine;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthPermission;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthRole;
import br.ufes.inf.nemo.frameweb.model.frameweb.AuthUser;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.Partial;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.RestControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceControllerAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.UIComponent;

public class ClassCodeGenerator {

	public final static String PACKAGE = "package";
	public final static String CLASS = "class";
	public final static String INTERFACE = "interface";
	public final static String ATTRIBUTES = "attributes";
	public final static String METHODS = "methods";
	public final static String ASSOCIATIONS = "associations";
	public final static String GENERALIZATIONS = "generalizations";
	public final static String REALIZATIONS = "realizations";
	public final static String LITERALS = "literals";
	public final static String RESULT_DEPENDENCY = "resultDependency";
	public final static String NAVIGATION_ASSOCIATIONS = "navigationAssociation";
	public final static String PAGE = "page";
	public final static String FORMS = "forms";
	public final static String PARTIAL = "partial";
	public final static String REFERENCED_PARTIALS = "referencedPartials";
	public final static String PARTIAL_PROPERTIES = "partialProperties";
	

	public static String render(DomainClass class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(DomainAssociation.class::isInstance)
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());

		return templateEngineContext.getCode();
	}
	
	public static String render(AuthUser class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(DomainAssociation.class::isInstance)
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());

		return templateEngineContext.getCode();
	}
	
	public static String render(AuthRole class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(DomainAssociation.class::isInstance)
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());

		return templateEngineContext.getCode();
	}
	
	public static String render(AuthPermission class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(DomainAssociation.class::isInstance)
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());

		return templateEngineContext.getCode();
	}
	
	
	public static String render(Enumeration class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(LITERALS, class_.getOwnedLiterals()
					.stream()
					.map(EnumerationLiteral::getName)
					.collect(Collectors.toList()));
		
		return templateEngineContext.getCode();
	}
	
	public static String render(FrontControllerClass class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(ServiceControllerAssociation.class::isInstance)
					.map(ServiceControllerAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(FrontControllerMethod.class::isInstance)
					.map(FrontControllerMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());
		
		return templateEngineContext.getCode();
	}
	
//	TODO terminar a implementacao de REST para o FrameWeb
	public static String render(RestControllerClass class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations())
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(RestControllerMethod.class::isInstance)
					.map(RestControllerMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());
		
		return templateEngineContext.getCode();
	}
	
	public static String render(Partial partial, List<UIComponent> partialUIComponents, Map<String, String> partialProperties, List<String> partiaisReferenciados, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext.addParameter(PARTIAL, partial)
				.addParameter(NAVIGATION_ASSOCIATIONS,
						partial.getAssociations().stream().filter(NavigationAssociation.class::isInstance)
								.map(NavigationAssociation.class::cast).collect(Collectors.toList()))
				.addParameter(FORMS, partialUIComponents).addParameter(REFERENCED_PARTIALS, partiaisReferenciados).addParameter(PARTIAL_PROPERTIES, partialProperties);

		return templateEngineContext.getCode();
	}

//	TODO implementar o renderizador de pagina html
	public static String render(Page page, List<UIComponent> pageUIComponents, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
		templateEngineContext
			.addParameter(PAGE, page)
			.addParameter(NAVIGATION_ASSOCIATIONS, page.getAssociations()
					.stream()
					.filter(NavigationAssociation.class::isInstance)
					.map(NavigationAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(FORMS, pageUIComponents);
		
		return templateEngineContext.getCode();
	}
	
	public static String render(DAOInterface interface_, List<DAOMethod> daoMethods, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
//		FIXME O editor grafico nao permite a aplicacao de metodos na interface e nem parametros de template,
//		fazendo com que seja necessario resgatar os metodos direto da classe que implementa a interface
		templateEngineContext
			.addParameter(PACKAGE, interface_.getPackage())
			.addParameter(INTERFACE, interface_)
			.addParameter(METHODS, daoMethods);
		
		return templateEngineContext.getCode();
	}
	
	public static String render(DAOClass class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(DAOMethod.class::isInstance)
					.map(DAOMethod.class::cast)
					.collect(Collectors.toList()))
//			FIXME realizacoes nao sao instanciadas no modelo (apenas visualmente)
			.addParameter(REALIZATIONS, class_.getInterfaceRealizations())
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());
		
		return templateEngineContext.getCode();
	}

	public static String render(ServiceInterface interface_, List<ServiceMethod> serviceMethods, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);

//		FIXME O editor grafico nao permite a aplicacao de metodos na interface e nem parametros de template,
//		fazendo com que seja necessario resgatar os metodos direto da classe que implementa a interface
		templateEngineContext
			.addParameter(PACKAGE, interface_.getPackage())
			.addParameter(INTERFACE, interface_)
			.addParameter(METHODS, serviceMethods);
			
		return templateEngineContext.getCode();
	}
	
	public static String render(ServiceClass class_, String template) {
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
		templateEngineContext
			.addParameter(PACKAGE, class_.getPackage())
			.addParameter(CLASS, class_)
			.addParameter(ATTRIBUTES, class_.getAttributes())
			.addParameter(ASSOCIATIONS, class_.getAssociations()
					.stream()
					.filter(DAOServiceAssociation.class::isInstance)
					.map(DAOServiceAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, class_.getOperations()
					.stream()
					.filter(ServiceMethod.class::isInstance)
					.map(ServiceMethod.class::cast)
					.collect(Collectors.toList()))
//			FIXME realizacoes nao sao instanciadas no modelo (apenas visualmente)
			.addParameter(REALIZATIONS, class_.getInterfaceRealizations())
			.addParameter(GENERALIZATIONS, class_.getGeneralizations());
		
		return templateEngineContext.getCode();
	}
	
}
