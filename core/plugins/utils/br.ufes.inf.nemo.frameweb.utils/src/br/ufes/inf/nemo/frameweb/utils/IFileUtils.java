package br.ufes.inf.nemo.frameweb.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class IFileUtils {
	
	/**
	 * Cria IFolder's em cascata dentro de um dado IFolder
	 * 
	 * @return file text
	 */
	public static String getText(IFile file) {
		InputStream pomInputStream = null;
		
		try {
			pomInputStream = file.getContents();

		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		String lineSeparator = System.getProperty("line.separator");
		
		String fileContent = new BufferedReader(new InputStreamReader(pomInputStream))
				.lines()
				.collect(Collectors.joining(lineSeparator));
		
		return fileContent;
	}

	/**
	 * 
	 * @param file
	 * @param content
	 */
	public static void createFile(IFile file, String content) {
		try {
			InputStream inputStream = IOUtils.toInputStream(content, "UTF-8");

//			TODO atualizar o conteudo do arquivo ao inves de sobrescrever o codigo
			if (file.exists())
				file.delete(true, null);

			Thread.sleep(100);

			file.create(inputStream, true, null);

		} catch (CoreException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
