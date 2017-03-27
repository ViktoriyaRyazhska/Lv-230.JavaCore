package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FiveWords {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the sentence of five words");
		String sentence = br.readLine();
		String[] a = sentence.split(" ");
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > tmp) {
				tmp = a[i].length();
			}
		}
		for (String word : a) {
			if (word.length() == tmp) {
				System.out.println("The longest word in the sentence = " + word);
			}
		}
		System.out.println("The number of its letters = " + tmp);
		System.out.println("The second word in reverse order =  " + new StringBuilder(a[1]).reverse().toString());
		
		

	}

}
