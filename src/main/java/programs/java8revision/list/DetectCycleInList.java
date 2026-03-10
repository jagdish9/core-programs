package programs.java8revision.list;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInList {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);
        head.next.next.next.next.next = head.next.next.next;

        boolean detect = detectCycleInList(head);
        System.out.println(detect);

        boolean detect2 = detectCycleInListByFloydAlgo(head);
        System.out.println(detect2);
    }

    private static boolean detectCycleInListByFloydAlgo(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

    private static boolean detectCycleInList(LinkedListNode head) {
        LinkedListNode tmp = head;
        Set<LinkedListNode> set = new HashSet<>();

        while(tmp != null) {
            if(set.contains(tmp))
                return true;

            set.add(tmp);
            tmp = tmp.next;
        }

        return false;
    }
}
