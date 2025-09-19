package programs.linkedlist;

public class TraverseCircularLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);
        head.next.next.next.next.next.next = head;

        printCircularLinkedList(head);
    }

    private static void printCircularLinkedList(SingleLinkedList head) {
        SingleLinkedList currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            if(currNode == head) {
                break;
            }
        }
    }
}
