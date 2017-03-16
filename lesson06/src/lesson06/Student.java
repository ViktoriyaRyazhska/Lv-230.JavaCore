package lesson06;

public class Student extends Person{

	final String type = "Student";
	@Override
	public void print() {
		System.out.println("Hello I am "+getName()+" "+type);
	}

}
