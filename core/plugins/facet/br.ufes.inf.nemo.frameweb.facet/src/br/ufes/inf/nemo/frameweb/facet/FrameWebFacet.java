package br.ufes.inf.nemo.frameweb.facet;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class FrameWebFacet {

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
		ProjectUtils.addNature(webProject, "org.eclipse.sirius.nature.modelingproject");
	}

	/**
	 * Remove a natureza de modelagem do Sirius do projeto web.
	 * 
	 * @throws CoreException
	 */
	public void removeSiriusModelingNature() throws CoreException {
		ProjectUtils.removeNature(webProject, "org.eclipse.sirius.nature.modelingproject");
	}

	/**
	 * Remove o arquivo .aird
	 * 
	 * @throws CoreException
	 */
	public void removeRepresentationsFile() throws CoreException {
		IFile representations = webProject.getFile("representations.aird");

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
		IFile fileDiagramFrameWeb = webProject.getFile("diagram.frameweb");

		if (!fileDiagramFrameWeb.exists()) {
			Path pathDiagramPlugin = new Path("libs/diagram.xml");
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
			Path pathRepresentationsPlugin = new Path("libs/representations.xml");
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
			throw new CoreException(FrameWebFacetActivator.createErrorStatus(e.getMessage(), e));

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
