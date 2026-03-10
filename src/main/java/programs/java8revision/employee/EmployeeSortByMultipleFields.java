package programs.java8revision.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortByMultipleFields {
    public static void main(String[] args) {
        List<EmployeeWithMultipleFields> employees = Arrays.asList(
                new EmployeeWithMultipleFields("Ankit", "HR", 10000),
                new EmployeeWithMultipleFields("Sanjay", "IT", 12000),
                new EmployeeWithMultipleFields("Ranjan", "Sales", 15000),
                new EmployeeWithMultipleFields("Alankar", "HR", 19000),
                new EmployeeWithMultipleFields("Rohit", "IT", 12000),
                new EmployeeWithMultipleFields("Anshika", "IT", 17000),
                new EmployeeWithMultipleFields("Sanvika", "Sales", 15000),
                new EmployeeWithMultipleFields("Surendra", "HR", 18000),
                new EmployeeWithMultipleFields("Chiranjeevi", "HR", 20000),
                new EmployeeWithMultipleFields("Megha", "HR", 20000)
        );

        List<EmployeeWithMultipleFields> output = employees.stream()
                .sorted(Comparator.comparing(EmployeeWithMultipleFields::getSalary)
                        .thenComparing(EmployeeWithMultipleFields::getName))
                .toList();

        output.forEach(employeeWithMultipleFields ->
                System.out.println(employeeWithMultipleFields.getName() + " " +
                        employeeWithMultipleFields.getSalary() + " " +
                        employeeWithMultipleFields.getDepartment()));
    }
}

class EmployeeWithMultipleFields {
    private String name;
    private String department;
    private double salary;

    public EmployeeWithMultipleFields(String name, String department, double salary) {
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
