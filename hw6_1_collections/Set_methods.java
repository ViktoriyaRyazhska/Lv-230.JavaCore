package hw6_1;

import java.util.HashSet;
import java.util.Set;

public class Set_methods {
	

	    public static void main(String[] args) {
	        
	        Set<Integer> n1 = new HashSet<>();
	        n1.add(1);
	        n1.add(2);
	        n1.add(3);
	        n1.add(4);
	        Set<Integer> n2 = new HashSet<>();
	        n2.add(3);
	        n2.add(2);
	        n2.add(5);
	        n2.add(6);

	        System.out.println(Set_methods.union(n1, n2));
	        System.out.println(Set_methods.intersect(n1, n2));
	    }
	    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
	        Set<T> set = new HashSet<T>(set1);
	        set.addAll(set2);

	        return set;
	    }

	    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
	        Set<T> set = new HashSet<T>(set1);
	        set.retainAll(set2);

	        return set;
	    }
	}

