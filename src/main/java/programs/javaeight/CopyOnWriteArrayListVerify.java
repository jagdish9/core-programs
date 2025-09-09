package programs.javaeight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListVerify {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.forEach(System.out::println);

        for(Integer ls : list) {
            System.out.println(ls);
            list.add(40); // it didn't throw ConcurrentModificationException
        }

        System.out.println("----------------");

        list.forEach(System.out::println);
    }
}
