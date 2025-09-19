package programs.linkedlist;

public class DeleteLastOccurrenceOfAnyItem {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);
        head.next.next.next.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next.next.next.next = new SingleLinkedList(70);

        int key = 40;

        printList(head);
        System.out.println();

        SingleLinkedList newHead = deleteLastOccurrenceNode(head, key);
        printList(newHead);
    }

    private static SingleLinkedList deleteLastOccurrenceNode(SingleLinkedList head, int key) {
        SingleLinkedList currentNode = head;
        SingleLinkedList previousNode = null;
        SingleLinkedList previousNode2 = null;
        SingleLinkedList keyNode = null;
        while(currentNode != null) {
            if(key == currentNode.data) {
                previousNode = previousNode2;
                keyNode = currentNode;
            }
            previousNode2 = currentNode;
            currentNode = currentNode.next;
        }
        if(previousNode != null && keyNode != null) {
            previousNode.next = keyNode.next;
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
