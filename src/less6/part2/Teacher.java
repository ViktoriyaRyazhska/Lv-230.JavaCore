package less6.part2;

public class Teacher extends Staff {
	final String TYPEPERSON = "Teacher";

	@Override
	public void print() {
		super.print();
		System.out.println("Type person: " + TYPEPERSON);
	}

	@Override
	public void salary() {
		System.out.println("4000$");
	}

}
