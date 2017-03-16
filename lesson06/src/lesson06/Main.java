package lesson06;

public class Main {

	public static void main(String[] args) {

// Task 1		
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		for (Animal animal : animals) {
			animal.feed();
			animal.voice();
			System.out.println();
		}
	
// Task 2
		
		Person[] p = new Person[3];
		p[0] = new Teacher();
		p[1] = new Cleaner();
		p[2] = new Student();
		for (Person person : p) {
			if(person instanceof Staff){
				((Staff)person).salary();
			}
			person.print();
		}
	}

}
