package less6;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("Meoh");
	}

	@Override
	public void feed() {
		System.out.println("Cat eat");
	}

}
