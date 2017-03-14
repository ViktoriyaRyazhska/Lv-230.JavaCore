package lesson01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num a");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter num b");
		int b = Integer.parseInt(br.readLine());
		System.out.println("result of + is " + (a + b));
		System.out.println("result of - is " + (a - b));
		System.out.println("result of * is " + (a * b));
		if (b != 0) {
			System.out.println("result of / is " + (a / b));
		} else {
			System.out.println("b=0!!!");
		}

		System.out.println("How are you??");
		String answer = br.readLine();
		System.out.println("You are " + answer);

	}

}
