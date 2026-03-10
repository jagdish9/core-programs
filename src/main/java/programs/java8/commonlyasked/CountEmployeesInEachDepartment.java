package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesInEachDepartment {
    public static void main(String[] args) {
        List<Emp06> employees = Arrays.asList(
                new Emp06("Ankit", "HR", 10000, "Male"),
                new Emp06("Sanjay", "IT", 12000, "Male"),
                new Emp06("Ranjan", "Sales", 15000, "Male"),
                new Emp06("Alankar", "HR", 19000, "Male"),
                new Emp06("Rohit", "IT", 12000, "Male"),
                new Emp06("Anshika", "IT", 17000, "Female"),
                new Emp06("Sanvika", "Sales", 15000, "Female"),
                new Emp06("Surendra", "HR", 18000, "Male"),
                new Emp06("Chiranjeevi", "HR", 20000, "Male")
        );

        Map<String, Long> output = employees.stream()
                .collect(Collectors.groupingBy(Emp06::getDepartment, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println("Department:" + k);
            System.out.println(v);
            System.out.println();
        });
    }
}

class Emp06 {
    private String name;
    private String department;
    private double salary;
    private String gender;

    public Emp06(String name, String department, double salary, String gender) {
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

