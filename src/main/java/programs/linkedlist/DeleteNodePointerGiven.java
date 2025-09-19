package programs.linkedlist;

public class DeleteNodePointerGiven {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        System.out.println("Before deleting");

        DeleteNodePointerGiven deleteNodePointerGiven =
                new DeleteNodePointerGiven();
        deleteNodePointerGiven.printList(head);

        System.out.println();
        System.out.println("After deleting");
        deleteNodePointerGiven.deleteNode(head.next.next);
        deleteNodePointerGiven.printList(head);
    }

    private void deleteNode(SingleLinkedList node) {
        if(node != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    public void printList(SingleLinkedList node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
