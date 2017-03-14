package com.third;

import java.util.Scanner;

public class FindMinimumAndPosition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How much elements you wont to input?:");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter each element:");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Inserted elements:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
				if (count == 2) {
					System.out.println("Second positive element = " + arr[i]);
				}
			}

		}
		int min = arr[0];
		int positionMin = 0;
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] < min) {
				min = arr[a];
				positionMin = a;
				
			}
		}
		System.out.println("Min = " + min+ ", and it is on position " + (positionMin+1));
	}

}
