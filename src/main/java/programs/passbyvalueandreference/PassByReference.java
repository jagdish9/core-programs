package programs.passbyvalueandreference;

public class PassByReference {
    public static void main(String[] args) {
        User u = new User("John");

        change(u);

        System.out.println(u.name);

        change2(u);

        System.out.println(u.name);
    }

    private static void change(User u) {
        u.name = "Mike";
    }

    private static void change2(User u) {
        u = new User("David");
        System.out.println(u.name);
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

/*
“Java is strictly pass-by-value. For primitives, the value is copied, and for objects, the reference is copied,
which allows modification of the object but not reassignment of the original reference.”
 */