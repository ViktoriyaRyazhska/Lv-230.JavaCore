package com.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

       char k = 'm';
        String text = "Every   night  in   my     dreams I   see you";
        for(int i=0; i< text.length(); ++i){
                if(k!=text.charAt(i) || text.charAt(i)!=' '){
                    System.out.print(text.charAt(i));
                }
            k=text.charAt(i);
        }
    }

}