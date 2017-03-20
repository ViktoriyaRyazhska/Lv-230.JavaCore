package hom5.task2;

public abstract class Employee {
	private int employeeid;
	private String name;

	public Employee(int employeeid, String name) {
		super();
		this.employeeid = employeeid;
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + "]";
	}

}
