package br.ufes.inf.nemo.frameweb.utils;

import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class IProjectUtils {

	/**
	 * Adiciona uma dada natureza na descricao de um projeto (.project)
	 * 
	 * @param project
	 * @param natureId
	 * @throws CoreException
	 */
	public static void addNature(IProject project, String natureId) throws CoreException {

		IProjectDescription projectDescription = project.getDescription();

		if (projectDescription.hasNature(natureId)) {
			return;
		}

		String[] originalNatureIds = projectDescription.getNatureIds();
		String[] natureIds = Arrays.copyOf(originalNatureIds, originalNatureIds.length + 1);
		natureIds[originalNatureIds.length] = natureId;

		projectDescription.setNatureIds(natureIds);
		
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		project.setDescription(projectDescription, null);
	}

	/**
	 * Remove uma dada natureza da descricao de um projeto (.project)
	 * 
	 * @param project
	 * @param natureId
	 * @throws CoreException
	 */
	public static void removeNature(IProject project, String natureId) throws CoreException {

		IProjectDescription projectDescription = project.getDescription();

		if (!projectDescription.hasNature(natureId)) {
			return;
		}

		String[] originalNatureIds = projectDescription.getNatureIds();
		String[] natureIds = new String[originalNatureIds.length - 1];

		for (int i = 0, j = 0; i < originalNatureIds.length; i++) {
			if (!originalNatureIds[i].equals(natureId)) {
				natureIds[j] = originalNatureIds[i];
				j++;
			}
		}

		projectDescription.setNatureIds(natureIds);
		project.setDescription(projectDescription, null);
	}
	
	/**
	 * Retorna uma referencia ao projeto selecionado no eclipse baseado no editor aberto
	 * no momento da chamada da funcao.
	 * 
	 * @return IProject or null
	 */
	public static IProject getSelectedProject() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		IEditorPart activeEditor = page.getActiveEditor();
		
		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();
			IProject project = input.getAdapter(IProject.class);
			
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				
				if (resource != null) {
					return resource.getProject();
				}
			}
		}
		
		return null;
	}
	
}
