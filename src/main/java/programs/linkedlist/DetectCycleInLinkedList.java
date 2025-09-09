package programs.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleInLinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList(11);
        singleLinkedList.next = new SingleLinkedList(22);
        singleLinkedList.next.next = new SingleLinkedList(33);
        singleLinkedList.next.next.next = new SingleLinkedList(44);
        singleLinkedList.next.next.next.next = new SingleLinkedList(55);
        singleLinkedList.next.next.next.next.next = singleLinkedList.next.next.next;

        DetectCycleInLinkedList detectCycleInLinkedList = new DetectCycleInLinkedList();
        boolean detected = detectCycleInLinkedList.isCycleDetected(singleLinkedList);
        System.out.print(detected);
    }

    private boolean isCycleDetected(SingleLinkedList head) {
        Set<SingleLinkedList> nodeSet = new HashSet<>();
        SingleLinkedList node = head;

        while(node != null) {
            if(nodeSet.contains(node))
                return true;

            nodeSet.add(node);
            node = node.next;
        }

        return false;
    }
}
