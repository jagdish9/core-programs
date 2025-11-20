package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupPeopleByAge {
    public static void main(String[] args) {
        List<People01> people01List = Arrays.asList(
                new People01(10L, "Anju", 25),
                new People01(20L, "Samay", 30),
                new People01(30L, "Chinmaye", 25),
                new People01(40L, "Sadanand", 30),
                new People01(50L, "Swati", 25),
                new People01(60L, "Jorawar", 25)
        );

        Map<Integer, List<People01>> output =  people01List.stream()
                .collect(Collectors.groupingBy(People01::getAge));

        output.forEach((k, v) -> {
            System.out.println("Age: "+ k);
            v.forEach(e -> System.out.println(e.getName()));
            System.out.println();
        });
    }
}

class People01 {
    private Long id;
    private String name;
    private int age;

    public People01(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
