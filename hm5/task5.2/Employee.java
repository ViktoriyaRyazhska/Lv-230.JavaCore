	
public class Employee {
 private String employeeId;
 private int salary;
 private String name;
 
 
 public Employee(String employeeId,String name, int salary){
	 this.employeeId = employeeId;
	 this.salary = salary;
	 this.name = name;
 }
 
 public String getEmployeeId(){
	 return employeeId;
 }
 public void setEmployeeId(String employeeId){
	 this.employeeId = employeeId;
 }
 
 public String getName(){
	 return name;
 }
 public void setName(String name){
	 this.name = name;
 }
 
 public int getSalary(){
	 return salary;
 }
 
 public void setSalary(int salary){
	 this.salary = salary;
 }
 
 
 
}
