package programs.java8important;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDeptAndCount {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales"),
                new EmployeeC1("Sanjay", 16000.0, "Sales"),
                new EmployeeC1("Ajay", 18000.0, "IT"),
                new EmployeeC1("Vijay", 20000.0, "HR"),
                new EmployeeC1("Purva", 22000.0, "IT"),
                new EmployeeC1("Lalita", 24000.0, "HR"),
                new EmployeeC1("Mehul", 23000.0, "Sales"),
                new EmployeeC1("Mahesh", 19000.0, "Sales"),
                new EmployeeC1("Durgesh", 17000.0, "IT"),
                new EmployeeC1("Bibek", 24000.0, "HR"),
                new EmployeeC1("Brijesh", 25000.0, "HR")
        );

        Map<String, Long> output = employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeC1::getDepartment, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println("Department: "+k + " Total dept: "+ v);
        });
    }
}
