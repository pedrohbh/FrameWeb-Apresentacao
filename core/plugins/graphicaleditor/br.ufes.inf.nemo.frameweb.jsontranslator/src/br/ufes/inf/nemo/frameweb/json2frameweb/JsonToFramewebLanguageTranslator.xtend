package br.ufes.inf.nemo.frameweb.json2frameweb

import com.google.gson.JsonParser
import com.google.gson.JsonObject

class JsonToFramewebLanguageTranslator {
	
	JsonObject json

	new(String languageDefinition) {
		json = new JsonParser()
			.parse(languageDefinition)
			.getAsJsonObject()
	}
	
	new(JsonObject json) {
		this.json = json
	}

	def translate() {
		val language = json.get("language")
		val types = json.get("types").getAsJsonObject()
		val primitives = types.get("primitives").getAsJsonArray()
		val classes = types.get("classes").getAsJsonArray()

		'''
			<?xml version="1.0" encoding="UTF-8"?>
			<frameweb:FramewebProject xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:frameweb="http://nemo.inf.ufes.br/projects/frameweb/FW-2015" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML">
			  <compose xsi:type="frameweb:EntityModel" name=«language»>
			    «FOR primitive : primitives SEPARATOR "\n"»<packagedElement xsi:type="uml:PrimitiveType" name=«primitive»/>«ENDFOR»
			    «FOR _class : classes SEPARATOR "\n"»<packagedElement xsi:type="uml:Class" name=«_class»/>«ENDFOR»
			  </compose>
			</frameweb:FramewebProject>
		'''
	}	
}
