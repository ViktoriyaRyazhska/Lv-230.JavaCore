package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

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

public class Person {
	private String name;
	private short birthYear;
	private static short yearNow = (short) Calendar.getInstance().get(Calendar.YEAR);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(short birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public Person(String name, short birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public short ageCount() {
		short age = (short) (Person.yearNow - birthYear);
		return age;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is the name of the Person?");
		this.name = br.readLine();
		System.out.println("What is the year of the Person birth?");
		this.birthYear = Short.parseShort(br.readLine());
	}

	public void output() throws IOException {
		System.out.println(this.name + " is " + ageCount() + "years old.");
	}

	public void changeName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is the new name of the Person?");
		this.name = br.readLine();

	}

	@Override
	public String toString() {
		return name + " is " + ageCount() + " years old";
	}
}
