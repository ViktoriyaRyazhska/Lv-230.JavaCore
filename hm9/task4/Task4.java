package temp.hm9.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        String sCurrentLine;
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\temp\\hm9\\task4\\file.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\temp\\hm9\\task4\\file2.txt"))){

            while ((sCurrentLine = reader.readLine()) != null) {
                stringList.add(sCurrentLine);
            }

            writer.write(stringList.size()+" - number of lines in file1.txt \n");
            writer.write(longestString(stringList)+'\n');
            writer.write("Melnyk Orest, 09.06.1995");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String s:stringList){
            System.out.println(s);
        }

    }
    private static String longestString(List<String> strings){
        String longestString = strings.get(0);
        for(String s:strings){
            if(s.length()>longestString.length()) longestString = s;
        }
        return longestString;
    }
}
