package pcHW3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	private int birthYear;
	
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
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Person() {
		
	}
	
	public int age(){
		
		Calendar c = new GregorianCalendar();
		int currYear = c.get(Calendar.YEAR);	
		return  currYear - this.birthYear;		
	}
	
	public void input(String name, int birthYear){
		this.name = name;
		this.birthYear = birthYear;
	}
	
	//output method
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	
	
	
	
	
	
	
	

}
