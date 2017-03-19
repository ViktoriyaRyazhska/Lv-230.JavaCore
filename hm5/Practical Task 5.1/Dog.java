
public class Dog implements Animal {
	private String name;
	@Override
	public String voice() {
		System.out.println("Gav");
		return null;
	}

	@Override
	public String feed() {
      System.out.println("I eat meat");
	return null;
		
	}

	public Dog(String name){
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
    	return "Dog name is " + getName();
}

}