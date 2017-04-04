package week5.thursday.homework.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write into the file2.txt
 * 1) number of lines in file1.txt.
 * 2) the longest line in file1.txt.
 * 3) your name and birthday date.
 */
public class Main {
    public static void main(String[] args) {
        List<String> fileLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/week5/thursday/homework/task4/file1.txt"))) {
            String s;
            while ((s = reader.readLine()) != null) {
                fileLines.add(s);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/week5/thursday/homework/task4/file2.txt"))) {
            writer.write("Number of lines int file1.txt: " + fileLines.size() + "\n" +
                    "The longest line: " + calcLongestLine(fileLines) + "\n" +
                    "Name: Vladyslav, Birthday: 14.09.1996\n");

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

    private static String calcLongestLine(List<String> fileLines) {
        String longestLine = fileLines.get(0);

        for (int i = 1; i < fileLines.size(); i++) {
            if (fileLines.get(i).length() > longestLine.length()) {
                longestLine = fileLines.get(i);
            }
        }

        return longestLine;
    }
}
