package pcHW3;

public class Main {

	public static void main(String[] args) {
		Person pers1 = new Person();
		pers1.setName("Ivanov");
		pers1.setBirthYear(1990);
		
		Person pers2 = new Person("Petrov", 2000);
		
		Person pers3 = new Person();
		pers3.setName("Sidorov");
		pers3.setBirthYear(1979);
		
		Person pers4 = new Person("Ivanchenko",1978);
		
		Person pers5 = new Person();
		pers5.setName("Zarechnaja");
		pers5.setBirthYear(1977);
		
	}

}
