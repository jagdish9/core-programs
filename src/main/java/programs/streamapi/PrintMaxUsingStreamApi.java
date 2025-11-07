package programs.streamapi;

import java.util.Arrays;
import java.util.OptionalInt;

public class PrintMaxUsingStreamApi {
    public static void main(String[] args) {
        int[] list = {10, 15, 8, 49, 25, 98, 98, 32, 15};

        OptionalInt maxOptional = Arrays.stream(list).max();
        OptionalInt minOptional = Arrays.stream(list).min();
        System.out.println(maxOptional.getAsInt());
        System.out.println(minOptional.getAsInt());
    }
}
