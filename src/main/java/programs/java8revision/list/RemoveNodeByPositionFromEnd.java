package programs.java8revision.list;

public class RemoveNodeByPositionFromEnd {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);
        head.next.next.next.next.next = new LinkedListNode(60);

        printListData(head);

        LinkedListNode nodeAfterRemoval = removeNodeFromPosition(3, head);
        System.out.println();
        printListData(nodeAfterRemoval);
    }

    private static LinkedListNode removeNodeFromPosition(int position, LinkedListNode head) {
        LinkedListNode node = head;
        int len = 0;
        int positionCount = 1;

        while(node != null) {
            len++;
            node = node.next;
        }

        int toDelete = len - position;

        node = head;
        while(node != null) {
            if(positionCount == toDelete) {
                break;
            }
            positionCount++;
            node = node.next;
        }

        node.next = node.next.next;


        return head;
    }

    private static void printListData(LinkedListNode head) {
        LinkedListNode node = head;

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
