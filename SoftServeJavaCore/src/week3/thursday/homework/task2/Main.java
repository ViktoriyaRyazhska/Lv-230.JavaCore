package week3.thursday.homework.task2;

/**
 * Create an array of employees and add the employees with different form of payment.
 * Arrange the entire sequence of workers descending the average monthly wage.
 * Output the employee ID, name, and the average monthly wage for all elements of the list.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Vlad", 100, 10, "1234567"),
                new ContractEmployee("Petro", "1002198")
        };

        for (int k = 0; k < employees.length - 1; k++) {
            for (int i = 0; i < employees.length - 1 - k; i++) {
                if (employees[i].calculatePay() < employees[i + 1].calculatePay()) {
                    Employee temp = employees[i + 1];
                    employees[i + 1] = employees[i];
                    employees[i] = temp;
                }
            }
        }

        for (Employee e : employees) {
            System.out.println(
                    e.getEmployeeId() + " " +
                            e.getName() + " " +
                            e.calculatePay()
            );
        }
    }
}
