public class Main{
	public static void main(String[] args){
		Person person1 = new Person("Andriy");
		person1.setBirthyear(1997);;
		Person person2 = new Person("Mykola");
		person2.setBirthyear(1997);
		Person person3 = new Person("Ira");
		person3.setBirthyear(1999);
		Person person4 = new Person("Lesuk");
		person4.setBirthyear(1967);
		Person person5 = new Person("Zero");
		person5.setBirthyear(1934);
		System.out.println("All persons");
	System.out.println(person1.getName() + person1.age() );
	System.out.println(person2.getName() + person2.age() );
	System.out.println(person3.getName() + person3.age() );
	System.out.println(person4.getName() + person4.age() );
	System.out.println(person5.getName() + person5.age() );
System.out.println("Persons age" + Person.age());

		
	}
}