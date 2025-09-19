package programs.linkedlist;

public class DeleteNthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);

        int n = 3;

        printList(head);
        System.out.println();

        SingleLinkedList newHead = removeNthNode(head, n);

        printList(newHead);
    }

    private static SingleLinkedList removeNthNode(SingleLinkedList head, int n) {
        SingleLinkedList node = head;
        int lenOfList = 0;

        while(node != null) {
            node = node.next;
            lenOfList++;
        }

        int removalIndex = lenOfList - n;
        int countNode = 1;

        node = head;
        while(node != null) {
            if(countNode == removalIndex) {
                break;
            }
            countNode++;
            node = node.next;
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
