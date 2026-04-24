package programs.company.mphasisjpmc;

//Find top 5 employees with highest salary
//Find employees name who joined after Jan 2025
//Find Top 5 employees in each department
//Find employees name who joined after jan 2025 in each department

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        List<EmpIm> imList = Arrays.asList(
                new EmpIm("Vallari", 15000, "IT", LocalDateTime.now().minusYears(1).plusMonths(3).plusDays(20)),
                new EmpIm("Sapana", 10000, "Sales", LocalDateTime.now().minusMonths(8)),
                new EmpIm("Surli", 9000, "HR", LocalDateTime.now().minusMonths(7)),
                new EmpIm("Murali", 8000, "HR", LocalDateTime.now().minusYears(1).plusMonths(3).plusDays(25)),
                new EmpIm("Manjit", 7000, "Sales", LocalDateTime.now().minusMonths(8)),
                new EmpIm("Meenakshi", 12000, "IT", LocalDateTime.now().minusYears(1)),
                new EmpIm("Ajay", 14000, "Sales", LocalDateTime.now().minusYears(1).plusMonths(3)),
                new EmpIm("Aniket", 18000, "IT", LocalDateTime.now().minusYears(1).plusMonths(2)),
                new EmpIm("Abhishek", 10000, "HR", LocalDateTime.now().minusYears(1).plusDays(10)),
                new EmpIm("Sanjay", 16000, "HR", LocalDateTime.now().minusYears(1).plusMonths(5)),
                new EmpIm("Devdutt", 11000, "IT", LocalDateTime.now().minusYears(1).plusMonths(10)),
                new EmpIm("Swapnil", 12000, "IT", LocalDateTime.of(2026, 1,1,0, 0)),
                new EmpIm("Subhangi", 19000, "IT", LocalDateTime.of(2024, 12,30,0, 0))
        );

        System.out.println("Top 5 Employees with highest salary:");
        imList.stream()
                .sorted(Comparator.comparingDouble(EmpIm::getSalary).reversed())
                .limit(5)
                .forEach(e ->  System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()));

        System.out.println("Employees who joined after Jan 2025:");
        imList.stream()
                .filter(e -> e.getJoiningDate().isAfter(LocalDateTime.of(2025, 1, 1, 0, 0)))
                .map(EmpIm::getName)
                .forEach(System.out::println);

        System.out.println("Find Top 5 employees in each department:");
        imList.stream()
                .collect(Collectors.groupingBy(EmpIm::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(EmpIm::getSalary).reversed())
                                        .limit(5)
                                        .collect(Collectors.toList()))))
                .forEach((dept, empList) -> {
                    System.out.println("Department: " + dept);
                    empList.forEach(e -> System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()));
                });

        System.out.println("Find employees name who joined after jan 2025 in each department");
        imList.stream()
                .collect(Collectors.groupingBy(EmpIm::getDepartment,
                Collectors.collectingAndThen(Collectors.toList(),
                list -> list.stream()
                        .filter(e -> e.getJoiningDate().isAfter(LocalDateTime.of(2025, 1, 1, 0, 0)))
                        .map(EmpIm::getName)
                        .limit(5)
                        .collect(Collectors.toList())
                ))
                )
                .forEach((k, v) -> {
                    System.out.println("Department: " + k);
                    v.forEach(System.out::println);
                });

    }
}

class EmpIm {
    private String name;
    private double salary;
    private String department;
    private LocalDateTime joiningDate;

    public EmpIm(String name, double salary, String department, LocalDateTime joiningDate) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.joiningDate = joiningDate;
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

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }
}

