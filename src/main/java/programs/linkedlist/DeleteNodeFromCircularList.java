package programs.linkedlist;

public class DeleteNodeFromCircularList {
    public static void main(String[] args) {
        SingleLinkedList head = new SingleLinkedList(10);
        head.next = new SingleLinkedList(20);
        head.next.next = new SingleLinkedList(30);
        head.next.next.next = new SingleLinkedList(40);
        head.next.next.next.next = new SingleLinkedList(50);
        head.next.next.next.next.next = new SingleLinkedList(60);
        head.next.next.next.next.next.next = head;

        printCircularLinkedList(head);

        System.out.println();

      /*  SingleLinkedList newHead = deleteAtBeginning(head);
        if(newHead != null) {
            printCircularLinkedList(newHead);
        }*/

        System.out.println();

       /* SingleLinkedList newHead2 = deleteAtEnd(head);
        if(newHead2 != null) {
            printCircularLinkedList(newHead2);
        }*/

        int position = 3;
        SingleLinkedList newHead3 = deleteAtPosition(head, position);
        if(newHead3 != null) {
            printCircularLinkedList(newHead3);
        }
    }

    private static SingleLinkedList deleteAtPosition(SingleLinkedList head, int position) {
        if(head == null)
            return null;

        SingleLinkedList currNode = head;
        SingleLinkedList previousNode = null;
        int count = 0;

        while (currNode != null) {
            count++;
            if(count == position) {
                previousNode.next = currNode.next;
            }
            previousNode = currNode;
            currNode = currNode.next;
            if(currNode == head) {
                break;
            }
        }

        return head;
    }

    private static SingleLinkedList deleteAtEnd(SingleLinkedList head) {
        if(head == null)
            return null;

        SingleLinkedList slow = head;
        SingleLinkedList fast = head;
        SingleLinkedList fastPrevious = null;

        while (slow != null && fast != null && fast.next != null) {
            fastPrevious = fast;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }

        fastPrevious.next = head;

        return head;
    }

    private static SingleLinkedList deleteAtBeginning(SingleLinkedList head) {
        SingleLinkedList currNode = head;
        SingleLinkedList previousNode = null;
        if(currNode == null)
            return null;

        while (currNode != null) {
            previousNode = currNode;
            currNode = currNode.next;
            if(currNode == head) {
                previousNode.next = head.next;
                head = head.next;
                break;
            }
        }

        return head;
    }

    private static void printCircularLinkedList(SingleLinkedList head) {
        SingleLinkedList currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
            if(currNode == head) {
                break;
            }
        }
    }


}
