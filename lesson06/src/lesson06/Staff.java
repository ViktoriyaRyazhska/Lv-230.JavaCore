package lesson06;

public abstract class Staff extends Person{

	@Override
	public void print() {
		System.out.println("hello I am "+getName());
	}
	
	public abstract void salary();

}
