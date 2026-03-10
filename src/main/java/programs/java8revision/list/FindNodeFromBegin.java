package programs.java8revision.list;

public class FindNodeFromBegin {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);

        int position = 3;

        int data = getPositionData(position, head);
        System.out.println(data);
    }

    private static int getPositionData(int position, LinkedListNode head) {
        LinkedListNode node = head;
        int count = 1;

        while(node != null) {
            if(count == position) {
                return node.data;
            }
            count++;
            node = node.next;
        }

        return -1;
    }
}
