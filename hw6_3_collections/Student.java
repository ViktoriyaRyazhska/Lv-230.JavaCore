package hw6_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Student {

	private String name;
	private Integer course;
	static CompareByName compareByName = new CompareByName();
	static CompareByCourse compareByCourse = new CompareByCourse();

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

	public Student() {}

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

	private static class CompareByName implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	private static class CompareByCourse implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}

	}

	public static Comparator<Student> getNameComparator() {
		return new CompareByName();
	}

	public static Comparator<Student> getCourseComparator() {
		return new CompareByCourse();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
}

class Do{
	
	public static void main(String[] args){

		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ivan", 1));
		list.add(new Student("Oleg", 2));
		list.add(new Student("Ihor", 3));
		list.add(new Student("Orest", 4));
		list.add(new Student("Oliya", 5));
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter number of course: ");
		Student.printStudents(list, Integer.parseInt(sc.nextLine()));
		list.sort(Student.getNameComparator());
		System.out.println("Sort by name");
		for (Student student : list) {
			System.out.println(student);
		}
		list.sort(Student.getCourseComparator());
		System.out.println("Sort by course");
		for (Student student : list) {
			System.out.println(student);
		}
		
		sc.close();
}
}

