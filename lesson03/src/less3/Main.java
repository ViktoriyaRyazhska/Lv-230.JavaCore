package less3;

public class Main {

	public static void main(String[] args) {

//		Student st1 = new Student();
//		st1.setName("Petro");
//		st1.setRating(4);
//		
//		Student st2 = new Student("Vasja");
//		st2.setRating(5);
//		
//		Student st3 = new Student("Oleg", 3);
//		
//		System.out.println(st1);
//		System.out.println(st2);
//		System.out.println(st3);
//		
//		System.out.println("St 1 bebber st2 "+st1.betterStudent(st2));
//
//		Student.getAvr();
		
		Employee empl1 = new Employee();
		empl1.setName("Ivan");
		empl1.setHours(5);
		empl1.setRate(3.0);
		
		Employee empl2 = new Employee("Petro", 10);
		empl2.setHours(3);
		
		Employee empl3 = new Employee("Vasja", 6, 3);
		empl3.changeRate(20);
		
		System.out.println(empl1);
		System.out.println(empl2);
		System.out.println(empl3);
		System.out.println(Employee.totalSum);
	}

}
