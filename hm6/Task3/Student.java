import java.util.Comparator;
import java.util.List;


public class Student {

	private String name;
	private int course;
	private static NameComparator nameComparator = new NameComparator( );
	private static CourseComparator courseComparator = new CourseComparator();	
	
	
	
	
	public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getCourse(){
		return course;
	}
	
	public void setCourse(int course){
		this.course = course;
	}
	
	   public static Comparator getNameComparator( ) {
	        return nameComparator;
	    }

	    public static Comparator getCourseComparator( ) {
	        return courseComparator;
	    }
	   
	    
	    static class NameComparator implements Comparator {
	        public int compare(Object o1, Object o2) {
	            return ((Student)o1).getName().compareTo(((Student)o2).getName());
	        }
	    }
	    
	    static class CourseComparator implements Comparator {
	        public int compare(Object o1, Object o2) {
	            return ((Student)o1).getCourse() - ((Student)o2).getCourse();
	        }
	    }
	    
	    	public void printStudents(List<Student> students, Integer course) {
	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).getCourse() == course) {
	                System.out.println(students.get(i).getName());
	            }
	        }
	    }
	
	
	public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
	
	}
}
