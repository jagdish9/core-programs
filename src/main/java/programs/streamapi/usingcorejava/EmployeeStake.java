package programs.streamapi.usingcorejava;

public class EmployeeStake {
    private String name;
    private int salary;
    private int rating;

    public EmployeeStake(String name, int salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "EmployeeStake{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                '}';
    }
}
