package week5.thursday.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 * 1) count and write the number of symbols in every line.
 * 2) find the longest and the shortest line.
 * 3) find and write only that lines, which consist of word «var»
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "/week5/thursday/task3/text.txt";
        ArrayList<String> textLines = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            textLines = new ArrayList<>();
            String accum = null;
            while ((accum = br.readLine()) != null) {
                textLines.add(accum);
            }
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

        String longestLine;
        String shortestLine;

        if (!textLines.isEmpty()){
            longestLine = shortestLine = textLines.get(0);

            for (int i = 0; i < textLines.size(); i++) {
                String currentLine = textLines.get(i);
                int currentLineSize = textLines.get(i).length();

                // 1) count and write the number of symbols in every line.
                System.out.println("Line " + (i + 1) + ": " + currentLineSize +" symbols");

                // 2) find the longest and the shortest line.
                if (currentLineSize > longestLine.length()) {
                    longestLine = currentLine;
                }
                if (currentLineSize < shortestLine.length()) {
                    shortestLine = currentLine;
                }

                // 3) find and write only that lines, which consist of word «var»
                if (currentLine.contains("var")) {
                    System.out.println(currentLine);
                }
            }

            System.out.println("Longest line: " + longestLine);
            System.out.println("Shortest line: " + shortestLine);
        }
    }
}
