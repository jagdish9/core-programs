package programs.company.zopsmart;

public class ReplaceNodeAtIthIndex {
    ZopNode head;
    public static void main(String[] args) {
        ReplaceNodeAtIthIndex rn = new ReplaceNodeAtIthIndex();

        rn.head = new ZopNode(7);
        rn.head.next = new ZopNode(12);
        rn.head.next.next = new ZopNode(17);
        rn.head.next.next.next = new ZopNode(4);
        rn.head.next.next.next.next = new ZopNode(20);

        rn.printList(rn.head);

        System.out.println();

        rn.replaceNodeAtIthIndex(25, 3);

        rn.printList(rn.head);
    }

    public void printList(ZopNode head) {
        ZopNode tmp = head;

        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public void replaceNodeAtIthIndex(int data, int index) {
        ZopNode tmp = head;
        int nodeCount = 1;
        while(tmp != null && nodeCount < index) {
            nodeCount++;
            tmp = tmp.next;
        }
        ZopNode newNode = new ZopNode(data);
        newNode.next = tmp.next;
        tmp.next = newNode;
    }
}
