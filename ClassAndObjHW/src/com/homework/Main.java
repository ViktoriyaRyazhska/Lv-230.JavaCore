package com.homework;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.input("Roman", 1995, "male");
		p1.changeName("Kolya");
		p1.output(p1);
		
		Person p2 = new Person();
		p2.input("Olya", 2000, "female");
		p2.output(p2);
		
		Person p3 = new Person("Igor", 1950, "male");
		p3.changeName("Yura");
		p3.output(p3);
		
		Person p4 = new Person();
		p4.input("Vika", 1990, "female");
		p4.output(p4);
		
		Person p5 = new Person("Bodya", 1988, "male");
		p5.output(p5);
		
	}
}
