package hw07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
//Task 1
		Coll coll = new Coll();
		HashSet<Integer>set1 = (HashSet<Integer>) coll.fillSet();
		HashSet<Integer>set2 = (HashSet<Integer>) coll.fillSet();
		
		Iterator<Integer>it1 = set1.iterator();
		while(it1.hasNext()){
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		Iterator<Integer>it2 = set2.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		Set<Integer> unitedSet = union(set1, set2);
		Iterator<Integer> it3 = unitedSet.iterator();
		while(it3.hasNext()){
			System.out.print(it3.next()+" ");
		}
		System.out.println();
		Set<Integer> intersectedSet =intersect(set1, set2);
		Iterator<Integer>it4 = intersectedSet.iterator();
		while(it4.hasNext()){
			System.out.print(it4.next()+" ");
		}
		
// Task 2
		System.out.println();
		HashMap<Integer, Person> personMap = new HashMap<>();
		personMap.put(1, new Person("Ivan", "Ivanov"));
		personMap.put(2, new Person("Pavlo", "Pliestsov"));
		personMap.put(3, new Person("Anton", "Chehov"));
		printMap(personMap);
		System.out.println("Enter name to remove");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		removeByFirstName(personMap, name);
		System.out.println();
		printMap(personMap);
		br.close();
		
// Task 3
		
		
		
	}
	
	private static HashMap<Integer, Person> removeByFirstName(Map<Integer, Person> personMap, String name){
		Set<Entry<Integer, Person>> person = personMap.entrySet();
		Iterator<Entry<Integer, Person>>it = person.iterator();
		while(it.hasNext()){
			if(it.next().getValue().getFirstName().equals(name)){
				it.remove();
			}
		}
		return (HashMap<Integer, Person>) personMap;
	}
	
	private static Map<Integer, Person> printMap(Map<Integer, Person> personMap){
		for (Entry<Integer, Person> entry : personMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		return personMap;
	}
	
	private static Set<Integer> union(Set<Integer>set1, Set<Integer>set2){
		HashSet<Integer>set3 = new HashSet<>(set1);
		set3.addAll(set2);
		return set3;
	}
	private static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		set1.retainAll(set2);
		return set1;
	}

}
