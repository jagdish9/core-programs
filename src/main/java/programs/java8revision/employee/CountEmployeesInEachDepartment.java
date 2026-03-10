package programs.java8revision.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesInEachDepartment {
    public static void main(String[] args) {
        List<EmployeeDepartment> employees = Arrays.asList(
                new EmployeeDepartment("Ankit", "HR", 10000, "Male"),
                new EmployeeDepartment("Sanjay", "IT", 12000, "Male"),
                new EmployeeDepartment("Ranjan", "Sales", 15000, "Male"),
                new EmployeeDepartment("Alankar", "HR", 19000, "Male"),
                new EmployeeDepartment("Rohit", "IT", 12000, "Male"),
                new EmployeeDepartment("Anshika", "IT", 17000, "Female"),
                new EmployeeDepartment("Sanvika", "Sales", 15000, "Female"),
                new EmployeeDepartment("Surendra", "HR", 18000, "Male"),
                new EmployeeDepartment("Chiranjeevi", "HR", 20000, "Male")
        );

        Map<String, Long> output = employees.stream()
                .collect(Collectors.groupingBy(EmployeeDepartment::getDepartment, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println(k + ": "+ v);
        });
    }
}

class EmployeeDepartment {
    private String name;
    private String department;
    private double salary;
    private String gender;

    public EmployeeDepartment(String name, String department, double salary, String gender) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }
}
