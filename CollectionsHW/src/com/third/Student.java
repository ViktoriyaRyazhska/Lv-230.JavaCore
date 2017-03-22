package com.third;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private Integer course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public Student() {
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCourse()==course) {
				System.out.println(iterator.next());
			}
			
		}

	}

	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
		}
	}

	static class CourseComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).getCourse() - ((Student) o2).getCourse();
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
