package com.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Persons {
	public static void main(String[] args) throws IOException {

		Map<String, String> personMap = new HashMap<>();

		personMap.put("Vasyliuk", "Andrii");
		personMap.put("vaskiv", "Ivan");
		personMap.put("Hnedko", "Bogdan");
		personMap.put("Horbach", "Mykola");
		personMap.put("Zubrytski", "Nazar");
		personMap.put("Lemyk", "Bohdam");
		personMap.put("Martyshchuk", "Roman");
		personMap.put("Melnichek", "Nazar");
		personMap.put("Solovei", "Roman");
		personMap.put("Vaskiv", "Ivan");
		personMap.put("Chuchman", "Roman");

		System.out.println(personMap);

		int count1 = 0;
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			int count = 0;
			for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
				if (entry.getValue().equals(entry1.getValue())) {
					count++;
				}
				if (count > 1) {
					count1++;
				}
			}
		}
		if (count1 > 1) {
			System.out.println("There are at less two persons who have same firstName");
		} else {
			System.out.println("There are not persons with the same firstName");
		}

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter firstName of perso to remove:");
		String firstname = r.readLine();

		Set<String> toRemove = new HashSet<>();

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue().equals(firstname)) {
				toRemove.add(entry.getKey());
			}
		}
		System.out.println("Will be removed " + toRemove);

		for (String string : toRemove) {
			personMap.remove(string);
		}

		System.out.println(personMap);

	}
}
