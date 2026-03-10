package programs.java8revision.list;

public class TraverseCircularLinkedList {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);
        head.next.next.next.next.next = head;

        printListData(head);
    }

    private static void printListData(LinkedListNode head) {
        LinkedListNode node = head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
            if(node == head) {
                break;
            }
        }
    }
}
