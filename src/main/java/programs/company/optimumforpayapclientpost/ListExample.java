package programs.company.optimumforpayapclientpost;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("A");

        List<String> listB = new ArrayList<>(listA);

        listA.clear();
        listB.add("B");
        listA.add("C");

        System.out.print(listA);
        System.out.print(listB);
    }
}
