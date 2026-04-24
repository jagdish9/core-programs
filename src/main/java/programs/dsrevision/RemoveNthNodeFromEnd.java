package programs.dsrevision;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(10);
        head.next = new LinkedNode(20);
        head.next.next = new LinkedNode(30);
        head.next.next.next = new LinkedNode(40);
        head.next.next.next.next = new LinkedNode(50);
        head.next.next.next.next.next = new LinkedNode(60);

        int nodeToBeDeleted = 2;

        //LinkedNode nodeAfterDeletion = getNodeAfterDeletion(nodeToBeDeleted, head);
        //printLinkedList(nodeAfterDeletion);

        LinkedNode middleNode = findMiddleNode(head);
        System.out.println(middleNode.data);
    }

    private static LinkedNode findMiddleNode(LinkedNode head) {
        LinkedNode tmp = head;
        int len = 0;

        while(tmp != null) {
            tmp = tmp.next;
            len++;
        }

        int middleNode = len / 2;

        tmp = head;

        int traverseCount = 1;

        while(tmp != null) {
            if(middleNode == traverseCount)
                break;
            tmp = tmp.next;
            traverseCount++;
        }
        if(tmp != null && tmp.next != null)
            tmp.next = null;

        return tmp;
    }

    private static LinkedNode getNodeAfterDeletion(int nodeToBeDeleted, LinkedNode head) {
        LinkedNode tmp = head;

        int length = 0;

        while(tmp != null) {
            tmp = tmp.next;
            length++;
        }

        int countFromBegin = length - nodeToBeDeleted;

        tmp = head;
        int traverseCount = 1;

        while(tmp != null) {
            if(countFromBegin == traverseCount)
                break;
            tmp = tmp.next;
            traverseCount++;
        }

        tmp.next = tmp.next.next;

        return head;
    }

    private static void printLinkedList(LinkedNode head) {
        LinkedNode tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
