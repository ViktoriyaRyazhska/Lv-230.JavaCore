package week3.thursday.homework.task2;

/**
 * The base class Employee with a string variable employeeld.
 * The calculation formula for the "time-worker“ is: "the average monthly salary = hourly rate * number of hours worked"
 */
public abstract class Employee implements Payable {
    private static int globalEmployeeId;
    private String name;
    private int employeeId;

    public Employee(String name) {
        setName(name);
        globalEmployeeId++;
        this.employeeId = globalEmployeeId; // For setEmployeeId(globalEmployeeId) does`t work ?
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int emloyeeId) {
        this.employeeId = employeeId;
    }


}
