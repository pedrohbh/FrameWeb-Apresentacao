package br.ufes.inf.nemo.frameweb.codegenerator.e4.classes;

import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;

import br.ufes.inf.nemo.frameweb.codegenerator.e4.engine.JtwigTemplateEngineImpl;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.engine.TemplateEngine;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.exceptions.UndefinedClassRuntimeException;
import br.ufes.inf.nemo.frameweb.codegenerator.e4.exceptions.UndefinedFrameworkProfileRuntimeException;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOServiceAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceControllerAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceMethod;
import br.ufes.inf.nemo.frameweb.utils.IFileUtils;

public class ClassRenderer {
	
	public final static String PACKAGE = "package";
	public final static String CLASS = "class";
	public final static String INTERFACE = "interface";
	public final static String ATTRIBUTES = "attributes";
	public final static String METHODS = "methods";
	public final static String ASSOCIATIONS = "associations";
	public final static String GENERALIZATIONS = "generalizations";
	public final static String REALIZATIONS = "realizations";
	public final static String LITERALS = "literals";
	
	private Element element;
	private FrameworkProfile frameworkTemplate;
	private IFolder templateFolder;
	
	public ClassRenderer(Element element, FrameworkProfile frameworkTemplate, IFolder templateFolder) {
		this.element = element;
		this.frameworkTemplate = frameworkTemplate;
		this.templateFolder = templateFolder;
	}
	
	public String render() {
		if (frameworkTemplate == null) {
			throw new UndefinedFrameworkProfileRuntimeException();
		
		} else if (element instanceof DomainClass) {
			return renderDomainClass();
		
		} else if (element instanceof Enumeration) {
			return renderEnumerationClass();
			
		} else if (element instanceof FrontControllerClass) {
			return renderFrontControllerClass();

		} else if (element instanceof Page) {
			return renderPage();
			
		} else if (element instanceof DAOInterface) {
			return renderDAOInterface();
		
		} else if (element instanceof DAOClass) {
			return renderDAOClass();
			
		} else if (element instanceof ServiceInterface) {
			return renderServiceInterface();
		
		} else if (element instanceof ServiceClass) {
			return renderServiceClass();
			
		} else {
			throw new UndefinedClassRuntimeException();
		}
	}

	private String renderDomainClass() {
		DomainClass domainClass = (DomainClass) element;
		ORMTemplate ormTemplate = (ORMTemplate) frameworkTemplate;

		IFile classTemplateFile = templateFolder.getFile(ormTemplate.getClassTemplate());
		String classTemplate = IFileUtils.getText(classTemplateFile);

		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(classTemplate);

		templateEngineContext
			.addParameter(PACKAGE, domainClass.getPackage())
			.addParameter(CLASS, domainClass)
			.addParameter(ATTRIBUTES, domainClass.getAttributes())
			.addParameter(ASSOCIATIONS, domainClass.getAssociations()
					.stream()
					.filter(DomainAssociation.class::isInstance)
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, domainClass.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, domainClass.getGeneralizations());

		return templateEngineContext.getCode();
	}
	
	private String renderEnumerationClass() {
		Enumeration enumerationClass = (Enumeration) element;
		ORMTemplate ormTemplate = (ORMTemplate) frameworkTemplate;
				
		IFile enumerationClassTemplateFile = templateFolder.getFile(ormTemplate.getEnumerationClassTemplate());
		String enumerationClassTemplate = IFileUtils.getText(enumerationClassTemplateFile);

		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(enumerationClassTemplate);
		
		templateEngineContext
			.addParameter(PACKAGE, enumerationClass.getPackage())
			.addParameter(CLASS, enumerationClass)
			.addParameter(LITERALS, enumerationClass.getOwnedLiterals()
					.stream()
					.map(EnumerationLiteral::getName)
					.collect(Collectors.toList()));
		
		return templateEngineContext.getCode();
	}
	
	private String renderFrontControllerClass() {
		FrontControllerClass frontControllerClass = (FrontControllerClass) element;
		FrontControllerTemplate frontControllerTemplate = (FrontControllerTemplate) frameworkTemplate;
		
		IFile frontControllerClassTemplateFile = templateFolder.getFile(frontControllerTemplate.getClassTemplate());
		String frontControllerClassTemplate = IFileUtils.getText(frontControllerClassTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(frontControllerClassTemplate);

		templateEngineContext
			.addParameter(PACKAGE, frontControllerClass.getPackage())
			.addParameter(CLASS, frontControllerClass)
			.addParameter(ATTRIBUTES, frontControllerClass.getAttributes())
			.addParameter(ASSOCIATIONS, frontControllerClass.getAssociations()
					.stream()
					.filter(ServiceControllerAssociation.class::isInstance)
					.map(ServiceControllerAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, frontControllerClass.getOperations()
					.stream()
					.filter(FrontControllerMethod.class::isInstance)
					.map(FrontControllerMethod.class::cast)
					.collect(Collectors.toList()))
			.addParameter(GENERALIZATIONS, frontControllerClass.getGeneralizations());
		
		return templateEngineContext.getCode();
	}
	
//	TODO implementar o renderizador de pagina html
	@SuppressWarnings("unused")
	private String renderPage() {
		Page page = (Page) element;
		FrontControllerTemplate frontControllerTemplate = (FrontControllerTemplate) frameworkTemplate;
		
		IFile pageTemplateFile = templateFolder.getFile(frontControllerTemplate.getPageTemplate());
		String pageTemplate = IFileUtils.getText(pageTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(pageTemplate);
		
		/*
		 * ADD TEMPLATE ENGINE PARAMETERS
		 */
		
		return templateEngineContext.getCode();
	}
	
	private String renderDAOInterface() {
		DAOInterface daoInterface = (DAOInterface) element;
		DAOTemplate daoTemplate = (DAOTemplate) frameworkTemplate;
		
		IFile daoInterfaceTemplateFile = templateFolder.getFile(daoTemplate.getInterfaceTemplate());
		String daoInterfaceTemplate = IFileUtils.getText(daoInterfaceTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(daoInterfaceTemplate);
		
//		FIXME O editor grafico nao permite a aplicacao de metodos na interface e nem parametros de template
		templateEngineContext
			.addParameter(PACKAGE, daoInterface.getPackage())
			.addParameter(INTERFACE, daoInterface);
//			.addParameter(METHODS, daoInterface.getOperations());
		
		return templateEngineContext.getCode();
	}
	
	private String renderDAOClass() {
		DAOClass daoClass = (DAOClass) element;
		DAOTemplate daoTemplate = (DAOTemplate) frameworkTemplate;
		
		IFile DAOClassTemplateFile = templateFolder.getFile(daoTemplate.getClassTemplate());
		String DAOClassTemplate = IFileUtils.getText(DAOClassTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(DAOClassTemplate);
		
		templateEngineContext
			.addParameter(PACKAGE, daoClass.getPackage())
			.addParameter(CLASS, daoClass)
			.addParameter(ATTRIBUTES, daoClass.getAttributes())
			.addParameter(METHODS, daoClass.getOperations()
					.stream()
					.filter(DAOMethod.class::isInstance)
					.map(DAOMethod.class::cast)
					.collect(Collectors.toList()))
//			FIXME realizacoes nao sao instanciadas no modelo (apenas visualmente)
			.addParameter(REALIZATIONS, daoClass.getInterfaceRealizations())
			.addParameter(GENERALIZATIONS, daoClass.getGeneralizations());
		
		return templateEngineContext.getCode();
	}

	private String renderServiceInterface() {
		ServiceInterface serviceInterface = (ServiceInterface) element;
		DITemplate diTemplate = (DITemplate) frameworkTemplate;
		
		IFile serviceInterfaceTemplateFile = templateFolder.getFile(diTemplate.getInterfaceTemplate());
		String serviceInterfaceTemplate = IFileUtils.getText(serviceInterfaceTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(serviceInterfaceTemplate);

//		FIXME O editor grafico nao permite a aplicacao de metodos na interface e nem parametros de template
		templateEngineContext
			.addParameter(PACKAGE, serviceInterface.getPackage())
			.addParameter(INTERFACE, serviceInterface);
//			.addParameter(METHODS, serviceInterface.getOperations());
			
		return templateEngineContext.getCode();
	}
	
	private String renderServiceClass() {
		ServiceClass serviceClass = (ServiceClass) element;
		DITemplate diTemplate = (DITemplate) frameworkTemplate;
		
		IFile serviceClassTemplateFile = templateFolder.getFile(diTemplate.getClassTemplate());
		String serviceClassTemplate = IFileUtils.getText(serviceClassTemplateFile);
		
		TemplateEngine templateEngineContext = new JtwigTemplateEngineImpl();
		templateEngineContext.setTemplate(serviceClassTemplate);
		
		templateEngineContext
			.addParameter(PACKAGE, serviceClass.getPackage())
			.addParameter(CLASS, serviceClass)
			.addParameter(ATTRIBUTES, serviceClass.getAttributes())
			.addParameter(ASSOCIATIONS, serviceClass.getAssociations()
					.stream()
					.filter(DAOServiceAssociation.class::isInstance)
					.map(DAOServiceAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter(METHODS, serviceClass.getOperations()
					.stream()
					.filter(ServiceMethod.class::isInstance)
					.map(ServiceMethod.class::cast)
					.collect(Collectors.toList()))
//			FIXME realizacoes nao sao instanciadas no modelo (apenas visualmente)
			.addParameter(REALIZATIONS, serviceClass.getInterfaceRealizations())
			.addParameter(GENERALIZATIONS, serviceClass.getGeneralizations());
		
		return templateEngineContext.getCode();
	}
	
}