package programs.java8important;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEmployeeBySalary {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales"),
                new EmployeeC1("Jacky", 10000.0, "HR")
        );

        Map<Boolean, List<EmployeeC1>> outputBySalary = employeeList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 10000));

        outputBySalary.forEach((k, v) -> {
            System.out.println("gt 10k - " + k);
            v.forEach(emp -> System.out.println(emp.getName() + " "
            + emp.getSalary() + " " + emp.getDepartment()));
        });

        Map<Boolean, List<EmployeeC1>> outputByDept = employeeList.stream()
                .collect(Collectors.partitioningBy(emp ->
                        emp.getDepartment().equalsIgnoreCase("IT")));
    }
}
