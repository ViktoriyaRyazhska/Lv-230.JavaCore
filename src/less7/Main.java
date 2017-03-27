package less7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// List<Integer> list = new ArrayList<Integer>();
		// Collec collec = new Collec();
		// list = collec.fillCollection(list);
		// System.out.println(list);
		// System.out.println(collec.saveInCollectionNumberMoreFive(list));
		// System.out.println(collec.removeGreaterTwenty(list));
		// collec.insertElements(list);
		// System.out.println(collec.sort(list));

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(0, "Nazar");
		employeeMap.put(1, "Oleg");
		employeeMap.put(2, "Vasya");
		employeeMap.put(3, "Bodya");
		employeeMap.put(4, "Vika");
		employeeMap.put(5, "Orest");
		employeeMap.put(6, "Filya");
		System.out.println(employeeMap);
		System.out.println("Enter id to find employee name: ");
		int id = Integer.parseInt(bf.readLine());
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getKey().equals(id)) {
				System.out.println(entry);
			} else {
				System.out.println("Can`t find id");
				break;

			}
		}
		System.out.println("Enter name to find employee id: ");
		String name = bf.readLine();

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getValue().equals(name)) {
				System.out.println(entry);
			} else {
				System.out.println("Can`t find user name");
				break;
			}
		}
	}

}
