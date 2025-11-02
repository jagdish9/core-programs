package programs.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortSalaryByDescendingOrder {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "IT", 70000, 26)
        );

        List<Employee> output = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();

        output.forEach(employee ->
                System.out.println(employee.getId() +
                        " "+ employee.getName() + " "+ employee.getSalary()));
    }
}
