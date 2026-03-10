package programs.company.nablepre;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFunctions {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println(q.peek()); // return null
        //System.out.println(q.element()); // return NoSuchElementException
        System.out.println(q.poll()); // return null
        //System.out.println(q.remove()); // return NoSuchElementException
    }
}
