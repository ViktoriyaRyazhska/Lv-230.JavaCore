package homework5Bird;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
//Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Kiwi. 
//Create array Bird and add different birds to it. Call fly() method for all of it. 
//Output the information about each type of created bird.

public class Swallow extends FlyingBird {
	
	@Override
	public String toString() {
		return "Swallows are birds, their body are covered with " + feathers + ", they reproduce by " + layEggs + '.' + "Swallows " + fly();
	}

}
