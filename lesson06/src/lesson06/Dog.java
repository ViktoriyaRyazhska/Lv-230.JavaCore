package lesson06;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("Gav-gav");
	}

	@Override
	public void feed() {
		System.out.println("Dog eats");
	}

}
