package hw5_1;

public class FlyingBird extends Bird {

	public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }
	
	@Override
	public void fly() {
		System.out.println("Може літати");
		
	}
	
	
}
