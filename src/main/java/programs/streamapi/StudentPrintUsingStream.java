package programs.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentPrintUsingStream {
    public static void main(String[] args) {
        List<StudentData> students = Arrays.asList(
                new StudentData("Prince", 16, "1234578", true, 40),
                new StudentData("Anuj", 18, "4567882",  false, 30),
                new StudentData("Anees", 20, "2468018", true, 60),
                new StudentData("Santosh", 22, "7823410", false, 28)
        );

        int PASS_THRESHOLD = 33;
        System.out.println("---Students data---");
        //Partition students into passing and failing
        Map<Boolean, List<StudentData>> studentsPassingFailing = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() >= PASS_THRESHOLD));

        studentsPassingFailing.forEach((s, sd) -> {
            System.out.println("Result: "+s);
            sd.forEach(d -> System.out.println(d.getName() + " "+d.getMarks()));
            System.out.println();
        });
    }
}

class StudentData {
    private String name;
    private int age;
    private String phoneNo;
    private boolean examStatus;
    private int marks;

    public StudentData(String name, int age, String phoneNo, boolean examStatus, int marks) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.examStatus = examStatus;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public boolean isExamStatus() {
        return examStatus;
    }
}
