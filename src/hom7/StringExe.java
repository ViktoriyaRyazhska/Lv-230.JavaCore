package hom7;

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

	public String convertSpace(String sentence) {
		Pattern p = Pattern.compile("[ ]+");
		Matcher m = p.matcher(sentence);

		return null;

	}

}
