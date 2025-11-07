package programs.streamapi.usingcorejava;

import java.util.Arrays;
import java.util.List;

public class EmployeeStakeMain {
    public static void main(String[] args) {
        EmployeeStake employeeStake = new EmployeeStake("shyam", 3000, 3);
        EmployeeStake employeeStake1 = new EmployeeStake("james", 2000, 4);
        EmployeeStake employeeStake2 = new EmployeeStake("sanjay", 1000, 3);
        EmployeeStake employeeStake3 = new EmployeeStake("ajay", 7000, 2);
        EmployeeStake employeeStake4 = new EmployeeStake("billo", 9000, 1);

        List<EmployeeStake> employeeStakeList = Arrays.asList(employeeStake, employeeStake1,
                employeeStake2, employeeStake3, employeeStake4);

        System.out.println("Name Salary Rating");
        for(EmployeeStake emp : employeeStakeList) {
            if(emp.getRating() >= 3) {
                emp.setSalary(emp.getSalary() + 10000);
            } else if(emp.getRating() <= 2) {
                emp.setSalary(emp.getSalary() + 5000);
            }

            System.out.println(emp.getName() + " "+ emp.getSalary() + " "+ emp.getRating());
        }


    }
}

//An Employee List contains few fields including rating and salary, based on rating if it is 3 or more then
// increase the salary by 10000 or if it is less than or equal to 2 then increase to 5000, write the program
// using streams.
