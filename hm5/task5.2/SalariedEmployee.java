
public class SalariedEmployee extends Employee implements Calculate {
private int SocialSecurityNumber;
private int hours;	

	
	public SalariedEmployee(String employeeId,int salary,String name,int SocialSecurityNumber ,int hours) {
		super(employeeId, name, salary );
		this.SocialSecurityNumber = SocialSecurityNumber ;
		this.hours = hours;
	}

	
	
	
public int getSocialSecurityNumber(){
	return SocialSecurityNumber;
}
public void setSocialSecurityNumber(int SocialSecurityNumber ){
	this.SocialSecurityNumber = SocialSecurityNumber;
}
public int getHours(){
	return hours;
}
public void setHours(int hours){
	this.hours = hours;
}

@Override
public int calculatePay() {
	return hours*getSalary();
}

@Override
public String toString(){
	return "Name -" + getName() + " " + "SocialSecurityNumber is " + getSocialSecurityNumber() + " " + "hours worked" + getHours() + " " + "salary for one hour is " + getSalary();
	
}


}
