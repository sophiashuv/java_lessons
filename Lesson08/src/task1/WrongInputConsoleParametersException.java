package task1;
import java.io.IOException;

public class WrongInputConsoleParametersException extends Exception{
	private String message;
	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}

}
