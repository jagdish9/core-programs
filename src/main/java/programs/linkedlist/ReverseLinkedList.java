package programs.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SingleLinkedList node = new SingleLinkedList(1);
        node.next = new SingleLinkedList(5);
        node.next.next = new SingleLinkedList(3);
        node.next.next.next = new SingleLinkedList(7);
        node.next.next.next.next = new SingleLinkedList(9);

        printLinkedList(node);
        System.out.println();

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        SingleLinkedList reverseList = reverseLinkedList.getReverseLinkedList(node);
        printLinkedList(reverseList);
    }

    private static void printLinkedList(SingleLinkedList head) {
        SingleLinkedList node = head;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private SingleLinkedList getReverseLinkedList(SingleLinkedList head) {
        SingleLinkedList temp = head;
        SingleLinkedList prev = null;

        while (temp != null) {
            SingleLinkedList front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}
