package programs.repractise;

import java.util.Comparator;
import java.util.List;

public class FindMaxSalaryEmployee {

    static class EmpployeeData {
        private String name;
        private double salary;

        public EmpployeeData(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        List<EmpployeeData> employees = List.of(
                new EmpployeeData("Jaani", 10000),
                new EmpployeeData("Chhotu", 13000),
                new EmpployeeData("Mongabo", 11000));

        employees.stream()
                .max(Comparator.comparing(EmpployeeData::getSalary))
                .map(EmpployeeData::getName)
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
