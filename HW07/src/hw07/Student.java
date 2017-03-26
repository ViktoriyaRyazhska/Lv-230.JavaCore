package hw07;

import java.util.Comparator;

public class Student{
	
	private String name;
	private Integer course;
	static CompareByName compareByName = new CompareByName();
	static CompareByCourse compareByCourse = new CompareByCourse();
	
	public static Comparator getnameComparator() {
		
		return compareByName;
	}
	public static Comparator getcourseComparator() {
		return compareByCourse;
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
	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	static class CompareByName implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	static class CompareByCourse implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse().compareTo(o2.getCourse());
		}
		
	}
}
