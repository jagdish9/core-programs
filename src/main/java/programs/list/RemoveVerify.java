package programs.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveVerify {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //list.remove(30); //Exception in thread "main" java.lang.IndexOutOfBoundsException
        list.remove(Integer.valueOf(30));

        System.out.println(list);
    }
}
