package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindEmployeeHavingHighestSalary {
    public static void main(String[] args) {
        List<Emp03> employees = Arrays.asList(
                new Emp03("Ankit", "HR", 10000),
                new Emp03("Sanjay", "IT", 12000),
                new Emp03("Ranjan", "Sales", 15000),
                new Emp03("Rohit", "IT", 12000),
                new Emp03("Anshika", "IT", 17000),
                new Emp03("Sanvika", "Sales", 15000),
                new Emp03("Surendra", "HR", 10000)
        );

        Emp03 empData = employees.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary()))
                .get();

        System.out.println(empData.getName());
    }
}

class Emp03 {
    private String name;
    private String department;
    private double salary;

    public Emp03(String name, String department, double salary) {
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

