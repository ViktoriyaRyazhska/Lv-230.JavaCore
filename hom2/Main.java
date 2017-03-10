package hom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Person person = new Person();
		System.out.println("Enter name: ");
		person.setName(bf.readLine());
		System.out.println("Enter birth year: ");
		person.setBirthYear(Integer.parseInt(bf.readLine()));
		System.out.println("Input information about person: ");
		person.input(bf.readLine());
		System.out.println("Change name(1 - yes, 2 - no)? ");
		if (Integer.parseInt(bf.readLine()) == 1) {
			System.out.println("Enter name: ");
			person.setName(bf.readLine());
		}

		System.out.println("About person: " + person);

		person.age();
		Person person2 = new Person("Vasya", 1996);
		System.out.println();
		System.out.println("Input information about person2: ");
		person2.input(bf.readLine());
		System.out.println("About person: " + person2);
		person2.age();
		
		Person person3 = new Person();
		System.out.println("Enter name: ");
		person3.setName(bf.readLine());
		System.out.println("Enter birth year: ");
		person3.setBirthYear(Integer.parseInt(bf.readLine()));
		System.out.println("Input information about person: ");
		person3.input(bf.readLine());
		System.out.println("Change name(1 - yes, 2 - no)? ");
		if (Integer.parseInt(bf.readLine()) == 1) {
			System.out.println("Enter name: ");
			person3.setName(bf.readLine());
		}

		System.out.println("About person: " + person3);

		person3.age();
		
		Person person4 = new Person("Oleg", 1997);
		System.out.println("Input information about person2: ");
		person4.input(bf.readLine());
		System.out.println("About person: " + person4);
		person4.age();
		

	}

}
