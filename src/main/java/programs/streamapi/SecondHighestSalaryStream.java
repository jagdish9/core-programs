package programs.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryStream {
    public static void main(String[] args) {
        List<EmployeeClass3> employees = Arrays.asList(
                new EmployeeClass3("Alice", 50000),
                new EmployeeClass3("Bob", 75000),
                new EmployeeClass3("Charlie", 60000),
                new EmployeeClass3("David", 75000),
                new EmployeeClass3("Eve", 90000)
        );

        Optional<Double> secondHighestSalary = employees.stream()
                .map(EmployeeClass3::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighestSalary.ifPresent(System.out::println);
    }
}

class EmployeeClass3 {
    private String name;
    private double salary;

    public EmployeeClass3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
