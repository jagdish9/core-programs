package programs.java8revision2.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindEmployeeWhoHavingHighestSalary {
    public static void main(String[] args) {
        List<EmpSalary> empSalaryList = Arrays.asList(
                new EmpSalary("Mahek", 10000),
                new EmpSalary("Chandani", 9000),
                new EmpSalary("Shourya", 8000),
                new EmpSalary("Azaad", 11000),
                new EmpSalary("Swapnil", 12000),
                new EmpSalary("Vikash", 1300),
                new EmpSalary("Amanika", 8000)
        );

        //Highest Salary
        empSalaryList.stream()
                .sorted(Comparator.comparingDouble(EmpSalary::getSalary).reversed())
                .limit(1)
                .findFirst()
                .ifPresent(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));

        System.out.println();

        //Top 3 employee with highest salary
        empSalaryList.stream()
                .sorted(Comparator.comparingDouble(EmpSalary::getSalary).reversed())
                .limit(3)
                .forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));
    }
}

class EmpSalary {
    private String name;
    private double salary;

    public EmpSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
