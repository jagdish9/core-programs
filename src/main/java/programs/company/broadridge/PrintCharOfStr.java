package programs.company.broadridge;

public class PrintCharOfStr {
    public static void main(String[] args) {
        String email = "abc@gmail.com";

        boolean found = email.chars().anyMatch(c -> c == '@');

        System.out.println(found);
    }
}
