package programs.company.ustglobal;

public class UsTLinkedList {
    UstNode head;
    public static void main(String[] args) {
        UsTLinkedList ul = new UsTLinkedList();
        ul.addNodeAtEnd(10);
        ul.addNodeAtEnd(20);
        ul.addNodeAtEnd(30);
        ul.addNodeAtBegin(40);
        ul.addNodeAtBegin(50);
        ul.addNodeAtEnd(60);

        ul.printUstList(ul.head);
        System.out.println();
        ul.addNodeAtIndex(30, 4);

        ul.printUstList(ul.head);
    }

    private void addNodeAtIndex(int data, int index) {
        int nodeCount = 1;
        UstNode tmp = head;
        while(tmp != null && nodeCount < index) {
            tmp = tmp.next;
            nodeCount++;
        }
        UstNode newNode  = new UstNode(data);
        if(tmp!= null && tmp.next != null) {
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    private void printUstList(UstNode head) {
        UstNode tmp = head;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    private void addNodeAtBegin(int data) {
        UstNode tmp = head;
        UstNode newNode = new UstNode(data);
        newNode.next = tmp;
        head = newNode;
    }

    private void addNodeAtEnd(int data) {
        if(head == null) {
            head = new UstNode(data);
            return;
        }
        UstNode tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new UstNode(data);
    }

}

class UstNode {
    int data;
    UstNode next;

    public UstNode(int data) {
        this.data = data;
        this.next = null;
    }
}
