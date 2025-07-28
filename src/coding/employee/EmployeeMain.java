package coding.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(85000.00, "Aditi Sharma", "Technology"),
                new Employee(95000.00, "Rohan Kumar", "Engineering"),
                new Employee(120000.00, "Priya Singh", "Engineering"),
                new Employee(72000.00, "Vikram Patel", "Human Resources"),
                new Employee(150000.00, "Anjali Mehta", "Technology")
        );

        List<String> highPaidEmployee = employeeList.stream()
                .filter(p -> p.getSalary() >= 100000)
                .map(Employee::getName)
                 .collect(Collectors.toList());

        System.out.println(highPaidEmployee);

    }
}
