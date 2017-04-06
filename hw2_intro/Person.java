package hw3;
import java.util.*;

public class Person {
	private String name;
	private int birthYear;
	Person(){}
	Person(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getbirthYear() {
		return birthYear;
	}

	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void age(){
		
		System.out.println("Age = " + (Calendar.YEAR - birthYear));
		
	}
	
	public void input(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	public void output(){
		System.out.println("Person name = " + this.name + "date of birth" + this.birthYear);
	}
	public void changeName(String name) {
		this.name = name;
	}
}


class Do{
	public static void main(String[] args) { 
	Person p1 = new Person("Ira",1980);
	Person p2 = new Person("Andrii",1987);
	Person p3 = new Person("Oleg",1984);
	Person p4 = new Person();
	Person p5 = new Person();
	p1.changeName("Alina");
	p2.output();
	p3.age();
	p4.input("Ilona",1992);
	p5.setName("Ihor");
	p5.setbirthYear(1999);
	}	
}
