package hw06;

public class Chicken extends NonFlyingBird{

	public Chicken() {
		super();
	}

	@Override
	public String toString() {
		return "Chicken [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + "]";
	}
	

}
