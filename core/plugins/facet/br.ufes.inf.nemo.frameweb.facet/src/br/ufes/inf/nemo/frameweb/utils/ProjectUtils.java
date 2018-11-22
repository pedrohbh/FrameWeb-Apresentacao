package br.ufes.inf.nemo.frameweb.utils;

import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;

public class ProjectUtils {

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
}
