package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EngineUtils {

	public static String decode(String str) {
		if (str == null) {
			return "";
		}
		
		String decodedString = null;

		try {
			decodedString = URLDecoder.decode(str, "UTF-8");

		// TODO lancar uma excecao para error de codificacao URL no template
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return decodedString;
	}

	public static String getParameter(String regex, String str) {
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(str);
		String stringBetweenTags = matcher.find() ? matcher.group(1) : null;
		return stringBetweenTags;
	}
	
	//TODO alguma alma que seja boa em expressoes regulares poderia melhorar isso daqui...
	public static String sanitize(String str) {
		String sanitizedString = str
				.replaceAll("\\s+\\{", " {") //remove espacos entre texto e chave
				.replaceAll("\\s+;", ";") //remove espacos entre texto e ponto e virgula
				.replaceAll("(?:\\h*\n){2,}", "\n\n"); //remove mais do que uma linha e branco
		
		//Remove espacos duplos entre palavras
		String lineSeparator = System.getProperty("line.separator");
		String[] sanitizedStringLines = sanitizedString.split(lineSeparator);
		
		sanitizedString = Arrays.stream(sanitizedStringLines)
				.map(line -> line.replaceAll(" {2,}+", " "))
				.collect(Collectors.joining("\n"));
		
		return sanitizedString;
	}
}
