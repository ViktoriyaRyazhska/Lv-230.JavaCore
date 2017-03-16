package lesson06;

public class Cat implements Animal{

	@Override
	public void voice() {
		System.out.println("mjay-mjay");
	}

	@Override
	public void feed() {
		System.out.println("Cat eats");
	}

}
