package programs.java8revision3.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployeeBySalaryAndOtherFields {
    public static void main(String[] args) {
        List<EmpOther> empList = Arrays.asList(
          new EmpOther("ajay", "HR", 10000, 25, "M"),
          new EmpOther("vijay", "IT", 12000, 23, "M"),
          new EmpOther("sanjay", "HR", 9000, 22, "M"),
          new EmpOther("digvijay", "IT", 11000, 27, "M"),
          new EmpOther("mithun", "Sales", 8000, 30, "M"),
          new EmpOther("megha", "HR", 14000, 23, "F"),
          new EmpOther("manoj", "Sales", 15000, 33, "M"),
          new EmpOther("yogini", "Sales", 17000, 34, "F"),
          new EmpOther("tiranjali", "IT", 16000, 38, "F"),
          new EmpOther("jay", "HR", 17000, 30, "M")
        );

        List<EmpOther> sortedOutput = empList.stream()
                .sorted(Comparator.comparingDouble(EmpOther::getSalary).reversed()
                        .thenComparing(EmpOther::getDepartment)
                        .thenComparing(EmpOther::getName)
                        .thenComparing(EmpOther::getAge).reversed()
                )
                .collect(Collectors.toList());

        sortedOutput.forEach(emp ->
                System.out.println(emp.getName() + " " + emp.getDepartment() +
                        " "+ emp.getAge() + " " + emp.getSalary())
        );

        System.out.println();

        //Find employees which having the highest salary
        List<EmpOther> employeesWithHighestSalary = empList.stream()
                .collect(Collectors.groupingBy(EmpOther::getSalary))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .map(m -> m.getValue())
                .limit(1)
                .collect(Collectors.toList())
                .get(0);

        employeesWithHighestSalary.forEach( emp ->
                System.out.println(emp.getName() + " " + emp.getDepartment() +
                        " "+ emp.getAge() + " " + emp.getSalary())
        );

        System.out.println();

        //Find top 3 employees with the highest salary
        List<EmpOther> top3HighestSalary = empList.stream()
                .sorted(Comparator.comparingDouble(EmpOther::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        top3HighestSalary.forEach( emp ->
                System.out.println(emp.getName() + " " + emp.getDepartment() +
                        " "+ emp.getAge() + " " + emp.getSalary())
        );

        System.out.println();

        //List employees by department wise
        Map<String, List<EmpOther>> empByDeptWise = empList.stream()
        	.collect(Collectors.groupingBy(EmpOther::getDepartment));

        empByDeptWise.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(
                    emp ->
                            System.out.println(emp.getName() + " " + emp.getDepartment() +
                                    " "+ emp.getAge() + " " + emp.getSalary())
            );
            System.out.println();
        });

        System.out.println();

        //Partition employee by Gender
        Map<Boolean, List<EmpOther>> byGender = empList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getGender().equalsIgnoreCase("M")));

        byGender.forEach((k, v) -> {
            System.out.println(k ? "Male" : "Female");
            v.forEach(
                    emp ->
                            System.out.println(emp.getName() + " " + emp.getDepartment() +
                                    " "+ emp.getAge() + " " + emp.getSalary())
            );
        });

        System.out.println();
        //Find top 2 highest salary by department wise
        Map<String, List<EmpOther>> top2SalaryByDeptWise = empList.stream()
                .collect(Collectors.groupingBy(EmpOther::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                ls -> ls.stream()
                                        .sorted(Comparator.comparingDouble(EmpOther::getSalary).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())
                        )
                ));

        top2SalaryByDeptWise.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(
                    emp ->
                            System.out.println(emp.getName() + " " + emp.getDepartment() +
                                    " "+ emp.getAge() + " " + emp.getSalary())
            );
            System.out.println();
        });
    }
}

class EmpOther {
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;

    public EmpOther(String name, String department, double salary, int age, String gender) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}