package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EngineUtils {

	/**
	 * Decodificar uma dada URL
	 * 
	 * @param str
	 * @return String
	 */
	public static String decodeUrl(String str) {
		
		if (str == null) {
			return "";
		}
		
		String decodedString = null;

		try {
			decodedString = URLDecoder.decode(str, "UTF-8");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return decodedString;
	}
	
	/**
	 * Organiza o codigo dada uma String
	 * 
	 * @param str
	 * @return String
	 */
	public static String sanitize(String str) {
		String sanitizedString = str
				.replaceAll("\\s+\\{", " {") // remove espacos entre texto e chave
				.replaceAll("\\s+;", ";") // remove espacos entre texto e ponto e virgula
				.replaceAll("(?:\\h*\n){2,}", "\n\n"); // remove mais do que uma linha e branco
		
//		Remove espacos duplos entre palavras
		String lineSeparator = System.getProperty("line.separator");
		String[] sanitizedStringLines = sanitizedString.split(lineSeparator);
		
		sanitizedString = Arrays.stream(sanitizedStringLines)
				.map(line -> line.replaceAll(" {2,}+", " "))
				.collect(Collectors.joining("\n"));
		
		return sanitizedString;
	}
	
	/**
	 * Transforma um caminho "exEMpLo/FrameWeb" em "exemplo.frameweb"
	 * 
	 * @param str
	 * @return String
	 */
	public static String nameToPath(String str) {
		return str.replaceAll("[^A-Za-z0-9]", "/").toLowerCase();
	}

}
