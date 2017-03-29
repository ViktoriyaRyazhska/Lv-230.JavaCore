package Package;

public class Dog {
	private String name;
	private int age;
	private ItemsBreed breed;
	
	public Dog(String name, int age, ItemsBreed breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public ItemsBreed getBreed() {
		return breed;
	}


	public void setBreed(ItemsBreed breed) {
		this.breed = breed;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	}
