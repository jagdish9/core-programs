package programs.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopHighestSalaryOfEmployee {
    public static void main(String[] args) {
        List<EmployeeData> employees = Arrays.asList(
                new EmployeeData("Alice", "IT", 95000),
                new EmployeeData("Bob", "IT", 87000),
                new EmployeeData("Charlie", "IT", 99000),
                new EmployeeData("David", "IT", 88000),
                new EmployeeData("Eva", "Sales", 76000),
                new EmployeeData("Frank", "Sales", 82000),
                new EmployeeData("Grace", "Sales", 91000),
                new EmployeeData("Henry", "Sales", 89000),
                new EmployeeData("Ivy", "Finance", 93000),
                new EmployeeData("Jack", "Finance", 97000),
                new EmployeeData("Kane", "Finance", 85000),
                new EmployeeData("Leo", "Finance", 92000)
        );

        Map<String, List<EmployeeData>> topByDept =
                employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeData::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(EmployeeData::getSalary).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));

        topByDept.forEach((dept, list) -> {
            System.out.println("Department: "+ dept);
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}

class EmployeeData {
    private String name;
    private String department;
    private double salary;

    public EmployeeData(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ") - " + salary;
    }
}

