
public class Main {

	public static void main(String[] args) {
		Person[] arr = new Person[4];
		arr[0] = new Student("Alex");
		arr[1] = new Teacher("Vens", 160, 15);
		arr[2] = new Cleaner("Qwimby", 120, 20);
		
for(Person a: arr){
	System.out.println(a);
	a.print();
    
}
for (Person p : arr) {
    if (p instanceof Staff) {
        System.out.println(((Staff) p).salary());
    }
}
	}
}
	
	




