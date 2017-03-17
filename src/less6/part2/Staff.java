package less6.part2;

public abstract class Staff extends Person {

	@Override
	public void print() {
		System.out.println("I`m a " + getName());
	}
	public abstract void salary();

}
