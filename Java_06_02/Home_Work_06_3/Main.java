package package06_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Anna", 10));
		list.add(new Student("Vacheslav", 9));
		list.add(new Student("Olga", 8));
		list.add(new Student("Igor", 10));
		list.add(new Student("Veronika", 5));

		Student.printStudent(list, 10);

		System.out.println("Printing ordered by course name");
		Set<Student> listOrderedByName = new TreeSet(Student.getNameComparator());
		listOrderedByName.addAll(list);
		System.out.println(listOrderedByName);
		System.out.println(" ");
		System.out.println("Printing ordered by course number");
		Set<Student> listOrderedByCourse = new TreeSet(Student.getCourseComparator());
		listOrderedByCourse.addAll(list);
		System.out.println(listOrderedByCourse);

	}

}
