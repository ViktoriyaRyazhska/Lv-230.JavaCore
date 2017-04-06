 package hw5_2;

public class SalariedEmployee extends Employee implements Payment {

	
	private String socialSecurityNumber;
	private int work_hour;
	private int hourly_rate;
	
	public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int work_hour , int hourly_rate) {
		super(employeeld, name);
		this.hourly_rate = hourly_rate;
		this.work_hour = work_hour;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}

	@Override
	public int calculatePay() {
		
		return work_hour*hourly_rate;
	}
	
	
	public int getWork_hour() {
        return work_hour;
    }

    public void setWork_hour(int work_hour) {
        this.work_hour = work_hour;
    }
     
	
	public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }
    
	public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString() {
        return "[Name: "+getName() + ", hours worked = " + getWork_hour() + ", salary for 1 hour = " + getHourly_rate() + ", social security number: " + getSocialSecurityNumber() + "]";
    }
    
    }
