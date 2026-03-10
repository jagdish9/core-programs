package programs.java8revision.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindEmployeeWhichHavingHighestSalary {
    public static void main(String[] args) {
        List<EmployeeSalary> employees = Arrays.asList(
                new EmployeeSalary("Ankit", "HR", 10000),
                new EmployeeSalary("Sanjay", "IT", 12000),
                new EmployeeSalary("Ranjan", "Sales", 15000),
                new EmployeeSalary("Rohit", "IT", 12000),
                new EmployeeSalary("Anshika", "IT", 17000),
                new EmployeeSalary("Sanvika", "Sales", 15000),
                new EmployeeSalary("Surendra", "HR", 10000)
        );

        EmployeeSalary employeeSalary = employees.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary()))
                .get();

        employees.stream()
                        .map(s -> s.getSalary())
                                .sorted(Comparator.reverseOrder())
                .findFirst()
                .ifPresent(System.out::println);
                                                ;

        System.out.println(employeeSalary.getName());
    }
}

class EmployeeSalary {
    private String name;
    private String department;
    private double salary;

    public EmployeeSalary(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
