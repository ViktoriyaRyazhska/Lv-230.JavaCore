
public class NonFlyingBird extends Bird{


	public NonFlyingBird(String feathers, String layeggs) {
		super(feathers, layeggs);
		
	}

	@Override
	public void fly() {
		System.out.println("I cant fly");
		
	}
	

}
