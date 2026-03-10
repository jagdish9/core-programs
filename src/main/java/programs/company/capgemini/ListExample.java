package programs.company.capgemini;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>(List.of("A", "B", "C"));

        for(int i = 0; i < ls.size(); i++) {
            System.out.println("Index: "+ i + " Value: "+ ls.get(i));
        }
    }
}
