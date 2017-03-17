package hom5.task1;

public abstract class Bird {
	private boolean feathers;
	private boolean layEggs;

	public Bird(boolean feathers, boolean layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract boolean fly();

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
