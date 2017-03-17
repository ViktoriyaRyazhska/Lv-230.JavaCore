package hom5.task1;

public class Penguin extends NonFlyingBird {

	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Penguin [fly()=" + fly() + ", isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", toString()=" + super.toString()
				+ "]";
	}
	

}
