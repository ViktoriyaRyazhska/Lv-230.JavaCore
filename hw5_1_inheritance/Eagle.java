package hw5_1;

public class Eagle extends FlyingBird{

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
		
	}
	@Override
	public String toString() {
		return " Eagle [  Feathers()=" + getFeathers() + ", LayEggs()=" + getLayEggs()  + super.toString()  ;
	}

}
