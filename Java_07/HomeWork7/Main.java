package package7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> listOfFiveWords = new ArrayList<String>();

		System.out.println("Enter sentence of five words:");
		String inputSentence = (String) sc.nextLine();

		int count = 0;
		int var =0;
		for (int i = 0; i < 4; i++) {
			count = inputSentence.indexOf(' ');
			var=count--;
			System.out.println(var);
			listOfFiveWords.add(inputSentence.substring(0,var));
			inputSentence = inputSentence.substring(++var);

		}
		listOfFiveWords.add(inputSentence.substring(0));
			

		String longestWord = "";
		Iterator<String> iterator = listOfFiveWords.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			if (longestWord.length() < element.length()) {
				longestWord = element;
			}
			System.out.println("word: " + element + " has " + element.length() + " numbers");
		}
		
		System.out.println(""+ listOfFiveWords.toString());
		System.out.println("longest word:" + longestWord);

		String secondWords = listOfFiveWords.get(1);
		String reverseSecWord = "";
		int j = 1;
		for (int i = secondWords.length(); i > 0; i--) {
			j = i;
			reverseSecWord += secondWords.substring(j - 1, i);
		}
		System.out.println("");
		System.out.println("Second word in reverse order: " + reverseSecWord);
		System.out.println("");
		System.out.println("Enter sentence with words between more than one space:");

		String SentenceWithMuchSpace = (String) sc.nextLine();
		Main instance = new Main();
		instance.NewSentence(SentenceWithMuchSpace);

		System.out.println("Input currency:");
		double valueCur = sc.nextDouble();
		String format = "$" + "%.2f";
		String s = String.format(format, valueCur);
		System.out.println(s);

		sc.close();

	}

	public void NewSentence(String SentenceWithMuchSpace) {
		String newSent = "";
		Boolean previousFigure = true;
		int varLength = SentenceWithMuchSpace.length() + 1;

		for (int i = 0; i < SentenceWithMuchSpace.length(); i++) {
			if (SentenceWithMuchSpace.charAt(i) != ' ') {
				if (previousFigure == false) {
					newSent += ' ';
					previousFigure = true;
				}
				newSent += SentenceWithMuchSpace.charAt(i);
			} else {
				previousFigure = false;
			}
		}
		System.out.println(newSent);
	}

}
