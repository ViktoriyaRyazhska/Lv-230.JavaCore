
public class Cat implements Animal {
private String name;
	@Override
	public String voice() {
		System.out.println("Meow");
		return null;
	}

	@Override
	public String feed() {
		System.out.println("I eat Milk");
		return null;
	}

	public Cat(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
public void setName(String name){
	this.name = name;
}

@Override
public   String toString(){
	return "Cat name is " + getName();
}
}
