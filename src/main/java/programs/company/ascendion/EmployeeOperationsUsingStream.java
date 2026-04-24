package programs.company.ascendion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeOperationsUsingStream {
    public static void main(String[] args) {
        List<AscEmp> empList = Arrays.asList(
                new AscEmp("Anju", "Female", "HR", 15000),
                new AscEmp("Sanju", "Male", "IT", 10000),
                new AscEmp("Sangita", "Female", "HR", 12000),
                new AscEmp("Ajay", "Male", "IT", 14000),
                new AscEmp("Neelam", "Female", "HR", 16000),
                new AscEmp("Sujay", "Male", "Sales", 10000),
                new AscEmp("Deepika", "Female", "HR", 13000),
                new AscEmp("Digvijay", "Male", "Sales", 15000),
                new AscEmp("Alia", "Female", "IT", 14000),
                new AscEmp("Dildar", "Male", "Sales", 13000),
                new AscEmp("Jhanvi", "Female", "Sales", 9000)
        );

        List<String> employeeName = empList.stream()
                .filter(emp -> emp.getGender().equals("Female") && emp.getSalary() > 12000)
                //.filter(e -> e.getSalary() > 12000)
                //.map(m -> m.getName())
                .map(AscEmp::getName)
                .collect(Collectors.toList());

        System.out.println(employeeName);


        Map<String, List<AscEmp>> output2 = empList.stream()
                .collect(Collectors.groupingBy(AscEmp::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                ls -> ls.stream()
                                        .sorted(Comparator.comparingDouble(AscEmp::getSalary).reversed())
                                        .limit(1)
                                        .collect(Collectors.toList())
                        )
                ));

        output2.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach(e -> System.out.println(e.getName() + " "+ e.getGender() + " " + e.getSalary()));
        });
    }
}

class AscEmp {
    private String name;
    private String gender;
    private String department;
    private double salary;

    public AscEmp(String name, String gender, String department, double salary) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/*
Employee -> name,age,salary,gender,deptname input List<Employee> employeeList;
 give me list of name of those employee whose gender is female and salary greater than 30000 INR output- List<String> employeename;
Given a list of employees, group by department and find highest salary in each department.

 */
