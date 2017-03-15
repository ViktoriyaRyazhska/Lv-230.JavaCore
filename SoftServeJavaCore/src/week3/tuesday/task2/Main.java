package week3.tuesday.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create five objects of class Employee.
 * Display:
 * - all employees of a certain department (enter department number in the console);
 * - arrange workers by the field salary in descending order.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Employee vlad = new Employee("Vlad", 1, 1000);
        Employee max = new Employee("Max", 1, 2000);
        Employee volodymyr = new Employee("Volodymyr", 3, 5000);
        Employee andrii = new Employee("Andrii", 3, 3000);
        Employee stepan = new Employee("Stepan", 4, 9000);

        Employee employees[] = {vlad, max, volodymyr, andrii, stepan};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of department: ");
        int departmentNumber = Integer.parseInt(reader.readLine());
        System.out.println("Employees by DepartmentID:");
        outputEmployeesByDepartment(departmentNumber, employees);
        System.out.println("\nArranged employees by salary:");
        arrangeEmployeesBySalary(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static void outputEmployeesByDepartment(int departmentNumber, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == departmentNumber) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void arrangeEmployeesBySalary(Employee[] employees) {
        for (int k = 0; k < employees.length - 1; k++) {
            for (int i = 0; i < employees.length - 1 - k; i++) {
                if (employees[i].getSalary() < employees[i + 1].getSalary()) {
                    Employee temp = employees[i + 1];
                    employees[i + 1] = employees[i];
                    employees[i] = temp;
                }
            }
        }
    }
}
