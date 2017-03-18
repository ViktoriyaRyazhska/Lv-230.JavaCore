package hw06;

public class Penguin extends NonFlyingBird{

	public Penguin() {
		super();
	}

	@Override
	public String toString() {
		return "Penguin [isFeathers()=" + isFeathers() + ", isLayEggs()=" + isLayEggs() + "]";
	}
}
