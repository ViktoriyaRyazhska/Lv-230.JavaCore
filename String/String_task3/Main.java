package com.home;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        String pattern = "[$][0-9]*.[0-9]*";

        String text = "I want $34.45 to break free $4.45";



        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while(m.find()){

            System.out.printf(text.substring(m.start(), m.end())+"\n");
        }


	// write your code here
    }
}
