package com.first;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Methods m = new Methods();
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		m.union(set1, set2);
		m.intersect(set1, set2);
		//
	}

}
