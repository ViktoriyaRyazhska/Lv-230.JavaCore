package hom5.task1;

public class Kiwi extends NonFlyingBird {

	public Kiwi(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public String toString() {
		return "Kiwi [fly()=" + fly() + ", isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", toString()=" + super.toString() + "]";
	}

}
