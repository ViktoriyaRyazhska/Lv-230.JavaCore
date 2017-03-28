package hom6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// Set<Integer> set = new HashSet<Integer>();
		// Set<Integer> set2 = new HashSet<Integer>();
		// set.add(0);
		// set.add(2);
		// set.add(3);
		// set.add(4);
		// set.add(1);
		// set.add(7);
		// set.add(8);
		// set.add(9);
		// System.out.println("set1: " + set);
		// set2.add(2);
		// set2.add(7);
		// set2.add(8);
		// set2.add(9);
		// set2.add(0);
		// set2.add(5);
		// set2.add(6);
		// System.out.println("set2: " + set2);
		// Hwset hwset = new Hwset();
		// System.out.println(hwset.union(set, set2));
		// System.out.println(hwset.intersect(set, set2));

		// Map<String, String> personMap = new HashMap<String, String>();
		// personMap.put("Fylypyshyn", "Nazar");
		// personMap.put("Lesyk", "Taras");
		// personMap.put("Burtnyk", "Oleksander");
		// personMap.put("Laba", "Rostyslav");
		// personMap.put("Gatala", "Andriy");
		// personMap.put("Kolesnyk", "Valentyn");
		// personMap.put("Balyas", "Bogdan");
		// personMap.put("Pytel", "Bogdan");
		// personMap.put("Leskiv", "Oles");
		// personMap.put("Krupnyk", "Vitaliy");
		// hwset.print(personMap);
		// System.out.println("Enter name: ");
		// hwset.removeByFirstname(personMap, bf.readLine());
		// hwset.print(personMap);
		List<Student> list = new ArrayList<>();
		list.add(new Student("Nazar", 1));
		list.add(new Student("Oleg", 2));
		list.add(new Student("Vika", 3));
		list.add(new Student("Orest", 4));
		list.add(new Student("Lesyk", 5));

		Student student = new Student();
		System.out.println("Enter number of course: ");
		student.printStudent(list, Integer.parseInt(bf.readLine()));
		list.sort(student.getNameComparator());
		System.out.println("Sort by name");
		for (Student student2 : list) {
			System.out.println(student2);
		}
		list.sort(student.getCourseComparator());
		System.out.println("Sort by course");
		for (Student student2 : list) {
			System.out.println(student2);
		}
	}

}
