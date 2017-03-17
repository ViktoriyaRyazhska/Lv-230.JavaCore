package less6.part2;

public class Main {

	public static void main(String[] args) {
		Person[] persons = new Person[4];
		persons[0] = new Student();
		persons[1] = new Teacher();
		persons[2] = new Cleaner();
		persons[3] = new Teacher();

		for (Person person : persons) {
			if (person instanceof Staff) {
				((Staff) person).salary();

			}
			person.print();
		}

	}

}
