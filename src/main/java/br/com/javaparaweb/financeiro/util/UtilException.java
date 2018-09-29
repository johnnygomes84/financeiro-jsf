package br.com.javaparaweb.financeiro.util;

public class UtilException extends Exception {

	public UtilException() {
		
	}

	public UtilException(String message) {
		super(message);
		
	}

	public UtilException(Throwable cause) {
		super(cause);
		
	}

	public UtilException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UtilException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
