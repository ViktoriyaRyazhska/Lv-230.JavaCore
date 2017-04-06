package hw5;

import java.util.Scanner;

public class Dog {
public enum breed {AKITA , BARBET, BEAGLE}
private String name;
private int age;
public Dog(String name, int age){
	this.age = age;
	this.name = name;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public static void samename(String n1, String n2, String n3){

	if(n1==n2) System.out.println(true);
	else if(n2==n3) System.out.println(true);
	else if(n1==n3) System.out.println(true);
}

public static void oldest(Dog d1, Dog d2, Dog d3){
	
	if(d1.age>d2.age && d1.age>d2.age) System.out.println(d1.name);
	else if(d2.age>d1.age && d2.age>d3.age) System.out.println(d1.name);
	else if(d3.age>d1.age && d3.age>d2.age) System.out.println(d1.name);
	
}
}

class Do1{
	public enum HTTPError{Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found }
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
	Dog dog1 = new Dog("Jek",13);	
	Dog dog2 = new Dog("Sam",3);	
	Dog dog3 = new Dog("Rik",8);	
	Dog.samename(dog1.getName(),dog2.getName(),dog3.getName());
	Dog.oldest(dog1, dog2, dog3);
	System.out.println("перевірка 3 чисел на належність проміжку [-5;5]");
	boolean k = true;
	for (int i = 0; i<3 ; i++){
		int a = sc.nextInt();
		if (a< 5 && a> -5) k = true;
		else k = false;
	}
	if (k == true) System.out.println("Належить");
	else System.out.println("Не належить");
	
	
	System.out.println("Пошук максимального і мінімального з 3 чисел");
	int d1 = sc.nextInt();
	int d2 = sc.nextInt();
	int d3 = sc.nextInt();
	
	if(d1>d2 && d1>d2) System.out.println("Переше число " + d1 + "максимальне");
	else if(d2>d1 && d2>d3) System.out.println("Друге число " + d2 + "максимальне");
	else if(d3>d1 && d3>d2) System.out.println("Третє число " + d3 + "максимальне");
	
	if(d1<d2 && d1<d2) System.out.println("Переше число " + d1 + "мінімальне");
	else if(d2<d1 && d2<d3) System.out.println("Друге число " + d2 + "мінімальне");
	else if(d3<d1 && d3<d2) System.out.println("Третє число " + d3 + "мінімальне");
	
	HTTPError err;
	System.out.println("Перевір http помилку");
	switch (sc.nextInt()) {
	case 400 : err = HTTPError.Bad_Request;  System.out.println(err); break;
	case 401 : err = HTTPError.Unauthorized; System.out.println(err); break;
	case 402 : err = HTTPError.Payment_Required; System.out.println(err); break;
	case 403 : err = HTTPError.Forbidden; System.out.println(err); break;
	case 404 : err = HTTPError.Not_Found; System.out.println(err); break;
	default:
		System.out.println("Далі у вікіпедії");
		System.exit(0);
	}

	
	
	sc.close();
	}

	
}
