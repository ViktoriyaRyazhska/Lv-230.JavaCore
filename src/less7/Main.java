package less7;

import java.util.ArrayList;
import java.util.List;

public final class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collec collec = new Collec();
		list = collec.fillCollection(list);
		System.out.println(list);
		System.out.println(collec.saveInCollectionNumberMoreFive(list));
		System.out.println(collec.removeGreaterTwenty(list));
	}

}
