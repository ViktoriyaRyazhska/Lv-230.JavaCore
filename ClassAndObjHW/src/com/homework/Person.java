package com.homework;

public class Person {

	private String name;
	private int birthYear;
	private String sex;

	public Person() {
	}

	public Person(String name, int birthYear, String sex) {
		this.name = name;
		this.birthYear = birthYear;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person name=" + name + ", birthYear=" + birthYear ;
	}

	public static Integer age(Person person) {
		return 2017 - person.getBirthYear();
	}

	public void input(String name, int birthYear, String sex) {
		this.name = name;
		this.birthYear = birthYear;
		this.sex = sex;
	}

	public void output(Person person) {
		System.out.println("Name is " + person.getName());
		System.out.println("Birthday year - " + person.getBirthYear());
		if (person.getSex().equals("male")) {
			System.out.println("He is " + age(person) + " years old");
		} else {
			System.out.println("She is " + age(person) + " years old");
		}
		System.out.println();
	}

//	public void output(Person person){
//		System.out.println(person);
//	}
	
	public void changeName(String name) {
		this.name = name;
	}

}
