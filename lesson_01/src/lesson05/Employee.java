package lesson05;

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int departmentNumber, double salary) {
		super();
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}
	

}
