package programs.linkedlist;

public class DeleteNNodesAfterMNodes {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);
        head.next.next.next.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next.next.next.next = new SingleLinkedList(70);

        int n = 1;
        int m = 2;

        printList(head);
        System.out.println();

        SingleLinkedList newHead = deleteNNodesAfterM(head, n, m);
        printList(newHead);
    }

    private static SingleLinkedList deleteNNodesAfterM(SingleLinkedList head, int n, int m) {
        SingleLinkedList currNode = head;
        SingleLinkedList t = null;
        int count = 0;

        while(currNode != null) {
            for(count = 1; count < m; count++)
                currNode = currNode.next;

            if(currNode == null)
                return head;

            t = currNode.next;

            if(t != null && t.next != null) for(count = 1; count <= n; count++) {
                SingleLinkedList temp = t;
                t = t.next;

                temp = null;
            }

            currNode.next = t;

            currNode = t;
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
