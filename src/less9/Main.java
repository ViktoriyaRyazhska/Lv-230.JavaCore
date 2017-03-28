package less9;

public class Main {

	public static void main(String[] args) {

		Calculating calculating = new Calculating();

		try {
			System.out.println(calculating.squareRectangle(2, -3));
		} catch (ArithmeticException a) {
			System.err.println(a.getMessage());
		}

	}

}
