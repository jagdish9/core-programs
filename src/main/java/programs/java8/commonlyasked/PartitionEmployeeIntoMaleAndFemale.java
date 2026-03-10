package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeeIntoMaleAndFemale {
    public static void main(String[] args) {
        List<Emp05> employees = Arrays.asList(
                new Emp05("Ankit", "HR", 10000, "Male"),
                new Emp05("Sanjay", "IT", 12000, "Male"),
                new Emp05("Ranjan", "Sales", 15000, "Male"),
                new Emp05("Alankar", "HR", 19000, "Male"),
                new Emp05("Rohit", "IT", 12000, "Male"),
                new Emp05("Anshika", "IT", 17000, "Female"),
                new Emp05("Sanvika", "Sales", 15000, "Female"),
                new Emp05("Surendra", "HR", 18000, "Male"),
                new Emp05("Chiranjeevi", "HR", 20000, "Male")
        );

        Map<Boolean, List<Emp05>> output = employees.stream()
                .collect(Collectors.partitioningBy(emp05 -> emp05.getGender().equalsIgnoreCase("Male")));

        output.forEach((k, v) -> {
            System.out.println("Gender: "+ k);
            v.forEach(nv -> System.out.println(nv.getName() + " " + nv.getSalary() + " " + nv.getGender() + " "+ nv.getDepartment()));
        });
    }
}

class Emp05 {
    private String name;
    private String department;
    private double salary;
    private String gender;

    public Emp05(String name, String department, double salary, String gender) {
        this.name = name;
        this.department = department;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }
}

