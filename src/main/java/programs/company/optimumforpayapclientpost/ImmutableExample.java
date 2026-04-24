package programs.company.optimumforpayapclientpost;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableExample {
    private final String name;
    private final String department;
    private final int age;
    private final List<String> hobbies;

    public ImmutableExample(String name, String department, int age, List<String> hobbies) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies); // defensive copy
    }

    public List<String> getHobbies2() {
        return hobbies; // someone can modify it because we are retuning original object reference
    }
}
