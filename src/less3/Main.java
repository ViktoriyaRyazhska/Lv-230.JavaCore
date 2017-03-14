package less3;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Nazar");
		st1.setRait(5);
		Student st2 = new Student("Vasya");
		st2.setRait(4);
		Student st3 = new Student("Ira", 2);
		st3.setRait(4);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);

		System.out.println(st1.betterStudent(st3));

		System.out.println(Student.getAvg());

	}

}
