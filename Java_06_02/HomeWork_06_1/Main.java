package package_6_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public String union(Set set1, Set set2) {

		Set<String> SetUnit = new HashSet<String>();
		SetUnit.addAll(set1);

		Iterator<String> iterator1 = set1.iterator();
		Iterator<String> iterator2 = set2.iterator();

		while (iterator2.hasNext()) {
			String element2 = (String) iterator2.next();
			SetUnit.add(element2);
		}

		return SetUnit.toString();
	}

	public String intersect(Set set1, Set set2) {
		String intersection = "";
		Iterator<String> iterator1 = set1.iterator();

		while (iterator1.hasNext()) {
			String element1 = (String) iterator1.next();
			if (set2.contains(element1)) {
				intersection += element1 + "; ";
			}
		}

		if (intersection != "") {
			return "Intersection of two sets: " + intersection;
		} else {
			return "Two sets have no intersection";
		}

	}

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("item11");
		set1.add("item12");
		set1.add("item13");

		Set<String> set2 = new HashSet<String>();
		set2.add("item21");
		set2.add("item22");
		set2.add("item12");
		set2.add("item23");
		set2.add("item13");

		Main instance = new Main();

		System.out.println(instance.intersect(set1, set2));

		System.out.println("Unit of two sets:" + instance.union(set1, set2));

		System.out.println("");
		// Create map personMap and add to it ten persons of type <String,
		// String> (lastName, firstName). Output the entities of the map on the
		// screen.
		Map<String, String> personMap = new HashMap();
		personMap.put("Fedorov", "Ivan");
		personMap.put("Fedorov", "Ivan");
		personMap.put("Sidorov", "Pavlo");
		personMap.put("Ivanov", "Feda");
		personMap.put("Petrov", "Orest");
		personMap.put("Lyjnikov", "Slava");
		personMap.put("Petrova", "Anna");
		personMap.put("Nebesna", "Lisa");
		personMap.put("Isotov", "Ivan");
		personMap.put("Verevochkina", "Svetlana");

		for (Iterator i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("");

		// There are at less two persons with the same firstName among these 10
		// people?
		String ExName = "";
		Map<String, Boolean> ExistedName = new HashMap();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (ExistedName.containsKey(entry.getValue()) && ExistedName.containsValue(false)) {
				ExistedName.put(entry.getValue(), true);
				ExName += entry.getValue() + " ";
			} else {
				ExistedName.put(entry.getValue(), false);
			}
		}

		System.out.println((ExName != "") ? "There are at less two persons with the same firstName:" + ExName
				: "There are no at less two persons with the same firstName");

		// Remove from the map person whose firstName is ”Orest” (or other).
		// Print result.
		Set<String> ListOfKeyForDelete = new HashSet<String>();

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue() == "Orest") {
				ListOfKeyForDelete.add(entry.getKey());
			}
		}

		System.out.println("Removing " + ListOfKeyForDelete.toString());
		System.out.println("");

		Iterator<String> iterator = ListOfKeyForDelete.iterator();

		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			personMap.remove(element);
		}

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
