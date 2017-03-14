package less5;

public class Employee {

	private int departmen_number;
	private String name;
	private double salary;

	public Employee(int departmen_number, String name, double salary) {
		this.departmen_number = departmen_number;
		this.name = name;
		this.salary = salary;
	}

	public int getDepartmen_number() {
		return departmen_number;
	}

	public void setDepartmen_number(int departmen_number) {
		this.departmen_number = departmen_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double	 salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [departmen_number=" + departmen_number + ", name=" + name + ", salary=" + salary + "]";
	}

}
