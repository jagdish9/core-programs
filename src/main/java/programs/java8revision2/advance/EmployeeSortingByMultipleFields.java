package programs.java8revision2.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortingByMultipleFields {
    public static void main(String[] args) {
        List<EmpMultipleFields> list = Arrays.asList(
                new EmpMultipleFields("Ranbir", 10000, 30),
                new EmpMultipleFields("Alia", 12000, 28),
                new EmpMultipleFields("Kiera", 10000, 26),
                new EmpMultipleFields("Advani", 14000, 30),
                new EmpMultipleFields("Raina", 10000, 35),
                new EmpMultipleFields("Samay", 17000, 35),
                new EmpMultipleFields("Allu", 12000, 31)
        );

        //Sort by salary
        //If salary same, sort by age
        //if age same, sort by name

        list.stream()
                .sorted(Comparator.comparingDouble(EmpMultipleFields::getSalary).reversed()
                        .thenComparing(EmpMultipleFields::getAge)
                        .thenComparing(EmpMultipleFields::getName))
                .forEach(emp -> {
                    System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getAge());
                });
    }
}

class EmpMultipleFields {
    private String name;
    private double salary;
    private int age;

    public EmpMultipleFields(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
