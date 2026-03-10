package programs.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheUsingDoubleyLinkedList {
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int capacity;
    private Map<Integer, Node> map = new HashMap<>();
    private Node head, tail;

    public LRUCacheUsingDoubleyLinkedList(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        insertAtHead(node);
        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        if (map.size() == capacity) {
            map.remove(tail.key);
            remove(tail);
        }

        Node newNode = new Node(key, value);
        insertAtHead(newNode);
        map.put(key, newNode);
    }

    private void remove(Node node) {

        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
    }

    private void insertAtHead(Node node) {

        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;

        if (tail == null)
            tail = node;
    }
}
