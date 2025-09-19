package programs.linkedlist;

import java.util.Stack;

public class ReverseLinkedListUsingStack {
    public static void main(String[] args) {
        SingleLinkedList node = new SingleLinkedList(1);
        node.next = new SingleLinkedList(5);
        node.next.next = new SingleLinkedList(3);
        node.next.next.next = new SingleLinkedList(7);
        node.next.next.next.next = new SingleLinkedList(9);

        ReverseLinkedListUsingStack reverseLinkedList = new ReverseLinkedListUsingStack();
        reverseLinkedList.printList(node);
        System.out.println();

        SingleLinkedList reverseList = getReverseLinkedList(node);
        reverseLinkedList.printList(reverseList);
    }

    private static SingleLinkedList getReverseLinkedList(SingleLinkedList node) {
        Stack<Integer> stack = new Stack<>();
        SingleLinkedList rootNode = node;
        while(rootNode != null) {
            stack.push(rootNode.data);
            rootNode = rootNode.next;
        }

        rootNode = node;
        while(rootNode != null) {
            rootNode.data = stack.pop();
            rootNode = rootNode.next;
        }

        return node;
    }

    public void printList(SingleLinkedList singleLinkedList) {
        SingleLinkedList node = singleLinkedList;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
