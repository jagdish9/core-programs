package mon;

import java.util.Arrays;

import java.util.*;
import java.util.stream.*;

public class SecondHighestInEachDept {
    public static void main(String[] args) {
        List<Emp> empList = Arrays.asList(
                new Emp("A1", 1000, "HR"),
                new Emp("A2", 1200, "HR"),
                new Emp("A3", 1500, "HR"),
                new Emp("B1", 1300, "IT"),
                new Emp("B1", 1000, "IT"),
                new Emp("B2", 1100, "IT")
        );

        Map<String, List<Emp>> output = empList.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList()
                                ,emp -> emp.stream()
                                        .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
                                        .skip(1)
                                        .limit(1)
                                        .collect(Collectors.toList())
                        )));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(e -> System.out.println(e.getName() + " " + e.getDepartment() + " " + e.getSalary()));
        });

        Map<String, Object> deptAndName = empList.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList()
                                ,emp -> emp.stream()
                                        .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
                                        .skip(1)
                                        .limit(1)
                                        .map(m -> m.getName())
                                        .toList()
                        )));

        deptAndName.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }
}

class Emp {
    private String name;
    private double salary;
    private String department;

    public Emp(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
