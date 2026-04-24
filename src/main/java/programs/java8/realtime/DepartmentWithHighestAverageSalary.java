package programs.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWithHighestAverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Neha", "IT", 70000, 26),
                new Employee(3, "Ravi", "HR", 45000, 32),
                new Employee(4, "Kiran", "Finance", 50000, 30)
        );

        Map.Entry<String, Double> output = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(output.getKey() + " "+output.getValue());

        Map.Entry<String, Double> output2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .limit(1)
                .findFirst()
                .get();

        System.out.println(output2.getKey() + " "+output2.getValue());
    }
}
