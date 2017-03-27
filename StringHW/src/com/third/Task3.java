package com.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence");
		String sentence = br.readLine();
		Pattern p = Pattern.compile(" \\$\\d+\\.\\d{2} ");
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			System.out.println(sentence.substring(m.start(), m.end()));
		}
	}

}
