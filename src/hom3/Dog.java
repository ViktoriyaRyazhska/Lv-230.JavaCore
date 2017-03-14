package hom3;

public class Dog {

	private String name;
	private Breed breed;
	private int age;

	Dog() {

	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public boolean compareName(Dog dog, Dog dog2) {
		if (dog.equals(dog2)) {
			return true;
		} else {
			return false;
		}

	}

	public Dog compareAge(Dog dog, Dog dog2) {
		if (dog.getAge() > dog2.getAge()) {
			return dog;
		} else {
			return dog2;
		}
	}

	public Breed getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Error, age can not be negative");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

}
