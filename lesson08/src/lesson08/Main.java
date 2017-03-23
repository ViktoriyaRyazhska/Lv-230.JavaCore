package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

// Task 1
		String str1 = "IT";
		String str2 = "IT Academy";
		System.out.println(str2.contains(str1));
		
// Task 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("Enter surName");
		String surName = br.readLine();
		System.out.println("Enter patronimic");
		String patronymic = br.readLine();
		System.out.println("surnames and initials: "+surName+" "+name.charAt(0)+"."+patronymic.charAt(0));
		System.out.println("Name: "+name);
		System.out.println("name: "+name+" surname: "+surName+" patromnymic: "+patronymic);
		
//Task 3
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(name);
		if(m.find()){
			System.out.println("it`s ok");
		}else{
			System.out.println("bad name");
		}
	}

}
