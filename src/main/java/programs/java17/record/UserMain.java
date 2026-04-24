package programs.java17.record;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("Sapna", 30);

        System.out.println(user.name() + " " + user.age());
    }
}
