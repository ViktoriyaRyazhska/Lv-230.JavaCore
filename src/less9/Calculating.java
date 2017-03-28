package less9;

public class Calculating {

	public int squareRectangle(int width, int height) throws ArithmeticException {
		if (width < 0 || height < 0) {
			throw new ArithmeticException();
		}
		return width * height;

	}

}
