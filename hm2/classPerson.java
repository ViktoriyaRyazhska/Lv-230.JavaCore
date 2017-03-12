import java.util.Calendar;

public class Person {
private String name;
private static int  birthyear;
private static String input;
private static String output;
private static int age;


public Person(){
	}

public Person(String name){
	this.name = name;
}

public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public static int getBirthyear(){
		return birthyear;
	}
	
	public void setBirthyear(int Birthyear){
		this.birthyear = birthyear;
	}
	
	public void changeName(String name) {
		this.name = name;
		}
	
	
	
	
	
	  public static int age() {
	        Calendar now = Calendar.getInstance();
	        int year = now.get(Calendar.YEAR);
	        return year - getBirthyear();
	    }
	
	public String toOutput(){
		return "Person [ name=" + name + ", age=" + age +"] ";
	}
	
}
