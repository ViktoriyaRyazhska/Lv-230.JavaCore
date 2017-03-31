package lesson10File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {

	public static void main(String[] args) {
		
		ArrayList<String>text = new ArrayList<>(readText());
		
		for (String string : text) {
			System.out.println(string);
		}
		System.out.println(longestString(text));
		for (String string : text) {
			System.out.println(string);
		}
		System.out.println(shortestString(text));
		System.out.println("Word was found in string: "+findWord(text));
		
	}
	
	private static ArrayList<String> readText(){
		ArrayList<String> text = new ArrayList<>();
		String str = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("mytext.txt"));
			while((str = br.readLine()) != null){
				text.add(str +" length: "+ str.length());
			}
			
			br.close();
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return text;
	}
	
	private static String longestString(ArrayList<String>text){
		String str = "";
		int n = 0;
		for (int i = 0; i < text.size(); i++) {
			if(text.get(i).length() > str.length()){
				str = text.get(i);
				n = i;
			}
		}
		System.out.println("\nLongest string number is: "+ ++n);
		return str;
	}
	private static String shortestString(ArrayList<String>text){
		String str = text.get(0);
		int numOfString = 0;
		for (int i = 1; i < text.size(); i++) {
			if(text.get(i).length() < str.length()){
				str = text.get(i);
				numOfString = i;
			}
		}
		System.out.println("\nShoretst string number is: "+ ++numOfString);
		return str;
	}
	private static String findWord(ArrayList<String>text){
		String str = "";
		String word = "never";
		for (String string : text) {
			if(string.contains(word)){
				str = string;
			}
		}
		return str;
	}
}
