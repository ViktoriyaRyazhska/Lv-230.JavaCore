package packageHW5;

public class Main {

	public static void main(String[] args) {
		
		Bird ArrayofBird [] = new Bird[4];
		ArrayofBird[0] = new FlyingBird("large feathers",true,"Eagle");
		ArrayofBird[1] = new FlyingBird("small feathers",true,"Swallow");
		ArrayofBird[2] = new NonFlyingBird("fine feathers",true,"Penguin");
		ArrayofBird[3] = new NonFlyingBird("the middle feathers",true,"Chicken");
		
		for (int i = 0; i < ArrayofBird.length; i++) {
			System.out.println(ArrayofBird[i].toString());
			ArrayofBird[i].fly();
		}
		
		

	}

}
