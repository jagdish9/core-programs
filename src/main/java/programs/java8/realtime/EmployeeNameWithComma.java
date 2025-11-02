package programs.java8.realtime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameWithComma {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "Finance", 50000, 27)
        );

        String output = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(" | "));

        System.out.println(output);
    }
}
