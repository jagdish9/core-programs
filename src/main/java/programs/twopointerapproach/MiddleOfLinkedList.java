package programs.twopointerapproach;

public class MiddleOfLinkedList {

    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(15);
        head.next.next.next.next.next.next = new ListNode(25);

        int data = getMiddleNodeData(head);
        System.out.println(data);
    }

    private static int getMiddleNodeData(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
