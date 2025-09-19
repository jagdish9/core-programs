package programs.linkedlist;

public class DeleteMiddleOfLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);
        head.next.next.next.next.next.next = new SingleLinkedList(80);
        head.next.next.next.next.next.next.next = new SingleLinkedList(70);
        head.next.next.next.next.next.next.next.next = new SingleLinkedList(90);

        printList(head);
        System.out.println();

        SingleLinkedList newHead = deleteMiddleNodeOfList(head);
        printList(newHead);
    }

    private static SingleLinkedList deleteMiddleNodeOfList(SingleLinkedList head) {
        if(head.next == null)
            return null;

        SingleLinkedList node = head;

        int lenOfList = 0;

        while(node != null) {
            node = node.next;
            lenOfList++;
        }

        int middle = lenOfList / 2;
        if(lenOfList % 2 == 0)
            middle += 1;

        int nodeCount = 1;

        node = head;
        while(node != null) {
            if(nodeCount == middle - 1) {
                break;
            }
            node = node.next;
            nodeCount++;
        }

        node.next = node.next.next;

        return head;
    }

    private static void printList(SingleLinkedList head) {
        SingleLinkedList node = head;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
