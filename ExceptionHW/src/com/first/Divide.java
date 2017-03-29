package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two double numbers");

		try {
			double a = Double.parseDouble(br.readLine());
			double b = Double.parseDouble(br.readLine());

			System.out.println(div(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("Input(Output) exception!");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format!");
		}
	}
	
	public static double div(double a, double b) throws ArithmeticException {
		if (b != 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Dividing on zero!");
		}
}

}
