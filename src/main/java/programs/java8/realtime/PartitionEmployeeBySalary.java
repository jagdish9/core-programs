package programs.java8.realtime;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "Finance", 50000, 27)
        );

        Map<Boolean, List<Employee>> output = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 50000));

        output.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach(e -> System.out.println(e.getName() + " "+ e.getSalary() + " "+ e.getDepartment()));
            System.out.println();
        });
    }
}
