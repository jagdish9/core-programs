package programs.dsrevision;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInLinkedList {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(10);
        head.next = new LinkedNode(20);
        head.next.next = new LinkedNode(30);
        head.next.next.next = new LinkedNode(40);
        head.next.next.next.next = head.next.next;

       // printLinkedList(head);

        boolean cycleFound = detectCycleInLinkedList(head);

        System.out.println(cycleFound);
    }

    private static boolean detectCycleInLinkedList(LinkedNode head) {
        Set<LinkedNode> set = new HashSet<>();
        LinkedNode tmp = head;

        while(tmp != null) {
            if(set.contains(tmp))
                return true;

            set.add(tmp);
            tmp = tmp.next;
        }

        return false;
    }

    private static void printLinkedList(LinkedNode head) {
        LinkedNode tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
