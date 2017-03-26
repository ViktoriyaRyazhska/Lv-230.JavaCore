import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
        students.add(new Student("Andriy", 3));
        students.add(new Student("John", 1)); 
        students.add(new Student("Andriy", 2));
        students.add(new Student("Smith", 1));
        students.add(new Student("Jeronimo", 5));
        
        
        Collections.sort(students, Student.getNameComparator());
        System.out.println(students);
		
        Collections.sort(students, Student.getCourseComparator());
        System.out.println(students);

	}

}
