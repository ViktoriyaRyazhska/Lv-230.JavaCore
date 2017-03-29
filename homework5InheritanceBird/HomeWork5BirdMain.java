package homework5Bird;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
//Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Kiwi. 
//Create array Bird and add different birds to it. Call fly() method for all of it. 
//Output the information about each type of created bird.


public class HomeWork5BirdMain {

	public static void main(String[] args) {
		
		Bird[] listOfBirdTypes = new Bird[4];
		listOfBirdTypes[0] = new Eagle();
		listOfBirdTypes[1] = new Swallow();
		listOfBirdTypes[2] = new Penguin();
		listOfBirdTypes[3] = new Kiwi();
		
		for (Bird i: listOfBirdTypes){
			System.out.println(i);
		}
	}
}
