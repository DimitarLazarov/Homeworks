package bank;

public class NotEnoughSalaryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughSalaryException() {
		super();
	}

	public NotEnoughSalaryException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotEnoughSalaryException(String message) {
		super(message);
	}

	public NotEnoughSalaryException(Throwable cause) {
		super(cause);

	}
}
