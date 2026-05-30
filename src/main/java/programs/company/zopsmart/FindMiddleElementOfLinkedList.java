package programs.company.zopsmart;

public class FindMiddleElementOfLinkedList {
    ZopNode head;
    public static void main(String[] args) {
        FindMiddleElementOfLinkedList fmel = new
                FindMiddleElementOfLinkedList();
        
        fmel.head = new ZopNode(7);
        fmel.head.next = new ZopNode(12);
        fmel.head.next.next = new ZopNode(17);
        fmel.head.next.next.next = new ZopNode(4);
        fmel.head.next.next.next.next = new ZopNode(20);
        fmel.head.next.next.next.next.next = new ZopNode(26);

        int middleElement = fmel.getMiddleElement();
        System.out.print(middleElement);
    }

    public int getMiddleElement() {
        ZopNode tmp = head;
        int totalNode = 0;
        while(tmp != null) {
            tmp = tmp.next;
            totalNode++;
        }

        int middle = totalNode / 2;
        tmp = head;
        int nodeCount = 1;
        while(tmp != null) {
            if(nodeCount == middle) {
                return tmp.data;
            }
            nodeCount++;
            tmp = tmp.next;
        }

        return -1;
    }

}
