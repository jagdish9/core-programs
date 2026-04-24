package programs.dsrevision;

import java.util.Stack;

public class ReverseLinkedListUsingStack {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(10);
        head.next = new LinkedNode(20);
        head.next.next = new LinkedNode(30);
        head.next.next.next = new LinkedNode(40);

        printLinkedList(head);

        LinkedNode reverseNode = reverseLinkedListUsingStack(head);
        System.out.println("Reverse linked list");

        printLinkedList(reverseNode);
    }

    private static LinkedNode reverseLinkedListUsingStack(LinkedNode head) {
        Stack<LinkedNode> stack = new Stack<>();
        LinkedNode tmp = head;


        //push all records from stack
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }

        //make last node as new head of the linked list
        while(!stack.isEmpty()) {
            head = stack.pop();
            tmp = head;

            // pop all the nodes and append to the linked list
            while(!stack.isEmpty()) {
                tmp.next = stack.pop();

                tmp = tmp.next;
            }

            tmp.next = null;
        }

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
