package br.ufes.inf.nemo.frameweb.codegenerator.navigation;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.TemplateEngine;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;

public class FrontControllerClassCodeGenerator {

	private FrontControllerClass frontControllerClass;
	private FrontControllerTemplate frontControllerTemplate;
	
	public FrontControllerClassCodeGenerator(FrontControllerClass frontControllerClass, FrontControllerTemplate frontControllerTemplate) {
		this.frontControllerClass = frontControllerClass;
		this.frontControllerTemplate = frontControllerTemplate;
	}

	public void generate(IFolder packageFolder) {
		String classCode = TemplateEngine.render(frontControllerClass, frontControllerTemplate);

//		Se nao houver um template definido, nada eh feito
		if (classCode == null) {
			return;
		}
		
		String fileName = frontControllerClass.getName() + frontControllerTemplate.getClassExtension();
		IFile file = packageFolder.getFile(fileName);
		
		try {
			InputStream inputStream = IOUtils.toInputStream(classCode, "UTF-8");

//			TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists()) {
				file.delete(true, null);
			}
			
			file.create(inputStream, true, null);
			
		} catch (CoreException | IOException e) {
			e.printStackTrace();
		}
	}

}
