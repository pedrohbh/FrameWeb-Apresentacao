package br.ufes.inf.nemo.frameweb.codegenerator.models;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;

import br.ufes.inf.nemo.frameweb.codegenerator.engine.FrameWebRenderer;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;

public class ClassCodeGenerator {

	private Element element;
	private FrameworkProfile frameworkProfile;

	/**
	 * 
	 * @param element
	 * @param frameworkProfile
	 */
	public ClassCodeGenerator(Element element, FrameworkProfile frameworkProfile) {
		this.element = element;
		this.frameworkProfile = frameworkProfile;
	}
	
	/**
	 * Gera um arquivo de codigo no diretorio especificado
	 * 
	 * @param packageFolder
	 */
	public void generate(IFolder packageFolder) {
		String code = FrameWebRenderer.render(element, frameworkProfile);
		
		String fileName = getFileNameWithExtension(element, frameworkProfile);
		IFile file = packageFolder.getFile(fileName);
		
		try {
			InputStream inputStream = IOUtils.toInputStream(code, "UTF-8");
			
//			TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists()) {
				file.delete(true, null);
			}
			
			Thread.sleep(50);
			
			file.create(inputStream, true, null);
			
		} catch (CoreException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Shrek
	 * 
	 * @param element
	 * @param framework
	 * @return
	 */
	private String getFileNameWithExtension(Element element, FrameworkProfile framework) {
		String fileName = null;
		
		if (frameworkProfile instanceof ORMTemplate) {
			ORMTemplate ormTemplate = (ORMTemplate) frameworkProfile;
			
			if (element instanceof DomainClass) {
				Class class_ = (Class) element;
				fileName = class_.getName() + ormTemplate.getClassExtension();
			
			} else if (element instanceof Enumeration) {
				Enumeration enumeration = (Enumeration) element;
				fileName = enumeration.getName() + ormTemplate.getClassExtension();
			
			} else {
				throw new IllegalArgumentException();
			}
			
		} else if (frameworkProfile instanceof FrontControllerTemplate) {
			FrontControllerTemplate frontControllerTemplate = (FrontControllerTemplate) frameworkProfile;
			
			if (element instanceof FrontControllerClass) {
				Class class_ = (Class) element;
				fileName = class_.getName() + frontControllerTemplate.getClassExtension();
				
			} else if (element instanceof Page) {
				Page page = (Page) element;
				fileName = page.getName() + frontControllerTemplate.getPageExtension();
				
			} else {
				throw new IllegalArgumentException();
			}
			
//		TODO filtrar o restante dos FrameworkProfiles
		} else {
			throw new IllegalArgumentException();
		}
		
		return fileName;
	}
	
}
