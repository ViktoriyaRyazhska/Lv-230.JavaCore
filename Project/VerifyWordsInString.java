package softserve.javacore.project;

import java.util.ArrayList;
import java.util.List;


public class VerifyWordsInString {
	
	public static String[] GetWords(String s) {
     	List<String> myList = new ArrayList<String>();
		String word = "";
		int endIndex = 0;
		s = s.concat(" ");
		while (s.length() > 0) {
			endIndex = s.indexOf(' ');

			word = s.substring(0, endIndex);
			if (word.length() > 0) {
				myList.add(word);
			}
			s = s.substring(endIndex + 1);
		}

		
		String [] Mas = (String[]) myList.toArray(new String[myList.size()]);
		return Mas;
	}
}
