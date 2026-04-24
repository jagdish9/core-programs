package programs.company.skidata;

import javax.xml.stream.events.EntityReference;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDepartmentAndCount {
    public static void main(String[] args) {
        List<EmpObject> empList = Arrays.asList(
                new EmpObject(10,"Anna", "HR", 10000, "Bangalore"),
                new EmpObject(20,"Zanna", "HR", 12000, "Hyderabad"),
                new EmpObject(30,"Saini", "IT", 13000, "Chennai"),
                new EmpObject(40,"Zoro", "IT", 14000, "Noida"),
                new EmpObject(50,"Yeman", "Sales", 11000, "Bangalore"),
                new EmpObject(60,"Bhumika", "Sales", 10000, "Hyderabad"),
                new EmpObject(70,"Mastani", "Admin", 15000, "Chennai"),
                new EmpObject(80,"Nyar", "Admin", 16000, "Pune"),
                new EmpObject(90,"Nyar", "IT", 11000, "Mumbai"),
                new EmpObject(20,"Sangika", "Sales", 10000, "Pune")
        );

        //Group employees by department and count
        Map<String, Long> groupByEmployeeAndCount = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.counting()
                ));

        //Sum Salary by department
        Map<String, Double> sumSalaryByDepartment = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.summingDouble(EmpObject::getSalary)
                ));

        //Find highest paid employee in each department
        Map<String, Optional<EmpObject>> highestPaidEmployee = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.maxBy(Comparator.comparing(EmpObject::getSalary))
                        ));

        //Find average salary per department
        Map<String, Double> averageSalaryByDepartment = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.averagingDouble(EmpObject::getSalary)
                ));

        //Find Department with highest total salary
        Map.Entry<String, Double> departmentHighestSalary = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.summingDouble(EmpObject::getSalary)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

      //  System.out.println(departmentHighestSalary.getKey() + "->" + departmentHighestSalary.getValue());

        //Find Department with highest total salary using sorted method
        Map.Entry<String, Double> departmentHighestSalary2 = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.summingDouble(EmpObject::getSalary)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .get();

       // System.out.println(departmentHighestSalary2.getKey() + "->" + departmentHighestSalary2.getValue());

        //Find top N highest paid employees, example N = 2
        List<EmpObject> topNHighestSalaryEmployee = empList.stream()
                .sorted(Comparator.comparing(EmpObject::getSalary).reversed())
                .limit(2)
                .toList();

       // System.out.println(topNHighestSalaryEmployee);

        //Convert list to map
        Map<Integer, EmpObject> listToMap = empList.stream()
                .collect(Collectors.toMap(
                        EmpObject::getId,
                        Function.identity(),
                        (id1, id2) -> id1
                ));
        listToMap.forEach((k, v) -> {
            System.out.println(k + " " + v.getName());
        });

        //Duplicate handling
        /*.toMap(Employee::getId,
                Function.identity(),
                (e1, e2) -> e1)*/ //keeps first element if ids are duplicate

        //Find duplicate elements
        Set<Integer> seen = new HashSet<>();
        List<EmpObject> duplicates = empList.stream()
                .filter(n -> !seen.add(n.getId()))
                .toList();
        duplicates.forEach(d -> System.out.println(d.getId()));

        //Find second highest salary
        empList.stream()
                .sorted(Comparator.comparingDouble(EmpObject::getSalary).reversed())
                .skip(1)
                .limit(1)
                .findFirst()
                .ifPresent(emp -> System.out.println(emp.getId() + " "
                + emp.getName() + " "+ emp.getSalary() + " " + emp.getDepartment()));

        empList.stream()
                .map(EmpObject::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);

        //Multi level grouping
        //group by department and then group by city
        Map<String, Map<String, List<EmpObject>>> groupByDepartmentAndCity = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.groupingBy(EmpObject::getCity)
                ));

        groupByDepartmentAndCity.forEach((k, v) -> {
            System.out.println("Department: "+k);
            v.forEach((c, s) -> {
                System.out.println("    City: "+c);
                s.forEach(l -> System.out.println("     "+l.getName() + " "+l.getSalary()));
            });
        });

        //Group Employees by Department and Find Highest Salary
        Map<String, Optional<EmpObject>> departmentWithSalary = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmpObject::getSalary))
                ));

        departmentWithSalary.forEach((k, v) -> {
            System.out.println(k);
            v.ifPresent(md -> System.out.println(md.getSalary()));
        });

        System.out.println("-----------------");
        //Find Department with highest average salary
        empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.averagingDouble(EmpObject::getSalary)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //Group by department and city
        Map<String, Map<String, List<EmpObject>>> dAndCity = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.groupingBy(EmpObject::getCity)
                ));

        //Find duplicate elements in list
        Set<Integer> alreadySeen = new HashSet<>();
        List<EmpObject> duplicate = empList.stream()
                .filter(f -> !alreadySeen.add(f.getId()))
                .toList();

        System.out.println("-----------------");
        duplicate.forEach(e -> System.out.println(e.getId()));
        System.out.println("-----------------");
        /*empList.stream()
                .filter(i -> Collections.frequency(empList, i.getId()) > 1)
                .toList()
                .forEach(e -> System.out.println(e.getName()));*/

        //Convert list to map (Handle duplicate Ids)
        Map<Integer, EmpObject> cLTM = empList.stream()
                .collect(Collectors.toMap(
                        EmpObject::getId,
                        Function.identity(),
                        (i1, i2) -> i1
                ));

        //Find second highest salary
        empList.stream()
                .sorted(Comparator.comparingDouble(EmpObject::getSalary))
                .skip(1)
                .limit(1)
                .forEach(e -> System.out.println(e.getSalary()));

        //Find second highest salary different way
        empList.stream()
                .map(EmpObject::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

        //Partition employee by salary > 12000
        Map<Boolean, List<EmpObject>> partitionByEmployeeSalary = empList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 12000));

        //Find Employees with duplicate name
        /*Set<String> uniqueNames = new HashSet<>();
        empList.stream()
                .filter(e -> !uniqueNames.add(e.getName()))
                .forEach(ename -> System.out.println(ename.getId()));*/

        empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getName,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(emp -> System.out.println(emp));

        //Sort Map by value
        Map<String, Long> sortByMap = empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getName,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new
                ));

        //Remove duplicate objects based on property like id
        Map<Integer, EmpObject> uniqueEmpObjects = empList.stream()
                .collect(Collectors.toMap(
                        EmpObject::getId,
                        Function.identity(),
                        (i1, i2) -> i1
                ));

        //Group Employees by Department and Get Top 2 Salaries
        empList.stream()
                .collect(Collectors.groupingBy(
                        EmpObject::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                ls -> ls.stream()
                                        .sorted(Comparator.comparingDouble(EmpObject::getSalary).reversed())
                                        .limit(2)
                                        .toList()
                        )
                )).forEach((k, v) -> {
                    System.out.println("Department: "+k);
                    v.forEach(s -> System.out.print(s.getSalary() + " "));
                    System.out.println();
                });
    }
}
