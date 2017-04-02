package hw10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

	
	public String[] readFile(String fileName) throws IOException {
		String[] array = new String[3];
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		for (int i = 0; i < array.length; i++) {
		if((line = br.readLine()) != null){
				array[i] = line;
			}
		}
		br.close();
		return array;
	}
	
	public void writeFile(String fileName, String[] array) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));
		bw.write("Number of lines: "+array.length+"\n");
		int longestCount = 0;
		String longestLine = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i].length() > longestCount){
				longestCount = array[i].length();
				longestLine = array[i];
			}
		}
		bw.write("Longest line is: "+longestLine+" it's length is: "+longestCount+"\n");
		
		String info = null;
		Pattern p = Pattern.compile("[0-9]{0,2}\\.[0-9]{0,2}\\.[0-9]{0,4}");	
		for (int i = 0; i < array.length; i++) {
			Matcher m = p.matcher(array[i]);
			if(m.find()){
				info = array[i].substring(m.start(), m.end());
			}
		}
		bw.write("Birth date: "+info);
		System.out.println("File was written");

		bw.close();
		
	}
}
