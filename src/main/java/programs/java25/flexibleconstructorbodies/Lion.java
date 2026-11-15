package programs.java25.flexibleconstructorbodies;

public class Lion extends Animal {
    public void eat() {
        System.out.println("Lion is eating");
    }

    public Lion(String name) {
        super(name); //had to be first before Java 25
        System.out.println("Lion constructor");
    }

    public Lion(String name, int age) {
        name = name.trim(); // allowed in Java 25
        super(name, age);
    }

    public void validate(String name, int age) {
        System.out.println(name + " " + age);
    }
}
