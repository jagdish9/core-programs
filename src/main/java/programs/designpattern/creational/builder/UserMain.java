package programs.designpattern.creational.builder;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Sanju")
                .age(25)
                .build();
    }
}

//Clean & flexible object creation
