package programs.cache;

import java.util.HashMap;
import java.util.Map;

public class LruCacheImplementation {

    class LruNode {
        int key, value;
        LruNode next, prev;

        public LruNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, LruNode> map;
    private LruNode head, tail;

    public LruCacheImplementation(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new LruNode(0, 0);
        tail = new LruNode(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        LruNode node = map.get(key);
        remove(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }

        if(map.size() == capacity) {
            remove(tail.prev);
        }

        LruNode lruNode = new LruNode(key, value);
        insert(lruNode);
    }

    public void remove(LruNode node) {
        map.remove(node.key);

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(LruNode node) {
        map.put(node.key, node);

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public static void main(String[] args) {
        LruCacheImplementation lru = new LruCacheImplementation(2);

        lru.put(1, 10);
        lru.put(2, 20);

        System.out.println(lru.get(1));

        lru.put(3, 30);

        System.out.println(lru.get(2));
    }
}

/*
Popular caching libraries:
    Guava Cache
    Caffeine (best performance)
    Ehcache
    Redis (distributed cache)
 */
