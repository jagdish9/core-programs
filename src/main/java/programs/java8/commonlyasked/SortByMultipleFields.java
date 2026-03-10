package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByMultipleFields {
    public static void main(String[] args) {
        List<Emp07> employees = Arrays.asList(
                new Emp07("Ankit", "HR", 10000),
                new Emp07("Sanjay", "IT", 12000),
                new Emp07("Ranjan", "Sales", 15000),
                new Emp07("Alankar", "HR", 19000),
                new Emp07("Rohit", "IT", 12000),
                new Emp07("Anshika", "IT", 17000),
                new Emp07("Sanvika", "Sales", 15000),
                new Emp07("Surendra", "HR", 18000),
                new Emp07("Chiranjeevi", "HR", 20000)
        );

         List<Emp07> output = employees.stream()
                .sorted(Comparator.comparing(Emp07::getDepartment)
                        .thenComparing(e -> e.getName())
                        .thenComparing(e -> e.getSalary()))
                 .toList();

         output.forEach(e -> System.out.println(e.getDepartment() + " "+e.getName() + " "+ e.getSalary()));
    }
}

class Emp07 {
    private String name;
    private String department;
    private double salary;

    public Emp07(String name, String department, double salary) {
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