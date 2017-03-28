package hom6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hwset {

	public Set<Integer> union(Set<Integer> set, Set<Integer> set2) {
		set.addAll(set2);
		return set;
	}

	public Set<Integer> intersect(Set<Integer> set, Set<Integer> set2) {
		set.retainAll(set2);
		return set;
	}

	public void print(Map<String, String> personMap) {
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry);
		}
	}

	public Map<String, String> removeByFirstname(Map<String, String> map, String firtsName) {
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			if (entry.getValue().equals(firtsName)) {
				iterator.remove();
			}
		}
		return map;
	}
}
