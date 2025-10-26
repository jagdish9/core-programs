package programs.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class GetEmployeeDataUsingStream {
    public static void main(String[] args) {
        List<EmployeeDataClass> people = Arrays.asList(
                new EmployeeDataClass("David", 25000, "IT"),
                new EmployeeDataClass("James", 35000, "Sales"),
                new EmployeeDataClass("Jack", 27000, "Mech"),
                new EmployeeDataClass("Uma", 25000, "Mech"),
                new EmployeeDataClass("Lawrence", 24000, "Mech"),
                new EmployeeDataClass("Jennifer", 38000, "Sales"),
                new EmployeeDataClass("Monk", 33000, "Sales"),
                new EmployeeDataClass("Zoro", 31000, "Sales"),
                new EmployeeDataClass("Hunk", 20000, "Electrical"),
                new EmployeeDataClass("Tony", 32000, "Electrical"),
                new EmployeeDataClass("Pazysk", 30000, "Electrical"),
                new EmployeeDataClass("Jennifer", 35000, "IT"),
                new EmployeeDataClass("Lamis", 40000, "IT")
        );

        System.out.println("---Employee data---");
        people.forEach(
                e -> System.out.println(e.getName() + " " + e.getSalary() + " "+e.getDepartment()));

        System.out.println();
        //Accumulate names into list
        List<String> names = people.stream().map(EmployeeDataClass::getName).toList();
        System.out.println(names);

        System.out.println();
        //Names starts with any char
        List<String> peopleNames = people.stream()
                .map(EmployeeDataClass::getName)
                .filter(e -> e.startsWith("J"))
                .sorted()
                .toList();
        System.out.println(peopleNames);

        System.out.println();
        //Accumulate into TreeSet
        Set<String> uniqueNames = people.stream()
                .map(EmployeeDataClass::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(uniqueNames);

        System.out.println();
        //Convert elements to string and concatenate them, separated by commas
        String namesInOneLine = people.stream()
                .map(EmployeeDataClass::getName)
                .collect(Collectors.joining(", "));
        System.out.println(namesInOneLine);

        System.out.println();
        //Compute sum of salaries of employee
        /*double total = people.stream()
                .collect(Collectors.summingDouble(EmployeeDataClass::getSalary));*/
        double total = people.stream().mapToDouble(EmployeeDataClass::getSalary).sum();
        System.out.println(total);

        System.out.println();
        //Group employees by department
        Map<String, List<EmployeeDataClass>> groupByDept = people.stream()
                .collect(Collectors.groupingBy(EmployeeDataClass::getDepartment));
        groupByDept.forEach(
                (d, l) -> {
                    System.out.println("Department: " +d);
                    l.forEach(e -> System.out.println (e.getName() + " "+ e.getSalary()));
                    System.out.println();
                }
        );

        System.out.println("Max salary by department");
        Map<String, Optional<EmployeeDataClass>> maxSalaryByDept = people.stream()
                .collect(Collectors.groupingBy(EmployeeDataClass::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDataClass::getSalary))));

        maxSalaryByDept.forEach((s, l) -> {
                System.out.println("Department: "+s);
                System.out.println("Highest Salary: "+ (l.isPresent() ? l.get().getSalary(): "N/A"));
        }
        );

        System.out.println();
        System.out.println("Top 2 highest paid employees");
        //Top 3 highest paid actors
        Map<String, List<EmployeeDataClass>> top2Salary = people.stream()
                .collect(Collectors.groupingBy(EmployeeDataClass::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingDouble(EmployeeDataClass::getSalary).reversed())),
                                set -> set.stream().limit(2).collect(Collectors.toList())
                        )));

        top2Salary.forEach((d, s) -> {
            System.out.println("Department: "+ d);
            s.forEach(e -> System.out.println(e.getName() + " "+ e.getSalary()));
            System.out.println();
        });

        System.out.println();
        System.out.println("Print sum of salaries by department");
        //compute sum of salaries by department
        Map<String, Double> totalSalariesByDept = people.stream()
                .collect(Collectors.groupingBy(EmployeeDataClass::getDepartment,
                        Collectors.summingDouble(EmployeeDataClass::getSalary)));
        totalSalariesByDept.forEach((d, s) -> {
            System.out.println("Department: " +d);
            System.out.println(s);
            System.out.println();
        });
    }
}

class EmployeeDataClass {
    private String name;
    private double salary;
    private String department;

    public EmployeeDataClass(String name, double salary, String department) {
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
