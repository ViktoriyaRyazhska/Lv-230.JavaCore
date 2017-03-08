package week2.tuesday.task1;

/**
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consists of three private fields:
 * - name, rate and hours;
 * And:
 * - static field totalSum;
 * - add properties for access to these fields;
 * - default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters.
 * Methods:
 * - salary - to calculate the salary of person (rate * hours);
 * - toString - to output information about employee;
 * - changeRate - to change the rate of employee;
 * - bonuses – to calculate 10% from salary.
 */
public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    // Constructors
    public Employee() {
    }

    public Employee(String name, int rate) {
        setName(name);
        setRate(rate);
    }

    public Employee(String name, int rate, int hours) {
        setName(name);
        setRate(rate);
        setHours(hours);
        setTotalSum(getTotalSum() + getHours());
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    // Methods
    public int salary() {
        return rate * hours;
    }

    public void changeRate(int rate) {
        setRate(rate);
    }

    public double bonuses() {
        return salary() / 10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
