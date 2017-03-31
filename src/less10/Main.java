package less10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// for (int i = 0; i <= 10; i++) {
		// System.out.println("I study java");
		// Thread.sleep(1000);
		// }

		// Thread t1 = new Thread(new Hello("Hello world!", 2000));
		// Thread t2 = new Thread(new Hello("Peace in the peace", 2000));
		// t1.start();
		// t2.start();
		// t1.join();
		// t2.join();
		// System.out.println("My name Nazar");
		List<String> list = new ArrayList<String>();
		ReadFile file = new ReadFile();

		try {
			list = file.readFromFileToList(list, "file.txt");
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(list.size());
		file.numberOfSymbols(list);
		System.out.println("Longest line: " + file.findTheLongestLine(list));
		System.out.println("Sortest line: " + file.findTheShortesLine(list));
		file.findVerb(list, "it");

	}

}
