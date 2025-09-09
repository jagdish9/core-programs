package programs.javaeight;

import java.util.ArrayList;
import java.util.List;

public class ListVerify {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.forEach(System.out::println);

        for(Integer ls : list) {
            System.out.println(ls);
            //list.add(40); //  throws ConcurrentModificationException, now will test CopyOnWriteArrayList
        }
    }
}
