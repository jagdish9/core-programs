package programs.java8revision.basic;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, Java 8!";

        StringBuilder sb = new StringBuilder(originalString).reverse();

        System.out.println(sb);
    }
}
