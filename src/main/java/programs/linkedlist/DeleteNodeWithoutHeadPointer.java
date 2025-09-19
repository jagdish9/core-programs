package programs.linkedlist;

public class DeleteNodeWithoutHeadPointer {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);

        printList(head);
        System.out.println();
        deleteNodeWithoutHeadPointer(head.next.next.next);
        printList(head);
    }

    private static void deleteNodeWithoutHeadPointer(SingleLinkedList node) {
        if(node == null)
            return;

        node.data = node.next.data;
        node.next = node.next.next;
    }

    private static void printList(SingleLinkedList head) {
        SingleLinkedList node = head;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
