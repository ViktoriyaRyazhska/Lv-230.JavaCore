package com.first;

import java.util.HashSet;
import java.util.Set;

public class Methods {

	public void union(Set set1, Set set2) {
		Set set = new HashSet(set1);
		set.addAll(set2);
		System.out.println("Union = " + set);
	}

	public void intersect(Set set1, Set set2) {
		Set set = new HashSet(set1);
		set.retainAll(set2);
		System.out.println("Intersected  = " + set);
	}

}
