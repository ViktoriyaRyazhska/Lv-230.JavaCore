package hom8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HwException exception = new HwException();
		// try {
		// System.out.println(exception.div(3, 0));
		// } catch (ArithmeticException e) {
		// System.err.println(e.getMessage());
		// e.printStackTrace();
		// }
		System.out.println("Enter number1, number2 ");
		try {
			exception.readNumber(Integer.parseInt(bf.readLine()), Integer.parseInt(bf.readLine()));
		} catch (MyException | NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
