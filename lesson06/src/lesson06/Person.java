package lesson06;

public abstract class Person {
	private String name;
	
	public abstract void print();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
