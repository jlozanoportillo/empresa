package controller.model.exception;

public class LoginError extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginError(String message) {
		super(message);
	}
	
	public LoginError() {
		super();
	}
}
