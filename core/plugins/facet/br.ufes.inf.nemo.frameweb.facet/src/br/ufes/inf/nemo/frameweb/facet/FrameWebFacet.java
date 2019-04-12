package br.ufes.inf.nemo.frameweb.facet;

import br.ufes.inf.nemo.frameweb.utils.IProjectUtils;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

public class FrameWebFacet {
	
	private final static String FRAMEWEB_BASE_FILE_NAME = "Model";
	private final static String REPRESENTATIONS_FILE_NAME = "representations";
	private final static String SIRIUS_MODELING_NATURE = "org.eclipse.sirius.nature.modelingproject";
	
	private IProject webProject;
	
	public FrameWebFacet(IProject project) {
		this.webProject = project;
	}

	/**
	 * Realiza a conversão do projeto para um projeto de modelagem, ou seja,
	 * adiciona a natureza de modelagem do Sirius.
	 * 
	 * @throws CoreException
	 */
	public void addSiriusModelingNature() throws CoreException {
		IProjectUtils.addNature(webProject, SIRIUS_MODELING_NATURE);
	}

	/**
	 * Remove a natureza de modelagem do Sirius do projeto web.
	 * 
	 * @throws CoreException
	 */
	public void removeSiriusModelingNature() throws CoreException {
		IProjectUtils.removeNature(webProject, SIRIUS_MODELING_NATURE);
	}

	/**
	 * Remove o arquivo .aird
	 * 
	 * @throws CoreException
	 */
	public void removeRepresentationsFile() throws CoreException {
		IFile representations = webProject.getFile(REPRESENTATIONS_FILE_NAME + ".aird");

		if (representations.exists()) {
			representations.delete(true, null);
		}
	}

	/**
	 * Cria um arquivo de diagramas .frameweb.
	 * 
	 * @throws CoreException
	 */
	public void createFrameWebFile() throws CoreException {
		//TODO permitir que o usuario escolha o nome do arquivo .frameweb nas configuracoes da faceta
		IFile fileDiagramFrameWeb = webProject.getFile("model.frameweb");

		if (!fileDiagramFrameWeb.exists()) {
			Path pathDiagramPlugin = new Path("libs/" + FRAMEWEB_BASE_FILE_NAME + ".xml");
			copyFromPlugin(pathDiagramPlugin, fileDiagramFrameWeb);
		}
	}

	/**
	 * Cria um arquivo de ViewPoints .aird.
	 * 
	 * @throws CoreException
	 */
	public void createRepresentationsFile() throws CoreException {
		IFile fileRepresentationsFrameWeb = webProject.getFile("representations.aird");

		if (!fileRepresentationsFrameWeb.exists()) {
			Path pathRepresentationsPlugin = new Path("libs/" + REPRESENTATIONS_FILE_NAME + ".xml");
			copyFromPlugin(pathRepresentationsPlugin, fileRepresentationsFrameWeb);
		}
	}

	/**
	 * Cria um fluxo entre um arquivo localizado na raiz do plugin para um arquivo
	 * localizado no projeto web onde a faceta foi instalada.
	 * 
	 * @param src         Caminho para o arquivo localizado na riaz do plugin.
	 * @param destination Arquivo a qual o fluxo deve ser direcionado.
	 * @throws CoreException
	 */
	private void copyFromPlugin(IPath src, IFile destination) throws CoreException {
		try {
			Bundle bundle = FrameWebFacetActivator.getInstance().getBundle();
			InputStream input = FileLocator.openStream(bundle, src, false);
			destination.create(input, true, null);

		} catch (IOException e) {
			String msg = e.getMessage();
			throw new CoreException(FrameWebFacetActivator.createErrorStatus(msg, e));

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
}
