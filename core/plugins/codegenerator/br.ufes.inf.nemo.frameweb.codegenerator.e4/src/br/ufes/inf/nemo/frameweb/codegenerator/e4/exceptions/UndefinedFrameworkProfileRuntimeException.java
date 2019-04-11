package br.ufes.inf.nemo.frameweb.codegenerator.e4.exceptions;

public class UndefinedFrameworkProfileRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;
	
	public UndefinedFrameworkProfileRuntimeException() {}
	
	public UndefinedFrameworkProfileRuntimeException(String message) {
		this.message = message;
	}

	public String toString() {
		return "Undefined FrameworkProfile" + (message == null ? "" : "::" + message);
	}
	
}
