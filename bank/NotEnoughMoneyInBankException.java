package bank;

public class NotEnoughMoneyInBankException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughMoneyInBankException() {
		super();
	}

	public NotEnoughMoneyInBankException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotEnoughMoneyInBankException(String message) {
		super(message);
	}

	public NotEnoughMoneyInBankException(Throwable cause) {
		super(cause);

	}
}
