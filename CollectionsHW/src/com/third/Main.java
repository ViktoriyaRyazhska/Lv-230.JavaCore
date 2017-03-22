package com.third;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Roman", 4));
		students.add(new Student("Igor", 5));
		students.add(new Student("Olya", 1));
		students.add(new Student("Andrii", 3));
		students.add(new Student("Yura", 4));
		

		students.sort(new Student.NameComparator());
		for (Student stud : students) {
			System.out.println(stud);
		}
		System.out.println();
		students.sort(new Student.CourseComparator());
		for (Student stud : students) {
			System.out.println(stud);
		}
		
		System.out.println();
		
		Student.printStudents(students, 4);
	}

}
