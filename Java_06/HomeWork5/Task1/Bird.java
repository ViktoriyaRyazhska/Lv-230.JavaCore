package packageHW5;

public abstract class Bird {
	private String feathers;
	private boolean layEggs;

	abstract public void fly();

	public Bird(String feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return feathers + ", " + (this.layEggs==true?"laying eggs":"not laying aggs") + "]";
	}
	
	

}
