package br.com.cavy.studios.nutrisys.exception;

public class ServiceException extends RuntimeException {

	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(Throwable e) {
		super(e);
	}
	
	public ServiceException(String message, Throwable e) {
		super(message, e);
	}
	
}
