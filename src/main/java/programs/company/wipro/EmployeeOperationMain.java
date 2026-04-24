package programs.company.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperationMain {
    public static void main(String[] args) {
        List<EmployeeWi> employeeWiList = Arrays.asList(
                new EmployeeWi("Shourya", "HR", 10000),
                new EmployeeWi("Ajay", "IT", 8000),
                new EmployeeWi("Vijay", "Sales", 4000),
                new EmployeeWi("Sanjay", "HR", 5000),
                new EmployeeWi("Khemchand", "Sales", 12000)
        );

        List<String> names = employeeWiList.stream()
                .filter(emp -> emp.getSalary() > 5000)
                .map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}

class EmployeeWi {
    private String name;
    private String department;
    private double salary;

    public EmployeeWi(String name, String department, double salary) {
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

