package less3;

public class Student {

	private String name;
	private int rait;
	private static int number = 0;
	private static int sum = 0;

	public Student(String name, int rait) {
		this.name = name;
		this.rait = rait;
		number++;
		sum += rait;

	}

	public Student(String name) {
		super();
		this.name = name;
		number++;

	}

	public Student() {
		number++;

	}

	public boolean betterStudent(Student st) {
		return this.rait > st.getRait();
	}

	public static double getAvg() {
		return ((double) sum / number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRait() {
		return rait;
	}

	public void setRait(int rait) {
		this.rait = rait;
		
	}

	public String toString() {
		return "Student [name=" + name + ", rait=" + rait + "]";
	}

}
