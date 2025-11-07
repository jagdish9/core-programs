package programs.java8.realtime;

import java.util.Arrays;
import java.util.List;

public class FilterByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Arun", "IT", 60000, 28),
                new Employee(2, "Ravi", "HR", 45000, 32),
                new Employee(3, "Neha", "IT", 70000, 26),
                new Employee(4, "Kiran", "Finance", 50000, 30)
        );

        List<Employee> output = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .toList();

        output.forEach(System.out::println);

        System.out.println();

        output.forEach(e ->
                System.out.println(e.getId()+ " "+e.getName() + " "+e.getDepartment()
                + " "+ e.getSalary() + " "+ e.getAge()));
    }
}
