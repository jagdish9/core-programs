package programs.linkedlist;

public class RotateLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);

        int k = 3;

        printList(head);
        System.out.println();

        SingleLinkedList newHeadNode = rotateList(head, k);
        printList(newHeadNode);
    }

    private static SingleLinkedList rotateList(SingleLinkedList head, int k) {
        if(k == 0 || head == null)
            return head;

        for(int i = 0; i < k; i++) {
            SingleLinkedList node = head;
            while(node.next != null) {
                node = node.next;
            }

            node.next = head;
            node = node.next;
            head = head.next;
            node.next = null;
        }
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
