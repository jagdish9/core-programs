package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfPersonToMap {
    public static void main(String[] args) {
        List<Person01> persons = Arrays.asList(
                new Person01("Jane", "Akaltara", 12000),
                new Person01("Kalyani", "Pamgarh", 13000),
                new Person01("Swagat", "Akaltara", 11000),
                new Person01("Anshul", "Pamgarh", 10000),
                new Person01("Bhell", "Baloda", 14000),
                new Person01("Arambhik", "Mungeli", 15000)
        );

        Map<String, Long> output = persons.stream()
                .collect(Collectors.groupingBy(Person01::getCity, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println("City: "+ k);
            System.out.println(v);
            System.out.println();
        });
    }
}

//Convert List<Person> → Map<City, Count>

class Person01 {
    private String name;
    private String city;
    private double salary;

    public Person01(String name, String city, double salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }
}