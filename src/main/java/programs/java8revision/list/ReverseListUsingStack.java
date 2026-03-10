package programs.java8revision.list;

import java.util.Stack;

public class ReverseListUsingStack {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(20);
        head.next.next = new LinkedListNode(30);
        head.next.next.next = new LinkedListNode(40);
        head.next.next.next.next = new LinkedListNode(50);

        LinkedListNode reverseList = reverseLinkedList(head);
        printReverseList(reverseList);
    }

    private static LinkedListNode reverseLinkedList(LinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        LinkedListNode node = head;

        while(node != null) {
            stack.push(node.data);
            node = node.next;
        }

        node = head;
        while (node != null) {
            node.data = stack.pop();
            node = node.next;
        }

        return head;
    }

    private static void printReverseList(LinkedListNode headNode) {
        LinkedListNode node = headNode;

        while(node != null) {
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }
}
