package hw6_2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Person {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Poroshenko", "Petro");
		personMap.put("Tumoshenko", "Yulia");
		personMap.put("Groisman", "Volodumr");
		personMap.put("Zinkevuch", "Volodumr");
		personMap.put("Yanukovuch", "Victor");
		personMap.put("Yushchenko", "Victor");
		personMap.put("Lazarenko", "Pavlo");
		personMap.put("Zagorodniy", "Orest");
		personMap.put("Guk", "Orest");
		personMap.put("Gruk", "Andriy");
		personMap.put("Plug", "Pavlo");
		
		showMap(personMap);
		remove(personMap,"Orest");
		isDublicate(personMap);
	        
		
        
		
	}
	
	public static void showMap(Map<String, String> map){
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        System.out.println();
    }
	
	public static  void remove(Map<String, String> map, String name) {
		Set<String> key = new HashSet<String>();

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue() == name) {
				key.add(entry.getKey());
			}
		}

		Iterator<String> iterator = key.iterator();

		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			map.remove(element);
		}
		showMap(map);
	}
	
	public static void isDublicate(Map<String, String> map) {
		Set<String> name = new HashSet<String>();
		name.addAll(map.values());
		if (name.size() < map.size()) {
			System.out.println("There are  people with same first name.");
		}
	}
}