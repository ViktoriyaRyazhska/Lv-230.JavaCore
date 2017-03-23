package hw07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Coll coll = new Coll();
		HashSet<Integer>set1 = (HashSet<Integer>) coll.fillSet();
		HashSet<Integer>set2 = (HashSet<Integer>) coll.fillSet();
		
		Iterator<Integer>it = set2.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
			
	}

}
