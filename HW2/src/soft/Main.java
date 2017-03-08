package soft;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Petro");
		p.setBirthYear(1986);
		System.out.println(p);
		p.changeName("Ivan");
		p.input("Student");
		System.out.println(p);
		
		Person p1 = new Person("Oleg", 1991);
		p1.input("Good student");
		System.out.println(p1);

	}

}
