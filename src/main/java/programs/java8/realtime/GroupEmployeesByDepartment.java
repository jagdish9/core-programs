package programs.java8.realtime;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "IT", 70000, 26),
                new Employee(4, "Kiran", "Finance", 50000, 30)
        );

        Map<String, List<Employee>> output = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(e -> System.out.println(e.getName() + " "+ e.getId()));
            System.out.println();
        });
    }
}
