package hom2;

public class Person {

	private String name;
	private int birthYear;
	private String about;

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public void age() {
		System.out.println("Age: " + (2017 - birthYear));

	}

	public void input(String about) {
		this.about = about;
	}

	public String output() {
		return about;
	}

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

	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", about=" + about + "]";
	}

}
