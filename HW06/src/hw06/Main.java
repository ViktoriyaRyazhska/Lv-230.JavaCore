package hw06;

public class Main {

	public static void main(String[] args) {

		Bird[] birds = new Bird[4];
		
		birds[0] = new Penguin();
		birds[1] = new Chicken();
		birds[2] = new Eagle();
		birds[3] = new Swallow();
		for (Bird bird : birds) {
			bird.fly();
		}
		for (Bird bird : birds) {
			if(bird instanceof NonFlyingBird){
				bird.setLayEggs(true);
			}else{
				bird.setLayEggs(false);
			}
			bird.setFeathers(true);
			System.out.println(bird);
		}
	}

}
