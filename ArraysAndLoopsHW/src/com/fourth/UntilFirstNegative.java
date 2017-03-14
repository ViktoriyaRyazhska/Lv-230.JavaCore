package com.fourth;

import java.util.Scanner;

public class UntilFirstNegative {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int i = 0;
		int sum = 0;
		Scanner s = new Scanner(System.in);

		for (int element : arr) {

			System.out.print("Enter " + (i + 1) + " element: ");
			arr[i] = s.nextInt();
			sum += arr[i];
			if (arr[i] < 0) {
				System.out.println("entered negative number, sum of all positive numbers = " + (sum - arr[i]));
				break;
			} else {
				i++;
			}
		}
	}

}
