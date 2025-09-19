package programs.map.student;

import java.util.*;

public class StudentMain {
    private final Map<Integer, Student> studentMap = new HashMap<>();

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Integer key, Student student) {
        this.studentMap.put(key, student);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Hansika", "Sonwani", 35);
        Student student2 = new Student("Kajal", "Gupta", 45);
        Student student3 = new Student("Rasa", "Tindi", 23);
        Student student4 = new Student("Arjun", "Kar", 20);
        Student student5 = new Student("Vabun", "Dhuri", 18);
        Student student6 = new Student("Vanang", "Ascharya", 54);

        StudentMain studentMain = new StudentMain();
        studentMain.setStudentMap(20, student1);
        studentMain.setStudentMap(100, student2);
        studentMain.setStudentMap(50, student3);
        studentMain.setStudentMap(65, student4);
        studentMain.setStudentMap(88, student5);
        studentMain.setStudentMap(37, student6);

        Map<Integer, Student> studentInfo = studentMain.getStudentMap();
        System.out.println("Before Sorting");
        for(Map.Entry<Integer, Student> mEntry : studentInfo.entrySet()) {
            System.out.println(mEntry.getKey() + " -> "+ mEntry.getValue().getFirstName()
                    + " | "+ mEntry.getValue().getLastName() + " | " + mEntry.getValue().getAge());
        }

        List<Map.Entry<Integer, Student>> studentList = new ArrayList<>(studentInfo.entrySet());
        Collections.sort(studentList, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                /*if(o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName()) < 0)
                    return o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName());
                else*/
                    return o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName());
            }
        });

        System.out.println();
        System.out.println("After Sorting");
        for(Map.Entry<Integer, Student> mEntry : studentList) {
            System.out.println(mEntry.getKey() + " -> "+ mEntry.getValue().getFirstName()
                    + " | "+ mEntry.getValue().getLastName() + " | " + mEntry.getValue().getAge());
        }


    }
}
