package programs.java8important;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConcatenateEmployeeName {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales")
        );

        Collector<EmployeeC1, StringBuilder, String> nameCollector = Collector.of(
                StringBuilder::new,
                (sb, emp) -> sb.append(emp.getName()).append(","),
                StringBuilder::append,
                StringBuilder::toString
        );

        String result = employeeList.stream().collect(nameCollector);
        System.out.println(result);

        List<String> empList = employeeList.stream()
                .map(EmployeeC1::getName)
                .toList();

        System.out.println(empList);
    }
}
