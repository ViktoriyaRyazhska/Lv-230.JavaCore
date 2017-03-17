package less6.part2;

public class Student extends Person {
	 final String TYPEPERSON = "Student";
	 

	@Override
	public void print() {
		System.out.println("I`m a " + getName() + "type: " + TYPEPERSON);
	}

}
