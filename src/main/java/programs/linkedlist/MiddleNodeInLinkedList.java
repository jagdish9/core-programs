package programs.linkedlist;

public class MiddleNodeInLinkedList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(4);
        head.next = new SingleLinkedList(6);
        head.next.next = new SingleLinkedList(8);
        head.next.next.next = new SingleLinkedList(10);
        head.next.next.next.next = new SingleLinkedList(12);
        head.next.next.next.next.next = new SingleLinkedList(14);
        head.next.next.next.next.next.next = new SingleLinkedList(16);
        //head.next.next.next.next.next.next.next = new SingleLinkedList(18);

        int data = getMiddleNodeData(head);
        System.out.println(data);
    }

    private static int getMiddleNodeData(SingleLinkedList head) {
        SingleLinkedList node = head;
        int middleData = 0;
        int len = 0;
        while(node != null) {
            node = node.next;
            len++;
        }

        int middle = len / 2;
        if(len % 2 == 0)
            middle += 1;
        node = head;
        len = 1;
        while(node != null) {
            if(middle == len) {
                middleData = node.data;
                break;
            }
            node = node.next;
            len++;
        }

        return middleData;
    }
}
