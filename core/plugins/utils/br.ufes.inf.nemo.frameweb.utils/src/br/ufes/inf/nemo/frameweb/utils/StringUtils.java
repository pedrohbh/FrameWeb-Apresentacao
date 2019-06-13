package br.ufes.inf.nemo.frameweb.utils;

public class StringUtils extends org.apache.commons.lang3.StringUtils {

	public StringUtils() {
		super();
	}
	
	public String toLower(String str, int index) throws IndexOutOfBoundsException {
		if (str == null || str.length() == 0) {
			return new String();
		}

		return str.substring(0, index) + Character.toLowerCase(str.charAt(index)) + str.substring(index + 1, str.length());
	}
	
	public String toUpper(String str, int index) throws IndexOutOfBoundsException {
		if (str == null || str.length() == 0) {
			return new String();
		}
		
		return str.substring(0, index) + Character.toUpperCase(str.charAt(index)) + str.substring(index + 1, str.length());
	}

}
