package programs.linkedlist;

public class DetectCycleInLinkedListAndCountNode {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next = head.next.next;

        boolean detect = detectCycleInLinkedList(head);
        System.out.println(detect);

        int count = countNodeInCycle(head);
        System.out.println(count);
    }

    private static int countNodeInCycle(LinkedListNode head) {
        LinkedListNode tmp = head;
        LinkedListNode slow = tmp;
        LinkedListNode fast = tmp.next;

        while(slow != null && fast != null && fast.next != null) {
            if(slow == fast) {
                return countCycleLength(slow);
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        //no cycle
        return 0;
    }

    private static int countCycleLength(LinkedListNode node) {
        int count = 1;
        LinkedListNode current = node.next;

        while (current != node) {
            count++;
            current = current.next;
        }

        return count;
    }

    private static boolean detectCycleInLinkedList(LinkedListNode head) {
        if(head == null) {
            return false;
        }
        LinkedListNode tmp = head;
        LinkedListNode slow = null;
        LinkedListNode fast = null;
        if(tmp != null) {
            slow = tmp;
        }
        if(tmp != null && tmp.next != null) {
            fast = tmp.next;
        }

        while(slow != null && fast != null && fast.next != null) {
            if(slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}

class LinkedListNode {
    int data;
    LinkedListNode next;
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}