package pack_HomeWork5_2;

public class Employee {

private String name;	
 private String employeeId;

  
 public Employee(String name, String id) {
	this.name = name;
	this.employeeId = id;
 }

 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


 
}
