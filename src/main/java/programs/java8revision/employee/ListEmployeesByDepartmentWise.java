package programs.java8revision.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListEmployeesByDepartmentWise {
    public static void main(String[] args) {
        List<EmployeeWithDepartment> employees = Arrays.asList(
                new EmployeeWithDepartment("Ankit", "HR", 10000),
                new EmployeeWithDepartment("Sanjay", "IT", 12000),
                new EmployeeWithDepartment("Ranjan", "Sales", 15000),
                new EmployeeWithDepartment("Rohit", "IT", 12000),
                new EmployeeWithDepartment("Sanvika", "Sales", 15000),
                new EmployeeWithDepartment("Surendra", "HR", 10000)
        );

        Map<String, List<EmployeeWithDepartment>> output = employees.stream()
                .collect(Collectors.groupingBy(EmployeeWithDepartment::getDepartment));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(e -> System.out.println(e.getName()));
        });
    }
}

class EmployeeWithDepartment {
    private String name;
    private String department;
    private double salary;

    public EmployeeWithDepartment(String name, String department, double salary) {
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
