package homework2;

import java.io.IOException;

//Create Console Application project in Java.
//Add class Person to the project. Class Person should consists of:
//-two private fields: name and birthYear (the birthday year); 
//-properties for access to these fields;
//-default constructor and constructor with 2 parameters; 
//-methods:
//---age - to calculate the age of person
//---input - to input information about person
//---output - to output information about person
//---changeName - to change the name of person
//In the method main() create 5 objects of Person type and input information about them.

public class HomeWork2 {

	public static void main(String[] args) throws IOException {

		Person person1 = new Person();
		person1.setName("Borys");
		person1.setBirthYear((short) 1954);

		Person person2 = new Person("Yaroslav", (short) 1958);

		Person person3 = new Person("Anna", (short) 1959);

		Person person4 = new Person("Iryna", (short) 1963);

		Person person5 = new Person();
		person5.input();

		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);

		person5.changeName();
		person5.output();

	}
}