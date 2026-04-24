package programs.company.infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindListOfEmployees {
    public static void main(String[] args) {
        List<InfyEmp> empList = Arrays.asList(
                new InfyEmp("Dhena", 12000),
                new InfyEmp("Sanju", 10000),
                new InfyEmp("Bheegu", 11000),
                new InfyEmp("Anju", 9000),
                new InfyEmp("Manju", 12000),
                new InfyEmp("Megha", 10000),
                new InfyEmp("Bhagat", 11000),
                new InfyEmp("Shivend", 10000),
                new InfyEmp("Saniya", 11000)
        );

       /* List<InfyEmp> output = empList.stream()
                .sorted(Comparator.comparingDouble(InfyEmp::getSalary).reversed())
                .skip(1)
                .collect(Collectors.toList());*/

        //output.forEach(k -> System.out.println(k.getName() + " - " + k.getSalary()));

        List<List<InfyEmp>> secondHighestSalary = empList.stream()
                .collect(Collectors.groupingBy(InfyEmp::getSalary))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .skip(1)
                .limit(1)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        /*secondHighestSalary.forEach(l -> {
            l.forEach(m -> System.out.println(m.getName() + " - "+ m.getSalary()));
        });*/

        empList.stream()
                .collect(Collectors.groupingBy(InfyEmp::getSalary))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .skip(1)
                .limit(1)
                .map(Map.Entry::getValue)
                .findFirst()
                .ifPresent(emp -> {
                    emp.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
                });

    }
}

class InfyEmp {
    private String name;
    private double salary;

    public InfyEmp(String name, double salary) {
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
