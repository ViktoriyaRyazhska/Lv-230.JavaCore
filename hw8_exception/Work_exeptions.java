package hw8;

import java.util.Scanner;

public class Work_exeptions {
	private static Scanner sc;


	//task 1
	public static double div(double number1, double number2) throws ArithmeticException {
		if (number2 == 0) {
			throw new ArithmeticException("Dividing by zero!");
		}
		return number1 / number2;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter two double numbers:");
			double double_n1 = sc.nextDouble();
			double double_n2 = sc.nextDouble();
			System.out.println(div(double_n1, double_n2));
			sc.close();
		} catch (ArithmeticException  e) {
			System.out.println(e.getMessage());
		}
		//task 2
		System.out.println("Enter range");
		
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			readNumber(n1,n2);
		} catch (NumberFormatException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}


	public static int readNumber(int start, int end) throws NumberFormatException {
		
		System.out.println("Please enter number:");
		Integer number = Integer.parseInt(sc.nextLine());
		if (number < start || number > end) {
			throw new ArithmeticException("Out of range");
		} else {
			return number;
		}
	}
}
