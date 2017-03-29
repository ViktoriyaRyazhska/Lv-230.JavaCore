package com.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {
	
	public Integer readNumber() throws IOException, MyNumberException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start and end number");

		try {
			int start = Integer.parseInt(reader.readLine());
			int end = Integer.parseInt(reader.readLine());
			System.out.println("Enter number");
			int a = Integer.parseInt(reader.readLine());
			if ((a >= start) && (a <= end)) {
				return a;
			} else {
				throw new MyNumberException("Invalid number");
			}
		} catch (NumberFormatException e) {
			throw new MyNumberException("Not a number");
		}
}

}
