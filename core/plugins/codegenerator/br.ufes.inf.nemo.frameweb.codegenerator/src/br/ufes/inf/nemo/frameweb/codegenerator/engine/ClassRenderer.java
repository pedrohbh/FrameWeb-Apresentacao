package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;

import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.NavigationAssociation;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;


/** WARNING!!
 * 
 * UGLY CODE BELOW
 * 
 */
public class ClassRenderer {
	
	private Element class_;
	private FrameworkProfile frameworkTemplate;
	
	public ClassRenderer(Element class_, FrameworkProfile frameworkTemplate) {
		this.class_ = class_;
		this.frameworkTemplate = frameworkTemplate;
	}
	
	public String render() {

//		Nao havendo template definido, nada deve ser feito (talvez alertar alertar o
//		usuario com uma mensagem no console seja interessante).
//		Esse tratamento nao se aplica a camada de aplicacao, esta deve ser tratada futuramente.
		if (frameworkTemplate == null) {
			return null;
		}
		
		if (class_ instanceof DomainClass) {
			String generatedCode = renderDomainClass(
					(DomainClass) class_,
					(ORMTemplate) frameworkTemplate
			);
			
			return generatedCode;
		
		} else if (class_ instanceof Enumeration) {
			String generatedCode = renderEnumerationClass(
					(Enumeration) class_,
					(ORMTemplate) frameworkTemplate
			);
			
			return generatedCode;
			
		} else if (class_ instanceof FrontControllerClass) {
			String generatedCode = renderFrontControllerClass(
					(FrontControllerClass) class_,
					(FrontControllerTemplate) frameworkTemplate
			);

			return generatedCode;
		
		} else if (class_ instanceof Page) {
			String generatedCode = renderPage(
					(Page) class_,
					(FrontControllerTemplate) frameworkTemplate
			);
			
			return generatedCode;
			
		} else if (class_ instanceof DAOClass) {
//			code
			return null;
			
		} else if (class_ instanceof ServiceClass) {
//			code
			return null;
			
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public String renderDomainClass(DomainClass domainClass, ORMTemplate ormTemplate) {
		String template = EngineUtils.decodeUrl(ormTemplate.getClassTemplate());

		TemplateEngine templateEngineContext = new TemplateEngineImpl();
		templateEngineContext.setTemplate(template);
		
		templateEngineContext
			.addParameter("package", domainClass.getPackage())
			.addParameter("class", domainClass)
			.addParameter("attributes", domainClass.getAttributes())
			.addParameter("associations", domainClass.getAssociations()
					.stream()
					.map(DomainAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter("methods", domainClass.getOperations()
					.stream()
					.filter(DomainMethod.class::isInstance)
					.map(DomainMethod.class::cast)
					.collect(Collectors.toList()));
		
		List<Generalization> generalizations = domainClass.getGeneralizations();
		
		if (!generalizations.isEmpty()) {
			List<GeneralizationSet> generalizationSets = new ArrayList<GeneralizationSet>();
			
			generalizations.forEach(generalization -> {
				generalizationSets.addAll(generalization.getGeneralizationSets());
			});
			
			templateEngineContext.addParameter("generalizations", generalizationSets);
			
		} else {
			templateEngineContext.addParameter("generalizations", new ArrayList<>());
		}
		
		templateEngineContext.addBasicLibs();

		return templateEngineContext.getCode();
	}
	
	public String renderEnumerationClass(Enumeration enumerationClass, ORMTemplate ormTemplate) {
		String template = EngineUtils.decodeUrl(ormTemplate.getEnumerationClassTemplate());

		TemplateEngine templateEngineContext = new TemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter("package", enumerationClass.getPackage())
			.addParameter("class", enumerationClass)
			.addParameter("literals", enumerationClass.getOwnedLiterals()
					.stream()
					.map(EnumerationLiteral::getName)
					.collect(Collectors.toList()))
			.addBasicLibs();
		
		return templateEngineContext.getCode();
	}
	
	public String renderFrontControllerClass(FrontControllerClass frontControllerClass,
			FrontControllerTemplate frontControllerTemplate) {
		
		String template = EngineUtils.decodeUrl(frontControllerTemplate.getClassTemplate());
		
		TemplateEngine templateEngineContext = new TemplateEngineImpl();
		templateEngineContext.setTemplate(template);

		templateEngineContext
			.addParameter("package", frontControllerClass.getPackage())
			.addParameter("class", frontControllerClass)
			.addParameter("attributes", frontControllerClass.getAttributes())
			.addParameter("associations", frontControllerClass.getAssociations()
					.stream()
					.map(NavigationAssociation.class::cast)
					.collect(Collectors.toList()))
			.addParameter("methods", frontControllerClass.getOperations()
					.stream()
					.filter(FrontControllerMethod.class::isInstance)
					.map(FrontControllerMethod.class::cast)
					.collect(Collectors.toList()));
		
		List<Generalization> generalizations = frontControllerClass.getGeneralizations();
		
		if (!generalizations.isEmpty()) {
			List<GeneralizationSet> generalizationSets = new ArrayList<GeneralizationSet>();
			
			generalizations.forEach(generalization -> {
				generalizationSets.addAll(generalization.getGeneralizationSets());
			});
			
			templateEngineContext.addParameter("generalizations", generalizationSets);
			
		} else {
			templateEngineContext.addParameter("generalizations", new ArrayList<>());
		}
		
		templateEngineContext.addBasicLibs();
		
		return templateEngineContext.getCode();
	}
	
//	TODO implementar um renderizador de paginas
	public String renderPage(Page page, FrontControllerTemplate frontControllerTemplate) {
		return EngineUtils.decodeUrl(frontControllerTemplate.getPageTemplate());
	}
	
}