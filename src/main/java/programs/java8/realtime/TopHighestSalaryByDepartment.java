package programs.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopHighestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Neha", "IT", 70000, 26),
                new Employee(3, "Kiran", "Finance", 50000, 30),
                new Employee(4, "Ravi", "HR", 45000, 32),
                new Employee(5, "Vikas", "IT", 80000, 25),
                new Employee(5, "Arvind", "Finance", 85000, 30),
                new Employee(5, "Rakesh", "HR", 95000, 35)
        );

        Map<String, List<Employee>> output = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                ls -> ls.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                        .limit(1)
                                        .toList()
                        )));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(e -> System.out.println(e.getName() + " "+ e.getSalary()));
            System.out.println();
        });
    }
}
