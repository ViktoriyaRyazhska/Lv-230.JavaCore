public abstract class Employee {
    private String employeed;
    private String name;
    private int salary;

    public Employee(String employeed, String name, int salary) {
        this.employeed = employeed;
        this.name = name;
        this.salary = salary;
    }

    public String getEmployeed() {
        return employeed;
    }

    public void setEmployeed(String employeed) {
        this.employeed = employeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
