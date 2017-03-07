package Package1;

public class Student {
	private String name;
	int rating;
	private static int number = 0;
	private static int sum = 0;
	

	public Student() {
	number++;
	}

	public Student(String name) {
	this.name = name;
	number++;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public double getRating() {
	return rating;
	}

	public void setRating(int rating) {
	this.rating = rating;
	sum += rating;
	}

	public static double getAvgRating() {
	return (double) sum / number;
	}

	public boolean betterStudent(Student student) {
	return this.getRating() > student.getRating();
	}

	public void changeRating(int raiting) {
	this.rating = rating;
	}

	@Override
	public String toString() {
	return "Student [name=" + name + ", rating=" + rating + "]";
	}
}
