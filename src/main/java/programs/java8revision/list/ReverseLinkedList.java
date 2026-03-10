package programs.java8revision.list;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);

        printLinkedListData(head);

        LinkedListNode reverseList = reverseList(head);
        System.out.println();
        printLinkedListData(reverseList);
    }

    private static LinkedListNode reverseList(LinkedListNode head) {
        LinkedListNode temp = head;
        LinkedListNode prev = null;

        while(temp != null) {
            LinkedListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    private static void printLinkedListData(LinkedListNode head) {
        LinkedListNode node = head;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
