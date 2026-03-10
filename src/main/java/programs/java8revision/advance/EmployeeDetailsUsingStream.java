package programs.java8revision.advance;

import java.util.Arrays;
import java.util.List;

public class EmployeeDetailsUsingStream {

    public static void main(String[] args) {
        List<EmployeeRating> employeeRatingList = Arrays.asList(
                new EmployeeRating("Majnu", 13000.0, 3),
                new EmployeeRating("Ajay", 20000.0, 1),
                new EmployeeRating("Sonu", 18000.0, 2),
                new EmployeeRating("Raja", 10000.0, 4),
                new EmployeeRating("Dhanesh", 18000.0, 2),
                new EmployeeRating("Jalesh", 17000.0, 2)
        );

        //rating if it is 3 or more then increase the salary by 10000 or
        // if it is less than or equal to 2 then increase to 5000

        //this can be used for single condition
        /*List<EmployeeRating> output = employeeRatingList.stream()
                .filter(emp -> emp.getRating() >= 3)
                .peek(emp -> {
                    emp.setSalary(emp.getSalary() + 10000);
                })
                .toList();*/

        //for multiple conditions
        List<EmployeeRating> output = employeeRatingList.stream()
                        .map(emp -> {
                            double increment = 0;

                            /*switch(emp.getRating()) {
                                case 3, 4: {
                                    increment = increment + 10000;
                                    break;
                                }
                                case 1, 2: {
                                    increment = increment + 5000;
                                    break;
                                }
                                default: increment = increment + 0;
                            }*/

                            if(emp.getRating() >= 3)
                                increment = increment + 10000;
                            else if(emp.getRating() <= 2)
                                increment = increment + 5000;

                            emp.setSalary(emp.getSalary() + increment);

                            return emp;
                        })
                .toList();

        output.forEach(emp -> {
            System.out.println(emp.getName() + " " + emp.getRating() + " " + emp.getSalary());
        });
    }
}

class EmployeeRating {
    private String name;
    private double salary;
    private int rating;

    public EmployeeRating(String name, double salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
/*
An Employee List contains few fields including rating and salary,
based on rating if it is 3 or more then increase the salary by 10000 or
 if it is less than or equal to 2 then increase to 5000, write the program using streams.
 */
