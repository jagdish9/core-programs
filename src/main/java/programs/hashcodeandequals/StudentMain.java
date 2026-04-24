package programs.hashcodeandequals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        //Student s3 = new Student(1, "A");
        Student s3 = new Student(1, "C");

        Map<Student, Integer> map = new HashMap<>();
        map.put(s1, 100);
        map.put(s2, 200);
        map.put(s3, 300);

        System.out.println(map);
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id, name);
        return id * 100;
    }
}
