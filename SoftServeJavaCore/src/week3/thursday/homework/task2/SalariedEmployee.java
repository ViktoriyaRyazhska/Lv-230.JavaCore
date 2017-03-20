package week3.thursday.homework.task2;

/**
 * Create class SalariedEmployee,
 * which implement interface and are inherited from the base class (modified).
 * Describe hourly paid workers.
 * Describe the string variable socialSecurityNumber in the class SalariedEmployee.
 */
public class SalariedEmployee extends Employee { // implemented interface into Employee
    private int hourPay;
    private int workedHours;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, int hourPay, int workedHours, String socialSecurityNumber) {
        super(name);
        setHourPay(hourPay);
        setWorkedHours(workedHours);
        setSocialSecurityNumber(socialSecurityNumber);
    }

    @Override
    public int calculatePay() {
        return getWorkedHours() * getHourPay();
    }

    public int getHourPay() {
        return hourPay;
    }

    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
