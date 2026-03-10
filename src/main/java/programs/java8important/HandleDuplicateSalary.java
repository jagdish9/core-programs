package programs.java8important;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HandleDuplicateSalary {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales"),
                new EmployeeC1("Yogita", 16000.0, "HR")
        );

        List<EmployeeC1> output = employeeList.stream()
                .sorted(Comparator.comparing(EmployeeC1::getSalary)
                        .thenComparing(EmployeeC1::getName))
                .toList();

        output.forEach(e -> {
            System.out.println(e.getName() + " " + e.getSalary() + " " +e.getDepartment());
        });
    }
}
