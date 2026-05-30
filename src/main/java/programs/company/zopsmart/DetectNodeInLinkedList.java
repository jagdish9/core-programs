package programs.company.zopsmart;

import java.util.HashSet;
import java.util.Set;

public class DetectNodeInLinkedList {
    public static void main(String[] args) {
        ZopNode head = new ZopNode(7);
        head.next = new ZopNode(12);
        head.next.next = new ZopNode(17);
        head.next.next.next = new ZopNode(4);
        head.next.next.next.next = new ZopNode(20);
        head.next.next.next.next.next = head.next; //cycle formed

        DetectNodeInLinkedList detectNodeInLinkedList = new DetectNodeInLinkedList();
        boolean cycleExists = detectNodeInLinkedList.detectCycle(head);
        System.out.println(cycleExists);

        boolean cycleExists2 = detectNodeInLinkedList.detectCycle2(head);
        System.out.println(cycleExists2);
    }


    public boolean detectCycle(ZopNode head) {
        ZopNode tmp = head;
        Set<ZopNode> nodes = new HashSet<>();

        while(tmp != null) {
            if(nodes.contains(tmp)) {
                return true;
            }
            nodes.add(tmp);
            tmp = tmp.next;
        }
        return false;
    }


    //Floyd algo
    public boolean detectCycle2(ZopNode head) {
        ZopNode tmp = head;
        ZopNode firstNode = tmp;
        ZopNode secondNode = tmp.next;

        while(firstNode != null && secondNode != null && secondNode.next != null) {
            if(firstNode == secondNode)
                return true;
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        return false;
    }
}

