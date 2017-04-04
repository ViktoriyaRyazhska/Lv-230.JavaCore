package homework8ExceptionsTask2;

public class MyNumberIsOutOfRangeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Entered value is out of method arguments range.";
	}

}
