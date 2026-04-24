package programs.finalcheck;

import java.util.ArrayList;
import java.util.List;

public class FinalVerify {
    private static final String str = "ABC";
    private static final List<String> inputList = new ArrayList<>();

    private static final int a = 15;
    private static final Integer a2 = 45;

    public static void main(String[] args) {
        System.out.println(str);

        inputList.add("xyz");

        System.out.println(inputList);

        //a = 20; // not allowed even primitive
        //a2 = 50; // not allowed wrapper also
    }
}
