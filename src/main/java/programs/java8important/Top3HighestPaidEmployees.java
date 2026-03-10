package programs.java8important;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3HighestPaidEmployees {
    public static void main(String[] args) {
        List<EmployeeC1> employeeList = Arrays.asList(
                new EmployeeC1("Sanam", 10000.0, "Sales"),
                new EmployeeC1("Divya", 12000.0, "IT"),
                new EmployeeC1("Jyoti", 14000.0, "HR"),
                new EmployeeC1("Lata", 16000.0, "IT"),
                new EmployeeC1("Anamika", 12000.0, "Sales")
        );

        List<EmployeeC1> output = employeeList.stream()
                .sorted(Comparator.comparingDouble(EmployeeC1::getSalary).reversed())
                .limit(3)
                .toList();

        output.forEach(employeeC1 -> {
            System.out.println(employeeC1.getName() + " " + employeeC1.getSalary() + " " + employeeC1.getDepartment());
        });
    }
}

class EmployeeC1 {
    private String name;
    private double salary;
    private String department;

    public EmployeeC1(String name, double salary, String department) {
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
