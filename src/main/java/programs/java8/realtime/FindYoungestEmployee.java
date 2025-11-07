package programs.java8.realtime;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindYoungestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Neha", "HR", 45000, 25),
                new Employee(3, "Kiran", "Finance", 50000, 30)
        );

        Optional<Employee> output = employees.stream().min(Comparator.comparingInt(Employee::getAge));

        output.ifPresent(e -> System.out.println(e.getName() + " "+ e.getAge()));
    }
}
