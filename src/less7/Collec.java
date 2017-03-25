package less7;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Collec {

	public List<Integer> fillCollection(List<Integer> list) {
		list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 15; i++) {
			list.add(random.nextInt(30));
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

	public List<Integer> insertElements() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

		}
		return list;

	}

}
