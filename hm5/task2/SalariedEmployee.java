public class SalariedEmployee extends Employee implements CalculatePayment {
    private int hour;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeed, String name, int salary, int hour,String socialSecurityNumber) {
        super(employeed, name, salary);
        this.hour = hour;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        // here field salary = salary for 1 hour
        return hour*getSalary();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Name is: "+getName()+", hours worked = "+getHour()+", salary for 1 hour = "+getSalary()+"$"+", social security number is: "+getSocialSecurityNumber();
    }
}
