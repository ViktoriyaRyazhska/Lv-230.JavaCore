package less7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Collec {

	public List<Integer> fillCollection(List<Integer> list) {
		list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 15; i++) {
			list.add(random.nextInt(10) - 10);
		}

		return list;

	}

	public List<Integer> saveInCollectionNumberMoreFive(List<Integer> list) {
		List<Integer> list2 = new ArrayList<Integer>();
		Iterator<Integer> iterator = list.iterator();
		Integer tmp;
		while (iterator.hasNext()) {
			tmp = iterator.next();
			if (tmp > 5) {
				list2.add(tmp);
			}

		}
		return list2;

	}

	public List<Integer> removeGreaterTwenty(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		Integer tmp;
		while (it.hasNext()) {
			tmp = it.next();
			if (tmp > 20) {
				it.remove();
			}

		}
		return list;

	}

	public void insertElements(List<Integer> list) {
		list.set(1, 2);
		list.set(6, -3);
		list.set(4, -4);
		System.out.println(list);
	}

	public List<Integer> sort(List<Integer> list) {

		Collections.sort(list);
		return list;

	}
}
