package hw5_1;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String toString() {
		return " Eagle [  Feathers()=" + getFeathers() + ", LayEggs()=" + getLayEggs() + super.toString()  ;
	}
}
