package hw5_2;

public class ContractEmployee extends Employee implements Payment{
	
	private String federalTaxIdmember;
	private int fixed_salary;
	public ContractEmployee(String employeed, String name, String federalTaxIdmember, int fixed_salary) {
        super(employeed, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixed_salary = fixed_salary;
    }
	
	public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
    
    public int getFixed_salary() {
        return fixed_salary;
    }

    public void setFixed_salary(int fixed_salary) {
        this.fixed_salary = fixed_salary;
    }  
   

	@Override
	public int calculatePay() {
		
		return fixed_salary;
	}
	
	
	 @Override
	    public String toString() {
	        return "[Name: " + getName() + ", salary for 1 months = " + getFixed_salary() + ", federal tax ID member: " + getFederalTaxIdmember() + "]";

	    }

}
