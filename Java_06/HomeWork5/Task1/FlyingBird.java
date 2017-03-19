package packageHW5;

import java.lang.Object;

public class FlyingBird extends Bird {
 private String name;

	public FlyingBird(String feathers, boolean layEggs, String name) {
	super(feathers, layEggs);
	this.name = name;
}

	public void fly() {
		System.out.println("The bird can fly");
	}

	@Override
	public String toString() {
		return "FlyingBird [name '" + name + "', "+ super.toString() ;
	}

}
