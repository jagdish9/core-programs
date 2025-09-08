package com.linkedlist;

public class FindNodeFromBeginning {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(40);
        singleLinkedList.next = new SingleLinkedList(50);
        singleLinkedList.next.next = new SingleLinkedList(60);
        singleLinkedList.next.next.next = new SingleLinkedList(70);
        singleLinkedList.next.next.next.next = new SingleLinkedList(80);

        FindNodeFromBeginning findNodeFromBeginning = new FindNodeFromBeginning();
        int nodeData = findNodeFromBeginning.getNodeDataFromBeginning(3, singleLinkedList);
        System.out.println(nodeData);
    }

    private int getNodeDataFromBeginning1(int nthNode, SingleLinkedList head) {
        SingleLinkedList current = head;
        SingleLinkedList previous = head;
        int nodeCount = 0;

        while(current != null && nodeCount < nthNode) {
            previous = current;
            current = current.next;
            nodeCount++;
        }

        return previous.data;
    }

    private int getNodeDataFromBeginning(int nthNode, SingleLinkedList head) {
        SingleLinkedList current = head;
        int nodeCount = 1;

        while(current != null) {
            if(nodeCount == nthNode)
                return current.data;
            current = current.next;
            nodeCount++;
        }

        return -1;
    }
}
