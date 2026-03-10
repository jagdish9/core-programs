package programs.java8important;

import java.util.*;
import java.util.stream.Collectors;

public class FindSecondHighestSalaryWithoutSortingMethod {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales")
        );

        Optional<EmployeeC1> output = employeeList.stream()
                .collect(Collectors.collectingAndThen(
                   Collectors.toCollection(() ->
                           new TreeSet<>(Comparator.comparingDouble(EmployeeC1::getSalary))),
                        set -> set.stream()
                                .skip(set.size() - 2)
                                .findFirst()
                ));

        output.ifPresent(f -> System.out.println(f.getName() + " " + f.getSalary()
        + " " + f.getDepartment()));
    }
}
