package programs.streamapi.usingstreamapi;

import programs.streamapi.usingcorejava.EmployeeStake;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStakeMain2 {

    public static void main(String[] args) {
        EmployeeStake employeeStake = new EmployeeStake("shyam", 3000, 3);
        EmployeeStake employeeStake1 = new EmployeeStake("james", 2000, 4);
        EmployeeStake employeeStake2 = new EmployeeStake("sanjay", 1000, 3);
        EmployeeStake employeeStake3 = new EmployeeStake("ajay", 7000, 2);
        EmployeeStake employeeStake4 = new EmployeeStake("billo", 9000, 1);

        List<EmployeeStake> employeeStakeList = Arrays.asList(employeeStake, employeeStake1,
                employeeStake2, employeeStake3, employeeStake4);

        System.out.println("Rating greater than 2");
        List<EmployeeStake> employeeStakes = employeeStakeList.stream()
                .filter(w -> w.getRating() >= 3)
                .peek(e -> e.setSalary(e.getSalary() + 10000))
                .toList();

        employeeStakes.forEach(System.out::println);

        System.out.println("Rating less than or equal to 2");

        List<EmployeeStake> employeeStakes2 = employeeStakeList.stream()
                .filter(w -> w.getRating() <= 2)
                .peek(e -> e.setSalary(e.getSalary() + 5000))
                .toList();

        employeeStakes2.forEach(System.out::println);

        System.out.println("With one stream");
        List<EmployeeStake> employeeStakes3 = employeeStakeList.stream()
                .map(e -> {
                    if(e.getRating() >= 3) {
                        return new EmployeeStake(e.getName(), e.getSalary()+10000, e.getRating());
                    } else if(e.getRating() <= 2) {
                        return new EmployeeStake(e.getName(), e.getSalary()+5000, e.getRating());
                    }
                    return e;
                })
                .toList();

        employeeStakes3.forEach(System.out::println);
    }
}
