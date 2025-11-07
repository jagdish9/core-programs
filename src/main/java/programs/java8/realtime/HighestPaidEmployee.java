package programs.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "IT", 70000, 26)
        );

        Optional<Employee> output = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        output.ifPresent(e -> System.out.println(e.getSalary()));
    }
}
