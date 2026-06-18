package programs.java21.sequencedcollections;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Arayaman");
        names.add("Zoro");
        names.add("Ankur");

        String first = names.getFirst();
        String last = names.getLast();

        System.out.println(first);
        System.out.println(last);
    }
}

/*
New capabilities:

getFirst()
getLast()
addFirst()
addLast()
reversed()

 */