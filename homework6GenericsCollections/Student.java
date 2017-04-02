package homework6;

//3) Write class Student that provides information about the name of the student and his course.
//Class Student should consists of:
//		a) properties for access to these fields; 
//		b) constructor with parameters;
//		c) method printStudents (List students, Integer course),
//		which receives a list of students and the course number 
//		and prints to the console the names of the students from the list,
//		which are taught in this course (use an iterator);
//		d) methods to compare students by name and by course
//		e) In the main() method:
//			- declare List students and add to the list five different students
//			- display the list of students ordered by name
//			- display the list of students ordered by course.

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	private String name;
	private Integer course;
	
	static NameComparator nameComparator = new NameComparator( );
	static CourseComparator courseComparator = new CourseComparator();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	public static NameComparator getNameComparator() {
		return nameComparator;
	}
	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static void printStudents (List<Student> students, Integer course){
		System.out.println("Following students study course " + course);
		Iterator<Student> i = students.iterator();
		while(i.hasNext()) {
			Student st =  i.next();
			if(st.course == course){
				System.out.println(st.name);
			}
		}
	}
	

	
	@Override
	public String toString() {
		return name + "		" + course;
	}
	
	static class NameComparator implements Comparator<Student>{
	    @Override
	    public int compare(Student st1, Student st2) {
	        return st1.name.compareTo(st2.name);
	    }
	}
	
	static class CourseComparator implements Comparator<Student>{
	    @Override
	    public int compare(Student st1, Student st2) {
	        return st1.course - st2.course;
	    }
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
