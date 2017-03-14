package com.first;

import java.util.Scanner;

public class Months {
	public static void main(String[] args) {

		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter number of month");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println("in this month " + month_days[i - 1] + " days");
		s.close();

	}

}
