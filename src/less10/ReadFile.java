package less10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

	public List<String> readFromFileToList(List<String> list, String filename) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(filename));
		String str;
		while ((str = bf.readLine()) != null) {
			list.add(str);
		}
		return list;

	}

	public void numberOfSymbols(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).length());

		}

	}

	public int findTheLongestLine(List<String> list) {
		int count = list.get(0).length();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > count) {
				count = list.get(i).length();
			}
		}
		return count;

	}

	public int findTheShortesLine(List<String> list) {
		int count = list.get(0).length();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() < count) {
				count = list.get(i).length();
			}
		}
		return count;
	}

	public void findVerb(List<String> list, String someverb) {
		Pattern p = Pattern.compile(someverb);
		for (int i = 0; i < list.size(); i++) {
			Matcher m = p.matcher(list.get(i));
			if (m.find()) {
				System.out.println(list.get(i));
			}
		}

	}
}
