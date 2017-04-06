package hw5_1;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String toString() {
		return " Eagle [  Feathers()=" + getFeathers() + ", LayEggs()=" + getLayEggs() +  super.toString()  ;
	}
}
