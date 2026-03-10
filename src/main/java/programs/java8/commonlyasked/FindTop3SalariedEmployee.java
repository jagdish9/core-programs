package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTop3SalariedEmployee {
    public static void main(String[] args) {
        List<Emp04> employees = Arrays.asList(
                new Emp04("Ankit", "HR", 10000),
                new Emp04("Sanjay", "IT", 12000),
                new Emp04("Ranjan", "Sales", 15000),
                new Emp04("Alankar", "HR", 19000),
                new Emp04("Rohit", "IT", 12000),
                new Emp04("Anshika", "IT", 17000),
                new Emp04("Sanvika", "Sales", 15000),
                new Emp04("Surendra", "HR", 18000),
                new Emp04("Chiranjeevi", "HR", 20000)
        );

        List<Emp04> output = employees.stream()
                .sorted(Comparator.comparingDouble(Emp04::getSalary).reversed())
                .limit(3)
                .toList();

        output.forEach(e -> System.out.println(e.getDepartment() + " " + e.getName() + " " + e.getSalary()));
    }
}

class Emp04 {
    private String name;
    private String department;
    private double salary;

    public Emp04(String name, String department, double salary) {
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
