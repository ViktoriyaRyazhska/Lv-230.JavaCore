package less6.part2;

public class Cleaner extends Staff {
	 final String TYPEPERSON = "Cleaner";
	 
	 


	@Override
	public void print() {
		super.print();
		System.out.println("Type person: " + TYPEPERSON);
	}




	@Override
	public void salary() {
		System.out.println("2000$");

	}

}
