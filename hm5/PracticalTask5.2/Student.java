
public class Student extends Person {
	public static final String TYPE_PERSON = "Student";
	
	
	
	
	public Student(String name) {
		super(name);
		
	}

	@Override
	public void print() {
		System.out.println("I am a " + Student.TYPE_PERSON);
		
}

	@Override
	public String toString(){
		return "Name is " + getName();
		
	}
	
}
