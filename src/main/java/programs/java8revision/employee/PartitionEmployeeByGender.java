package programs.java8revision.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeeByGender {
    public static void main(String[] args) {
        List<EmployeePartition> employees = Arrays.asList(
                new EmployeePartition("Ankit", "HR", 10000, "Male"),
                new EmployeePartition("Sanjay", "IT", 12000, "Male"),
                new EmployeePartition("Ranjan", "Sales", 15000, "Male"),
                new EmployeePartition("Alankar", "HR", 19000, "Male"),
                new EmployeePartition("Rohit", "IT", 12000, "Male"),
                new EmployeePartition("Anshika", "IT", 17000, "Female"),
                new EmployeePartition("Sanvika", "Sales", 15000, "Female"),
                new EmployeePartition("Surendra", "HR", 18000, "Male"),
                new EmployeePartition("Chiranjeevi", "HR", 20000, "Male")
        );

        Map<Boolean, List<EmployeePartition>> output = employees.stream()
                .collect(Collectors.partitioningBy(employeePartition -> employeePartition.getGender().equalsIgnoreCase("Male")));

        output.forEach((k, v) -> {
            String gender = k == true ? "Male" : "Female";
            System.out.println("Gender: " +gender);
            v.forEach(employeePartition -> System.out.println(employeePartition.getName()));
        });
    }
}

class EmployeePartition {
    private String name;
    private String department;
    private double salary;
    private String gender;

    public EmployeePartition(String name, String department, double salary, String gender) {
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
