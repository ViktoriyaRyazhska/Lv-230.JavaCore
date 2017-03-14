package less3;

public class Student {
	private String name;
	private int rating;
	
	private static int number = 0;
	private static int sum = 0;
			
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		sum-=rating;
		sum+=rating;
		this.rating = rating;
	}
	
	
	public Student(String name, int rating) {
		this.name = name;
		this.rating = rating;
		sum+=rating;
		number++;
	}
	
	public Student(String name) {
		this.name = name;
		number++;
	}
	public Student() {
		number++;
	}
	
	public boolean betterStudent(Student st){
		return this.rating > st.getRating();
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}

	public static void getAvr(){
		System.out.println(sum/number);
	}
}
