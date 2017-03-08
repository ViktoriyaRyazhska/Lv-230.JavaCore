package week2.tuesday.task1;

/**
 * In the method main() create 3 objects of Employee type.
 * Input information about them.
 * Display the total hours of all workers to screen.
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Name1", 2, 100);
        Employee e2 = new Employee("Name2", 5, 50);
        Employee e3 = new Employee("Name3", 4, 80);

        System.out.println(Employee.getTotalSum());
    }
}
