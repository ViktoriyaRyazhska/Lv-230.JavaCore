package hw07;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Coll {
	private Random random = new Random();
	
	public Collection<Integer> fillSet() {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < 10; i++){
			set.add(random.nextInt(50));
		}
		return set;
	}

}