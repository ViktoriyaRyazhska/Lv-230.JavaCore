package homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HomeWork6Main {

	public static void main(String[] args) {

// 1) Write parameterized methods union(Set set1, Set set2) and
// intersect(Set set1, Set set2),
// realizing the operations of union and intersection of two sets.
// Test the operation of these techniques on two pre-filled sets.
// (Input and Output):

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			set1.add(rand.nextInt(20));
			set2.add(rand.nextInt(20));
		}

		System.out.println("Task 1");
		System.out.println("Set1 is: " + set1);
		System.out.println("Set2 is: " + set2);

		System.out.println("Union is: " + union(set1, set2));
		System.out.println("Intersection is: " + intersect(set1, set2));
		System.out.println();

// 2) Create map personMap and add to it ten persons of type <String,
// String> (lastName, firstName). Output the entities of the map on the screen.
// There are at less two persons with the same firstName among these 10 people?
// Remove from the map person whose firstName is ”Orest” (or other). Print result.
// (Input and Output):

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Jones", "Adam");
		personMap.put("Keenan", "James");
		personMap.put("Mercury", "Fredie");
		personMap.put("Gontier", "Adam");
		personMap.put("Young", "Angus");
		personMap.put("Morello", "Tom");
		personMap.put("Pupkin", "Orest");
		personMap.put("Taylor", "Corey");
		personMap.put("James", "Andy");
		personMap.put("Clapton", "Eric");

		System.out.println("Task 2");
		mapOutput(personMap);
		valuesDublicatesDetection(personMap);
		removeByValue(personMap, "Orest");
		mapOutput(personMap);
		System.out.println();
		
// 3) Write class Student that provides information about the name of the student and his course.
// Class Student should consists of:
//		a) properties for access to these fields; 
// 		b) constructor with parameters;
//		c) method printStudents (List students, Integer course),
//		which receives a list of students and the course number 
//		and prints to the console the names of the students from the list,
// 		which are taught in this course (use an iterator);
//		d) methods to compare students by name and by course
//		e) In the main() method:
//			- declare List students and add to the list five different students
//			- display the list of students ordered by name
//			- display the list of students ordered by course.
// (Input and Output):

		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Tom Morello", 1));
		students.add(new Student("Zakk Wylde", 3));
		students.add(new Student("Jimmy Page", 2));
		students.add(new Student("John Frusciante", 2));
		students.add(new Student("Andy James", 3));

		System.out.println("Task 3");
		Student.printStudents (students, 2);
		
		System.out.println("Students ordered by Name: ");
		students.sort(Student.getNameComparator());
		arrayListOutput(students);

		
		System.out.println("Students ordered by Course: ");
		students.sort(Student.getCourseComparator());
		arrayListOutput(students);
		
	}
	
// 1) Write parameterized methods union(Set set1, Set set2) and
// intersect(Set set1, Set set2),
// realizing the operations of union and intersection of two sets.
// Test the operation of these techniques on two pre-filled sets.
// (Solution methods):

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> unionSet = new HashSet<T>(set1);
		unionSet.addAll(set2);
		return unionSet;

	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> intersectSet = new HashSet<T>(set1);
		intersectSet.retainAll(set2);
		return intersectSet;
	}

// 2) Create map personMap and add to it ten persons of type <String,
// String> (lastName, firstName). Output the entities of the map on the screen.
// There are at less two persons with the same firstName among these 10 people?
// Remove from the map person whose firstName is ”Orest” (or other). Print result.
// (Solution methods):
	
	public static <T> void mapOutput(Map<T, T> map) {
		System.out.println("The entities of the map is:");
		for (Map.Entry<T, T> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "		" + entry.getValue());
		}
	}
	
	public static <T> void valuesDublicatesDetection(Map<T, T> map) {
		Set<T> personNameSet = new HashSet<T>();
		personNameSet.addAll(map.values());
		if (personNameSet.size() < map.size()) {
			System.out.println("There are some people with same first names within map personMap.");
		} else {
			System.out.println("Every person within map personMap has unique first name.");
		}
	}
	
	public static <T> void removeByValue(Map<T, T> map, T name) {
		System.out.println("Removing persons with first name = " + name);
		for (Map.Entry<T, T> entry : map.entrySet()) {
			if (entry.getValue() == name){
				map.remove(entry.getKey());
			}
		}
	}

// 3) Output Help Solution:	
	public static <T> void arrayListOutput(List<T> list) {
		Iterator<T> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
