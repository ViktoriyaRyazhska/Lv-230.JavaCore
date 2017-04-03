package hom6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private Integer course;

	public Student() {

	}

	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}

	public void printStudent(List<Student> list, Integer course) {
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getCourse().equals(course)) {
				System.out.println(student);
			}
		}

	}

	private static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	private static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}

	}

	public static Comparator<Student> getNameComparator() {
		return new NameComparator();
	}

	public static Comparator<Student> getCourseComparator() {
		return new CourseComparator();
	}

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}