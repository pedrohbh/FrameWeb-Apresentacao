package br.ufes.inf.nemo.frameweb.codegenerator

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization
import java.net.URLDecoder
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute
import org.apache.commons.lang3.StringUtils
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod

class EntityClassCodeGenerator {

	String domainPackageName
	DomainClass domainClass

	ORMTemplate ormTemplate

	new(DomainClass domainClass, String domainPackageName, ORMTemplate ormTemplate) {
		this.domainPackageName = domainPackageName
		this.domainClass = domainClass
		this.ormTemplate = ormTemplate
	}
		
	/**
	 * Extrai a superclasse de uma classe de dominio
	 */
	def getGeneralization(DomainClass domainClass) {
		var generalization = domainClass
			.eContents()
			.findFirst[it instanceof DomainGeneralization]
		
		if (generalization !== null) (generalization as DomainGeneralization).getGeneralizationSets().head else null
	}
	
	/**
	 * Extrai os atributos de uma classe de dominio
	 */
	def getDomainAttributes(DomainClass domainClass) {
		domainClass
			.eContents()
			.filter[it instanceof DomainAttribute]
			.map[it as DomainAttribute]
			.toList()
	}
	
	/**
	 * Extrai os metodos de uma classe de dominio
	 */
	def getDomainMethods(DomainClass domainClass) {
		domainClass
			.eContents()
			.filter[it instanceof DomainMethod]
			.map[it as DomainMethod]
			.toList()
	}
	
	/**
	 * Decodifica os atributos dos templates do modelo frameweb a partir uma URI
	 */
	def decode(String str) {
		URLDecoder.decode(str, "UTF-8")
	}
	
	/**
	 * Gera os atributos com seus getters e setters
	 */
	def generateAttributes() {
		val template = ormTemplate.getAttributeTemplate().decode()
		val attributes = domainClass.getDomainAttributes();
		
		if (attributes.isEmpty()) {
			return ""
		}
		
		val code = new StringBuilder()
		
		for (attribute : attributes) {
			var attributeCode = template
			
			attributeCode = attributeCode.replace("FW_ATTRIBUTE_TYPE", attribute.getType().getName())
			attributeCode = attributeCode.replace("FW_ATTRIBUTE_FIRST_UPPER", StringUtils.capitalize(attribute.getName()))
			attributeCode = attributeCode.replace("FW_ATTRIBUTE", attribute.getName())
			attributeCode = attributeCode.replace("FW_VISIBILITY", attribute.getVisibility().toString())

			code.append(attributeCode)

			//Nao acrescenta uma quebra de linha depois do ultimo metodo
			if (attribute !== attributes.get(attributes.size() - 1)) {
				code.append("\n\n")
			}					
		}
		
		//Remove a tabulacao da primeira linha
		code.toString().replaceFirst("\t", "")
	}
	
	/**
	 * TODO um sonho nao tao distante
	 * Separar o template de atributos de seus getters e setters
	 */
	def generateGettersAndSetters() {
		 //Tenha fe de que um dia havera algo aqui :)
	}
	
	def generateMethods() {
		val template = ormTemplate.getMethodTemplate().decode()
		val abstractTemplate = ormTemplate.getAbstractMethodTemplate()
		val methods = domainClass.getDomainMethods()
		
		if (methods.isEmpty()) {
			return ""
		}
		
		val code = new StringBuilder()
		
		for (method : methods) {
			var methodCode = ""
			
			if (method.isAbstract()) {
				methodCode = abstractTemplate
				methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public abstract");
			} else {
				methodCode = template
				methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public");
			}
			
			try {
				methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", method.getMethodType().getName())
			} catch (NullPointerException e) {
				methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", "void")
			}

			methodCode = methodCode.replace("FW_METHOD_NAME", method.getName())
			
			code.append(methodCode)
			
			//Nao acrescenta uma quebra de linha depois do ultimo metodo
			if (method !== methods.get(methods.size() - 1)) {
				code.append("\n\n")
			}
		}
		
		//Remove a tabulacao da primeira linha
		code.toString().replaceFirst("\t", "")
	}
	
	/**
	 * The magic
	 */
	def generate() {
		var template = ormTemplate.getClassTemplate().decode()
		
		template = template.replace("FW_PACKAGE", domainPackageName)
		
		/*
		 * FW_CLASS_VISIBILITY tambem precisa de um template definido, senao nao sera possivel gerar
		 * codigo para outras linguagens
		 */
		template = if (domainClass.isAbstract()) {
			template.replace("FW_CLASS_VISIBILITY", "public abstract")
		} else {
			template.replace("FW_CLASS_VISIBILITY", "public")
		}
		
		template = template.replace("FW_CLASS_NAME", domainClass.getName())

		/*
		 * FW_EXTENDS tambem precisa de um template definido, senao nao sera possivel gerar
		 * codigo para outras linguagens
		 */
		template = try {
			template.replace("FW_EXTENDS", "extends " + domainClass.getGeneralization().getName())
		} catch (NullPointerException e) {
			template.replace("FW_EXTENDS", "")
		}

		template = template.replace("FW_CLASS_ATTRIBUTES", generateAttributes())
		template = template.replace("FW_CLASS_METHOD", generateMethods())
		
		/**
		 * TODO template.sanitize()
		 * 
		 * Remove multiplos espacos, exceto tabulacoes e quebras de linha maiores que 2, ou seja, maiores que \n\n
		 */		 
	}
}