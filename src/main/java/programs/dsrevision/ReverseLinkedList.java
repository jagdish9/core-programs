package programs.dsrevision;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(10);
        head.next = new LinkedNode(20);
        head.next.next = new LinkedNode(30);
        head.next.next.next = new LinkedNode(40);

        printLinkedList(head);

        LinkedNode reverseNode = reverseLinkedList(head);

        System.out.println("Reverse Linked List");
        printLinkedList(reverseNode);
    }

    private static void printLinkedList(LinkedNode head) {
        LinkedNode tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    private static LinkedNode reverseLinkedList(LinkedNode head) {
        LinkedNode curr = head;
        LinkedNode prev = null;
        LinkedNode next = null;

        // Traverse all the nodes of Linked List
        while (curr != null) {
            // Store next
            next = curr.next;
            // Reverse current node's next pointer
            curr.next = prev;

            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

