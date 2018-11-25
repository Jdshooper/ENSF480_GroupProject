/**
 * @author Jiexuan Li
 *
 */

package Exceptions;

public class NoDatabaseConnectionException extends Exception {

	/**
	 * methods are inherited from Exception
	 */
	public NoDatabaseConnectionException() {
		super();
	}

	/**
	 * @param message is the message displayed
	 */
	public NoDatabaseConnectionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause is the cause.
	 */
	public NoDatabaseConnectionException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message is the message displayed
	 * @param cause is what caused it
	 */
	public NoDatabaseConnectionException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
