package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.ClassTemplateEngine;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;

@SuppressWarnings("all")
public class EnumerationClassCodeGenerator {

	private Enumeration enumerationClass;
	private ORMTemplate ormTemplate;
	
	public EnumerationClassCodeGenerator(Enumeration enumerationClass, ORMTemplate ormTemplate) {
		this.enumerationClass = enumerationClass;
		this.ormTemplate = ormTemplate;
	}
	
	public void generate(IFolder packageFolder) {
		
		String classCode = ClassTemplateEngine.render(enumerationClass, ormTemplate);
		
		String fileName = enumerationClass.getName() + ormTemplate.getClassExtension();
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
