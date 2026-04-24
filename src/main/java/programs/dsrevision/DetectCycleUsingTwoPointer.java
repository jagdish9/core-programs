package programs.dsrevision;

public class DetectCycleUsingTwoPointer {
    public static void main(String[] args) {
        LinkedNode head = new LinkedNode(10);
        head.next = new LinkedNode(20);
        head.next.next = new LinkedNode(30);
        head.next.next.next = new LinkedNode(40);
        head.next.next.next.next = head.next.next;

        boolean cycle = detectCycleUsingFloydAlgo(head);
        System.out.println(cycle);
    }

    private static boolean detectCycleUsingFloydAlgo(LinkedNode head) {
        LinkedNode slow = head;
        LinkedNode fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }

        return false;
    }
}
