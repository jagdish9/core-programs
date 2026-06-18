package programs.java21.recordpatterns;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Ankkit", 30);
        Person person1 = new Person("Meghaa", 28);

        //Before java21
        if(person instanceof Person p) {
            String name = p.name();
            System.out.println(name);
        }

        //java21
        if(person instanceof Person(String name, int pAge)) {
            System.out.println(name + " " + pAge);
        }
    }
}

/*
Allows deconstructing records directly in pattern matching.

This reduces boilerplate and improves readability.
 */