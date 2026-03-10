package programs.java8revision.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTop3EmployeeWithHighestSalary {
    public static void main(String[] args) {
        List<EmployeeWithSalary> employees = Arrays.asList(
                new EmployeeWithSalary("Ankit", "HR", 10000),
                new EmployeeWithSalary("Sanjay", "IT", 12000),
                new EmployeeWithSalary("Ranjan", "Sales", 15000),
                new EmployeeWithSalary("Alankar", "HR", 19000),
                new EmployeeWithSalary("Rohit", "IT", 12000),
                new EmployeeWithSalary("Anshika", "IT", 17000),
                new EmployeeWithSalary("Sanvika", "Sales", 15000),
                new EmployeeWithSalary("Surendra", "HR", 18000),
                new EmployeeWithSalary("Chiranjeevi", "HR", 20000)
        );

        List<EmployeeWithSalary> output = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeWithSalary::getSalary).reversed())
                .limit(3)
                .toList();

        output.forEach(f -> {
            System.out.println(f.getName() + " - "+ f.getSalary());
        });
    }
}

class EmployeeWithSalary {
    private String name;
    private String department;
    private double salary;

    public EmployeeWithSalary(String name, String department, double salary) {
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
