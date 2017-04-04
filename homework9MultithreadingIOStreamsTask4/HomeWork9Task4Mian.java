package homework9MultithreadingIOStreamsTask4;
// 4)Create file1.txt file with a text about your career.
//	Read context from file into array of strings. Each array item contains one line from file.
//	Write in to the file2.txt
//		1) number of lines in file1.txt.
//		2) the longest line in file1.txt.
//		3) your name and birthday date. 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HomeWork9Task4Mian {
	public static void main(String[] args) {

		String inputFileName = "file1.txt";
		String outputFileName = "file2.txt";
		
		ArrayList<String> arrayListOfStrings = new ArrayList<String>();
		String lineOfText = null;

		try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
			while ((lineOfText = br.readLine()) != null) {
				arrayListOfStrings.add(lineOfText);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String longestLineInFile = arrayListOfStrings.get(0);
		for(String i:arrayListOfStrings){
			if(i.length() > longestLineInFile.length()){
				longestLineInFile = i;
			}
		}
		
		try (BufferedWriter wr = new BufferedWriter(new FileWriter(outputFileName))) {
			wr.write("Input file consists of " + arrayListOfStrings.size() + "\n");
			wr.write("The longest line in the input file is: <<" + longestLineInFile + ">>, it consists of " + longestLineInFile.length() + " symbols.\n");
			wr.write("Michael Kalyn, 21.06.1984 \n");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
