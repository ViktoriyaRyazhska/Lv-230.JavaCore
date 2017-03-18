package lesson06;

public class Teacher extends Staff{

	final String type = "Teacher";
	@Override
	public void salary() {
		System.out.println("I am a "+type+" this is my salary method");
	}

}
