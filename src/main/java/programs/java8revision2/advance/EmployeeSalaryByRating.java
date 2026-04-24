package programs.java8revision2.advance;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryByRating {
    public static void main(String[] args) {
        List<EmpRating> empRatingList = Arrays.asList(
                new EmpRating("Vijay", 5000, 1),
                new EmpRating("Ajay", 7000, 3),
                new EmpRating("Sanjay", 4000, 4),
                new EmpRating("Digvijay", 6000, 2),
                new EmpRating("Jorovar", 8000, 3),
                new EmpRating("Raja", 5000, 2),
                new EmpRating("Sangeeta", 6000, 4)
        );

        empRatingList.stream()
                .map(empRating -> {
                    if(empRating.getRating() >= 3) {
                        empRating.setSalary(empRating.getSalary() + 10000);
                    } else if(empRating.getRating() <= 2) {
                        empRating.setSalary(empRating.getSalary() + 5000);
                    }
                    return empRating;
                })
                .forEach(emp -> {
                    System.out.println(emp.getName() + " " + emp.getSalary());
                });
    }
}

class EmpRating {
    private String name;
    private double salary;
    private int rating;

    public EmpRating(String name, double salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
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

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }
}
//rating if it is 3 or more than increase the salary by 10000 or
// if it is less than or equal to 2 then increase to 5000
