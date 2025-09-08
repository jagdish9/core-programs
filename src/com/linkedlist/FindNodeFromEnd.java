package com.linkedlist;

public class FindNodeFromEnd {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(40);
        singleLinkedList.next = new SingleLinkedList(50);
        singleLinkedList.next.next = new SingleLinkedList(60);
        singleLinkedList.next.next.next = new SingleLinkedList(70);
        singleLinkedList.next.next.next.next = new SingleLinkedList(80);
        singleLinkedList.next.next.next.next.next= new SingleLinkedList(90);
        singleLinkedList.next.next.next.next.next.next = new SingleLinkedList(100);
        singleLinkedList.next.next.next.next.next.next.next = new SingleLinkedList(110);

        FindNodeFromEnd findNodeFromEnd = new FindNodeFromEnd();
        int nodeData = findNodeFromEnd.getNodeDataFromEnd(3, singleLinkedList);
        System.out.println(nodeData);
    }

    private int getNodeDataFromEnd(int nthNode, SingleLinkedList head) {
        SingleLinkedList current = head;
        int sizeOfLinkedList = 0;

        while(current != null) {
            current = current.next;
            sizeOfLinkedList++;
        }

        int nodeFromBeginning = (sizeOfLinkedList - nthNode) + 1;
        int nodeTraverseCount = 1;

        SingleLinkedList secondCurrent = head;
        while(secondCurrent != null) {
            if(nodeTraverseCount == nodeFromBeginning)
                return secondCurrent.data;

            nodeTraverseCount++;
            secondCurrent = secondCurrent.next;
        }

        return -1;
    }
}
