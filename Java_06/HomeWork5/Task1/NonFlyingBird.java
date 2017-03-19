package packageHW5;

public class NonFlyingBird extends Bird {
 private String name;
 
	
	public NonFlyingBird(String feathers, boolean layEggs, String name) {
	super(feathers, layEggs);
	this.name = name;
}


	public void fly() {
		System.out.println("The bird can't fly");
		
	}

	@Override
	public String toString() {
		return "NonFlyingBird [name '" + name + "', "+ super.toString() ;
	}
	
}
