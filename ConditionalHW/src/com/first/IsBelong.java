package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsBelong {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first number");
		float f1 = Float.parseFloat(reader.readLine());
		System.out.println("Enter second number");
		float f2 = Float.parseFloat(reader.readLine());
		System.out.println("Enter third number");
		float f3 = Float.parseFloat(reader.readLine());

		if ((f1 >= -5 && f1 <= 5) && (f2 >= -5 && f2 <= 5) && (f3 >= -5 && f3 <= 5)) {
			System.out.println("All numbers are belong to the range [-5; 5]");
		}else if (!(f1 >= -5 && f1 <= 5)) {
			System.out.println("First number isn`t belong to the range");
		}else if (!(f2 >= -5 && f2 <= 5)) {
			System.out.println("Second number isn`t belong to the range");
		}else if (!(f3 >= -5 && f3 <= 5)) {
			System.out.println("Third number isn`t belong to the range");
		}
		

	}
}
