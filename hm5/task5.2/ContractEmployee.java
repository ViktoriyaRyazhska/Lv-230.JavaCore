
public class ContractEmployee extends Employee implements Calculate{
private String federalTaxIdmember;
	

	public ContractEmployee(String employeeId,int salary,String name,String federalTaxIdmember) {
		super(employeeId, name, salary );
		this.federalTaxIdmember = federalTaxIdmember;
	}

public String getFederalTaxIdmember(){
	return federalTaxIdmember;
}
public void setFederalTaxIdmember(String federalTaxIdmember){
	this.federalTaxIdmember = federalTaxIdmember;
}
	
	
	
	
	
	@Override
	public int calculatePay() {
		
		return getSalary();
	}

	@Override
	public String toString(){
		return "Name is " + getName() + " " + "federalTaxIdmember is " + getFederalTaxIdmember() + " " + "salary for one month is " + getSalary() ;
		
	}
}
