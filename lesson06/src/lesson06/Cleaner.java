package lesson06;

public class Cleaner extends Staff{

	final String type = "Cleaner";
	@Override
	public void salary() {
		System.out.println("I am a "+type+" this is my salary");
	}

}
