package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListEmployeeByDepartmentWise {
    public static void main(String[] args) {
        List<Emp02> employees = Arrays.asList(
          new Emp02("Ankit", "HR", 10000),
          new Emp02("Sanjay", "IT", 12000),
          new Emp02("Ranjan", "Sales", 15000),
                new Emp02("Rohit", "IT", 12000),
                new Emp02("Sanvika", "Sales", 15000),
                new Emp02("Surendra", "HR", 10000)
        );

        Map<String, List<Emp02>> output = employees.stream()
                .collect(Collectors.groupingBy(Emp02::getDepartment));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(p -> System.out.println(p.getName() + " "+ p.getSalary()));
            System.out.println();
        });
    }
}

class Emp02 {
    private String name;
    private String department;
    private double salary;

    public Emp02(String name, String department, double salary) {
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
