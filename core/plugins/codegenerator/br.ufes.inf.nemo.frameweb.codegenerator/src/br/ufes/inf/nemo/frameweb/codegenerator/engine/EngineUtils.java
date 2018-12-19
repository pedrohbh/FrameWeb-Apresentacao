package br.ufes.inf.nemo.frameweb.codegenerator.engine;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EngineUtils {

	public static String decode(String str) {
		String decodedString = null;

		try {
			decodedString = URLDecoder.decode(str, "UTF-8");

		// TODO lancar uma excecao para error de codificacao URL no template
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return decodedString;
	}

	public static String getStringBetweenTags(String regex, String str) {
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(str);
		String stringBetweenTags = matcher.find() ? matcher.group(1) : null;
		return stringBetweenTags;
	}
}
