package programs.streamapi.empusingstreamapi;

import programs.streamapi.usingcorejava.EmployeeStake;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeStakeMain3 {
    public static void main(String[] args) {
        EmployeeStake employeeStake = new EmployeeStake("shyam", 3000, 3);
        EmployeeStake employeeStake1 = new EmployeeStake("james", 2000, 4);
        EmployeeStake employeeStake2 = new EmployeeStake("sanjay", 1000, 3);
        EmployeeStake employeeStake3 = new EmployeeStake("ajay", 7000, 2);
        EmployeeStake employeeStake4 = new EmployeeStake("billo", 9000, 1);

        List<EmployeeStake> employeeStakeList = Arrays.asList(employeeStake, employeeStake1,
                employeeStake2, employeeStake3, employeeStake4);

        employeeStakeList.stream()
                .sorted(new Comparator<EmployeeStake>() {
                    @Override
                    public int compare(EmployeeStake o1, EmployeeStake o2) {
                        if(o1.getName().equalsIgnoreCase(o2.getName()))
                            return o1.getName().compareTo(o2.getName());
                        else if(o1.getRating() > o2.getRating())
                            return 1;
                        else if(o1.getSalary() > o2.getSalary())
                            return 1;
                        else
                            return 0;
                    }
                })
                .forEach(System.out::println);
    }
}
