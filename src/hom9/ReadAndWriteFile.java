package hom9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import less10.ReadFile;

public class ReadAndWriteFile extends ReadFile {

	public void writeFile(String nameFile, String sometext) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile));
		bw.write(sometext);
		bw.close();
	}

	public void writeNumberOfLines(List<String> list, String nameFile) throws IOException {
		writeFile(nameFile, "Number of lines: " + list.size());

	}

	public void writeLongestLine(List<String> list, String nameFile) throws IOException {
		String str = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > str.length()) {
				str = list.get(i);
			}
		}
		writeFile(nameFile, "Longest line: " + str);
	}

	public void writeNameAndBirtday(List<String> list, String nameFile) throws IOException {
		Pattern p = Pattern.compile("[\\d]{2}\\.[\\d]{2}\\.[\\d]{4}");
		for (int i = 0; i < list.size(); i++) {
			Matcher m = p.matcher(list.get(i));
			if (m.find()) {
				writeFile(nameFile, list.get(i));
			}
		}
	}
}
