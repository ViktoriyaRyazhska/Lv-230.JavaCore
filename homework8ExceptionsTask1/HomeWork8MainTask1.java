package homework8ExceptionsTask1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork8MainTask1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

// 1) Create method div(), which calculates the dividing of two double
// numbers.
// In main method input 2 double numbers and call this method. Catch all
// exceptions.

		System.out.println("Task1");

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Please enter two numbers of type double:");
			double doubleNumber1 = userInput.nextDouble();
			double doubleNumber2 = userInput.nextDouble();
			System.out.println(div(doubleNumber1, doubleNumber2));
		} catch (InputMismatchException e) {
			System.out.println("Entered data is not a number or has inproper format!!!");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static double div(double number1, double number2) throws ArithmeticException {
		if (number2 == 0) {
			throw new ArithmeticException("Division by zero!!!");
		}
		return number1 / number2;
	}

}
