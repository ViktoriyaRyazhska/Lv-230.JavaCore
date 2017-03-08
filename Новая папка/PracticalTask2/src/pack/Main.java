package pack;

public class Main {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setName("Ivanov");
		em1.setHours(122);
		em1.setRate(25);
		
		Employee em2 = new Employee("Sidorov",24);
		em2.setHours(125);
		
	
		Employee em3 = new Employee("Petrov",123,23);
		
		System.out.println("The total hours of all workers "+Employee.gethours());
		
	}

}
