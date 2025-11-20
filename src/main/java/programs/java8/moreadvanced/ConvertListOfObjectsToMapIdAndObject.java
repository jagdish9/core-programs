package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfObjectsToMapIdAndObject {
    public static void main(String[] args) {
        List<EMP01> employees = Arrays.asList(
                new EMP01(10L, "Anshu", 12000),
                new EMP01(20L, "Anamika", 15000)
        );

        Map<Long, EMP01> empMap = employees.stream()
                .collect(Collectors.toMap(EMP01::getId, obj -> obj));

        empMap.forEach((key, value) -> System.out.println(key));
    }
}

class EMP01 {
    private Long id;
    private String name;
    private double salary;

    public EMP01(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
