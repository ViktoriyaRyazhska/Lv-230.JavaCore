package less3;

public class Main2 {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setName("Nazar");
		em1.setHours(12);
		em1.setRate(2);
		em1.salary();
		em1.bonuses();
		Employee em2 = new Employee("Vasya", 5);
		em2.setHours(10);
		em2.salary();
		Employee em3 = new Employee("Oleg", 3, 12);
		em3.salary();

		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		System.out.println(Employee.getTotalHours());
		System.out.println("Total sum: " + Employee.getTotalSum());

	}

}
