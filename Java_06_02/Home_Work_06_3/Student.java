package package06_02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int n_course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return n_course;
	}

	public void setCourse(int n_course) {
		this.n_course = n_course;
	}

	public Student(String name, int n_course) {
		super();
		this.name = name;
		this.n_course = n_course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + n_course + "]";
	}

	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
		}
	}

	static NameComparator nameComparator = new NameComparator();

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	static class CourseComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).n_course - ((Student) o2).n_course;
		}

	}

	static CourseComparator courseComparator = new CourseComparator();

	public static Comparator getCourseComparator() {
		return courseComparator;
	}

	public static void printStudent(List<Student> students, int course) {
		System.out.println("Printing students from course number:" + course);

		Iterator iterator = students.iterator();
		while (iterator.hasNext()) {
			Student element = (Student) iterator.next();
			if (element.getCourse() == course) {
				System.out.println(element);
			}
		}

		System.out.println("");

	}
}
