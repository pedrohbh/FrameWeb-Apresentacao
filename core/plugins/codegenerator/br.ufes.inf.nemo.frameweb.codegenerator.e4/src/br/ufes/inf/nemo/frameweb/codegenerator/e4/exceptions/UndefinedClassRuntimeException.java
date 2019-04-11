package br.ufes.inf.nemo.frameweb.codegenerator.e4.exceptions;

public class UndefinedClassRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;
	
	public UndefinedClassRuntimeException() {}
	
	public UndefinedClassRuntimeException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "Undefined Class" + (message == null ? "" : "::" + message);
	}
	
}
