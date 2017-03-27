package com.home;

import java.lang.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        String pattern = "[a-zA-Z]+";

		String text = "Show must go on!";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		Integer max= 0;
		String l = "";
		/*while (m.find()){
			String s = text.substring(m.start(),m.end());
			if (s.length() > max){
				max = s.length();
				l=s;
			}
		}
		System.out.println(l + " " + l.length());*/
		Integer k = 0;
		while (m.find()){
			String s = text.substring(m.start(),m.end());
			k++;
			l=s;
			if(k==2){
				break;
			}
		}
		StringBuilder s = new StringBuilder(l);
		s.reverse();
		System.out.println(s);

    }
}
