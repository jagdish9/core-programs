package com.linkedlist;

public class DetectCycleInLinkedListUsingFloydAlgo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(11);
        singleLinkedList.next = new SingleLinkedList(22);
        singleLinkedList.next.next = new SingleLinkedList(33);
        singleLinkedList.next.next.next = new SingleLinkedList(44);
        singleLinkedList.next.next.next.next = new SingleLinkedList(55);
        singleLinkedList.next.next.next.next.next = singleLinkedList.next.next.next;

        DetectCycleInLinkedListUsingFloydAlgo detectCycleInLinkedListUsingFloydAlgo = new DetectCycleInLinkedListUsingFloydAlgo();
        boolean detected = detectCycleInLinkedListUsingFloydAlgo.detectCycle(singleLinkedList);
        System.out.print(detected);
    }

    private boolean detectCycle(SingleLinkedList singleLinkedList) {
        SingleLinkedList slow = singleLinkedList;
        SingleLinkedList fast = singleLinkedList;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
