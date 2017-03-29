package package8;

import java.util.Scanner;

public class Main {

	// Create method div(), which calculates the dividing of two double numbers.
	// In main method input 2 double numbers and call this method. Catch all
	// exceptions.
	public void div(double var1, double var2) {
		double result = 0;
		try {
			if (var2 == 0)
				throw new DividingException("Division by on zero", var1, var1);
			result = var1 / var2;
			System.out.println("result=" + result);
		} catch (DividingException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getResult());
		}

	}

	// Write a method readNumber(int start, int end), that read from console
	// integer number and return it, if it is in the range [start...end].

	public Integer readNumber(int start, int end) {
		Integer inRange = null;
		int value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input value:");
		try {
			value = sc.nextInt();
			if (value >= start && value <= end) {
				inRange = value;
			}
		} catch (NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}

		return inRange;
	}

	public static void main(String[] args) {
		Main instance = new Main();
		double var1 = 0;
		double var2 = 0;

		double[] listVar = new double[2];
		int[] intArray = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two values:");

		int count = 0;
		while (count < 2) {

			try {
				listVar[count] = Double.parseDouble(sc.next());
			} catch (NullPointerException | NumberFormatException | IllegalStateException e) {
				e.printStackTrace();
			}
			count = count + 1;
		}

		instance.div(listVar[0], listVar[1]);
		System.out.println("");

		// Using this method write a method main(), that has to enter 10
		// numbers:
		// a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
		int countInt = 0;
		Integer var = null;
		int start = 0;
		int end = 1000;
		String text = "";
		while (countInt != 10) {
			var = instance.readNumber(start, end);
			if (var != null) {
				text = (text == "") ? (text + "" + var) : (text + "<" + var);
				countInt = countInt + 1;
				start = var + 1;
				end = var + 1000;
			}
		}
		System.out.println(text);

	}

}
