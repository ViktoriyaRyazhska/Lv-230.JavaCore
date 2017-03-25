package temp.hm7.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static String[] arrayOfWords ;

    public static void main(String[] args) {
        String s = "As its name states, EETS was begun as a 'club', and it retains certain features of that even now.";
        s = s.replaceAll("[^A-Za-z0-9 ]", "");

        System.out.println(s);

        System.out.println(longestWord(s));
        System.out.println(reverse(1));
    }
    public static String longestWord(String str){
        arrayOfWords = str.split(" ");
        String maxLenght = arrayOfWords[0];
        int numberOfMaxLenghtWord = 0;
        for(int i=0; i<arrayOfWords.length; i++){
            if(maxLenght.length()<arrayOfWords[i].length()) {
                maxLenght=arrayOfWords[i];
                numberOfMaxLenghtWord = i;
            }
        }

        return "Longest word is: "+maxLenght+", position of this letter = "+(numberOfMaxLenghtWord+1);
    }
    public static String reverse (int numberOfWord){
        StringBuilder stringBuilder = new StringBuilder(arrayOfWords[numberOfWord-1]);
        return stringBuilder.reverse().toString();
    }
}
