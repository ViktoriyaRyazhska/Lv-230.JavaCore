package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxAndMin {
	public static void main(String[] args) throws IOException  {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first number");
		int first = Integer.parseInt(reader.readLine());

		System.out.println("Enter second number");
		int second = Integer.parseInt(reader.readLine());

		System.out.println("Enter third number");
		int third = Integer.parseInt(reader.readLine());

		int max = 0;
		int min = 0;

		if (first > second && first > third) {
			max = first;
		} else if (second > first && second > third) {
			max = second;
		} else if (third > first && third > second) {
			max = third;
		}

		if (first < second && first < third) {
			min = first;
		} else if (second < first && second < third) {
			min = second;
		} else {
			min = third;
		}
		System.out.println("MAX = " + max + ";" + " MIN = " + min);
	}
	
}
