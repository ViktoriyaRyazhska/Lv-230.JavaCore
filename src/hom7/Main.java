package hom7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringExe exe = new StringExe();
		System.out.println("Enter sentence: ");
		// System.out.println(exe.findLongestWord(bf.readLine()));
//		System.out.println(exe.reverse(bf.readLine()));
		// System.out.println(exe.determineNumber(bf.readLine()));
		// System.out.println(exe.converSpace(bf.readLine()));
		exe.usCurrency(bf.readLine());
	}

}
