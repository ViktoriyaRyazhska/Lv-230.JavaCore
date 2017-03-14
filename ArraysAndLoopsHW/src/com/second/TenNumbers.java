package com.second;

import java.util.Scanner;

public class TenNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How much elements you wont to input?:");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter each element:");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Inserted array elements:");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0) {
				count += arr[i];
			} else {
				count = 1;
				for (int c = 5; c < 10; c++) {
					count = count * arr[c];
					System.out.println(arr[c]);
				}
			}

		}
		System.out.println(count);
		s.close();
	}

}
