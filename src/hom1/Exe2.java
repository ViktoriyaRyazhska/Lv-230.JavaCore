package hom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe2 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = bf.readLine();
		System.out.println("What is your age?");
		int age = Integer.parseInt(bf.readLine());
		System.out.println("Where are you live, " + name);
		String address = bf.readLine();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);

	}

}
