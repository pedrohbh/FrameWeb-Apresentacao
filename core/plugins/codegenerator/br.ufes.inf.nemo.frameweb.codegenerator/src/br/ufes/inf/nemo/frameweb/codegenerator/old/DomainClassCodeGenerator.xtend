package br.ufes.inf.nemo.frameweb.codegenerator.old

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate
import java.net.URLDecoder
import org.apache.commons.lang3.StringUtils
import org.eclipse.core.resources.IFolder
import org.apache.commons.io.IOUtils
import org.eclipse.core.runtime.CoreException
import java.io.IOException
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod

class DomainClassCodeGenerator {

	DomainClass domainClass
	ORMTemplate ormTemplate

	/**
	 * Responsavel por gerar codigo da classe em questao
	 * 
	 * @param domainClass
	 * @param domainPackage
	 * @param ormTemplate
	 */
	new(DomainClass domainClass, ORMTemplate ormTemplate) {
		this.domainClass = domainClass
		this.ormTemplate = ormTemplate
	}

	/**
	 * Decodifica os atributos dos templates do modelo frameweb a partir uma URI
	 * 
	 * @param str
	 */
	def decode(String str) {
		URLDecoder.decode(str, "UTF-8")
	}
	
	def generateClass() {
		var String classTemplate = ormTemplate.getClassTemplate().decode()
		
		classTemplate = classTemplate.replace("FW_PACKAGE", domainClass.getPackage().getName())
		
		/*
		 * FW_CLASS_VISIBILITY tambem precisa de um template definido, senao nao sera possivel gerar
		 * codigo para outras linguagens
		 */
		if (domainClass.isAbstract()) {
			classTemplate = classTemplate.replace("FW_CLASS_VISIBILITY", "public abstract")
		} else {
			classTemplate = classTemplate.replace("FW_CLASS_VISIBILITY", "public")
		}
		
		classTemplate = classTemplate.replace("FW_CLASS_NAME", domainClass.getName())

		/*
		 * FW_EXTENDS tambem precisa de um template definido, senao nao sera possivel gerar
		 * codigo para outras linguagens
		 */
		try {
			var generazalition = domainClass
				.getGeneralizations()
				.stream()
				.filter[it instanceof DomainGeneralization]
				.map[it as DomainGeneralization]
				.findFirst()
				.get()
				.getGeneralizationSets()
				.head()
			
			classTemplate = classTemplate.replace("FW_EXTENDS", "extends " + generazalition.getName())
			
		} catch(Exception e) {
			classTemplate = classTemplate.replace("FW_EXTENDS", "")
		}
		
	}
	
	/**
	 * Gera os atributos com seus getters e setters
	 */
	def generateAttributes() {
		val attributeTemplate = ormTemplate.getAttributeTemplate().decode()
		val attributes = domainClass.getAttributes();
		
		val code = new StringBuilder()
		
		for (attribute : attributes) {
			var attributeCode = attributeTemplate
			
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
	
	/**
	 * Gera os metodos de classe
	 */
	def generateMethods() {
		val methodTemplate = ormTemplate.getMethodTemplate().decode()
		val abstractMethodTemplate = ormTemplate.getAbstractMethodTemplate()
		val methods = domainClass.allOperations
			.filter[it instanceof DomainMethod]
			.map[it as DomainMethod]
			.toList()
		
		val code = new StringBuilder()
		
		for (method : methods) {
			var methodCode = ""
			
			if (method.isAbstract()) {
				methodCode = abstractMethodTemplate
				methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public abstract");
			} else {
				methodCode = methodTemplate
				methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public");
			}
			
			//Mudar esse try catch para um if statement
			try {
				methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", method.getMethodType().getName())
			} catch (NullPointerException e) {
				methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", "void")
				methodCode = methodCode.replace("null", "")
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
	 * 
	 * @param packageFolder
	 */
	def generate(IFolder packageFolder) {
		var template = generateClass()
		template = template.replace("FW_CLASS_ATTRIBUTES", generateAttributes())
		template = template.replace("FW_CLASS_METHOD", generateMethods())

		val fileName = domainClass.getName() + ormTemplate.getClassExtension()
		val file = packageFolder.getFile(fileName)
		
		try {
			val inputStream = IOUtils.toInputStream(template, "UTF-8");
			
			//TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists()) {
				file.delete(true, null);
			}
			
			file.create(inputStream, true, null)
			
//		Tratar melhor os Exceptions
		} catch (CoreException | IOException e) {
			e.printStackTrace()
		}
		
		/**
		 * TODO template.sanitize()
		 * 
		 * Remove multiplos espacos, exceto tabulacoes e quebras de linha maiores que 2, ou seja, maiores que \n\n
		 * Dessa forma o codigo ficara "redondinho"
		 * Boa sorte
		 */
	}
}
