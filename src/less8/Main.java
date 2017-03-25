package less8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// String var1 = "IT";
		// String var2 = "ITasfasf";
		// System.out.println(var2.startsWith(var1));
		// System.out.println("Enter name:");
		// String name = bf.readLine();
		// System.out.println("Enter surname:");
		// String surname = bf.readLine();
		// System.out.println("Enter patronumic:");
		// String patronumic = bf.readLine();
		//
		// System.out.println(surname + " " + name.charAt(0) + "." +
		// patronumic.charAt(0) + ".");
		// System.out.println("Name: " + name);
		// System.out.println(name + " " + patronumic + " " + surname);
		ValidUser user = new ValidUser();
		System.out.println("Enter name (3-15 char): ");
		System.out.println(user.validUserName(bf.readLine()));

	}

}
