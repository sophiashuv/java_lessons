public class WrongTimeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	static final String message = "Wrong tome input!";

	public WrongTimeException() {
		super(message);
	}
}