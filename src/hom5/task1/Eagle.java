package hom5.task1;

public class Eagle extends FlyingBird {

	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Eagle [fly()=" + fly() + ", isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", toString()=" + super.toString() + "]";
	}

}
