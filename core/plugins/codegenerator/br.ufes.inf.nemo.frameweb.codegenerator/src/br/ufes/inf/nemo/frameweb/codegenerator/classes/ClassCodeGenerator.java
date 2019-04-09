package br.ufes.inf.nemo.frameweb.codegenerator.classes;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;

import br.ufes.inf.nemo.frameweb.model.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.model.frameweb.DITemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrameworkProfile;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.model.frameweb.Page;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.ServiceInterface;

public class ClassCodeGenerator {

	private Element element;
	private FrameworkProfile frameworkProfile;

	/**
	 * 
	 * @param element
	 * @param frameworkProfile
	 * @param templateFolder 
	 */
	public ClassCodeGenerator(Element element, FrameworkProfile frameworkProfile) {
		this.element = element;
		this.frameworkProfile = frameworkProfile;
	}
	
	/**
	 * 
	 * @param packageFolder
	 * @param templateFolder 
	 */
	public void generate(IFolder packageFolder, IFolder templateFolder) {
		ClassRenderer framewebRenderer = new ClassRenderer(element, frameworkProfile, templateFolder);
		String code = framewebRenderer.render();
		
		String fileName = getFileNameWithExtension(element, frameworkProfile);
		IFile file = packageFolder.getFile(fileName);
		
		try {
			InputStream inputStream = IOUtils.toInputStream(code, "UTF-8");

//			TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists()) {
				file.delete(true, null);
			}
			
			Thread.sleep(100);
			
			file.create(inputStream, true, null);
			
		} catch (CoreException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
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
			}
			
		} else if (frameworkProfile instanceof FrontControllerTemplate) {
			FrontControllerTemplate frontControllerTemplate = (FrontControllerTemplate) frameworkProfile;
			
			if (element instanceof FrontControllerClass) {
				Class class_ = (Class) element;
				fileName = class_.getName() + frontControllerTemplate.getClassExtension();
				
			} else if (element instanceof Page) {
				Page page = (Page) element;
				fileName = page.getName() + frontControllerTemplate.getPageExtension();
			}
			
		} else if (frameworkProfile instanceof DITemplate) {
			DITemplate diTemplate = (DITemplate) frameworkProfile;
			
			if (element instanceof ServiceClass || element instanceof DAOClass) {
				Class class_ = (Class) element;
				fileName = class_.getName() + diTemplate.getClassExtension();
			
			} else if (element instanceof ServiceInterface || element instanceof DAOInterface) {
				Interface interface_ = (Interface) element;
				fileName = interface_.getName() + diTemplate.getClassExtension();
			}
		}
		
		return fileName;
	}
	
}
