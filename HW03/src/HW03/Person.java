package HW03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	
	private String name;
	private int birthYear;
	private String info;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Person() {
	}
	
	public int age(){
		Calendar calendar = new GregorianCalendar();
		int currentYear = calendar.get(Calendar.YEAR);
		return currentYear-birthYear;
	}
	
	public void changeName(String newName){
		this.name = newName;
	}
	
	public void input(String info){
		this.info = info;
	}
	
	public String output() {
		return info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", age()=" + age() + ", output()=" + output()
				+ "]";
	}
	
	

}
