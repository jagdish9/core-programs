package programs.java8.realtime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(5,"John", "HR", 5000, 35),
                new Employee(7,"David", "IT", 8000, 33),
                new Employee(9,"George", "Finance", 10000, 30),
                new Employee(11,"James", "Sales", 9000, 28)
        );

        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);
    }
}
