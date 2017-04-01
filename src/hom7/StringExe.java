package hom7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExe {

	public String findLongestWord(String sentence) {

		String[] str = sentence.split(" ");
		String tmp = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > tmp.length()) {
				tmp = str[i];
			}
		}
		return tmp;

	}

	public int determineNumber(String sentence) {
		List<String> list = new ArrayList<>();
		Pattern p = Pattern.compile("[\\w]");
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			list.add(sentence.substring(m.start(), m.end()));
		}
		return list.size();

	}

	public StringBuilder reverse(String sentence) {
		String[] str = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		return sb.append(str[1]).reverse();
	}

	public String converSpace(String sentence) {
		return sentence.replaceAll("[ ]+", " ");

	}

	public void usCurrency(String sentence) {
		List<String> list = new ArrayList<>();
		Pattern p = Pattern.compile("[$][\\d]*[\\.][\\d]{2}");
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			list.add(sentence.substring(m.start(), m.end()));
		}
		System.out.println(list);
	}

}
