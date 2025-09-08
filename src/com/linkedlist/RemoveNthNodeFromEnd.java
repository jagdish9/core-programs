package com.linkedlist;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(40);
        singleLinkedList.next = new SingleLinkedList(50);
        singleLinkedList.next.next = new SingleLinkedList(60);
        singleLinkedList.next.next.next = new SingleLinkedList(70);
        singleLinkedList.next.next.next.next = new SingleLinkedList(80);
        singleLinkedList.next.next.next.next.next= new SingleLinkedList(90);
        singleLinkedList.next.next.next.next.next.next = new SingleLinkedList(100);

        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        removeNthNodeFromEnd.printList(singleLinkedList);
        SingleLinkedList listAfterDeletion = removeNthNodeFromEnd.getNodeAfterDeletion(3, singleLinkedList);
        System.out.println("\n----------------");
        removeNthNodeFromEnd.printList(listAfterDeletion);
    }

    private void printList(SingleLinkedList listAfterDeletion) {
        while(listAfterDeletion != null) {
            System.out.print(listAfterDeletion.data + " ");
            listAfterDeletion = listAfterDeletion.next;
        }
    }

    private SingleLinkedList getNodeAfterDeletion(int nthNode, SingleLinkedList head) {
        SingleLinkedList current = head;
        int lengthOfLinkedList = 0;

        while(current != null) {
            current = current.next;
            lengthOfLinkedList++;
        }

        int countFromBeginning = lengthOfLinkedList - nthNode;

        if(countFromBeginning == 0) return head.next;

        int traverseNodeCount = 1;

        current = head;
        while(current != null) {
            if(countFromBeginning == traverseNodeCount)
                break;

            current = current.next;
            traverseNodeCount++;
        }

        current.next = current.next.next;

        return head;
    }
}
