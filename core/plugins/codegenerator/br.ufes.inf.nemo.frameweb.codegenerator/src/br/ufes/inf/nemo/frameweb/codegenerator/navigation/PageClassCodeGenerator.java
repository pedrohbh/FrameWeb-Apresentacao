package br.ufes.inf.nemo.frameweb.codegenerator.navigation;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.ClassTemplateEngine;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;

public class PageClassCodeGenerator {

	private Page page;
	private FrontControllerTemplate frontControllerTemplate;
	
	public PageClassCodeGenerator(Page page, FrontControllerTemplate frontControllerTemplate) {
		this.page = page;
		this.frontControllerTemplate = frontControllerTemplate;
	}

	public void generate(IFolder viewFolder) {
		String classCode = ClassTemplateEngine.render(page, frontControllerTemplate);

//		TODO Se nao houver um template definido, nada eh feito
		if (classCode == null) {
			return;
		}

		String fileName = page.getName() + frontControllerTemplate.getClassExtension();
		IFile file = viewFolder.getFile(fileName);
		
//		TODO tratar condicao de corrida no if statement
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
