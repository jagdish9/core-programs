package com.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    CacheNode head = new CacheNode(0, 0);
    CacheNode tail = new CacheNode(0, 0);
    Map<Integer, CacheNode> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void insert(CacheNode cacheNode) {
        map.put(cacheNode.key, cacheNode);
        cacheNode.next = head.next;
        cacheNode.next.prev = cacheNode;
        head.next = cacheNode;
        cacheNode.prev = head;
    }

    private void remove(CacheNode cacheNode) {
        map.remove(cacheNode.key);
        cacheNode.prev.next = cacheNode.next;
        cacheNode.next.prev = cacheNode.prev;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }
        if(map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new CacheNode(key, value));
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            CacheNode node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        int result = lruCache.get(1);    // return 1
        System.out.println(result);
        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        result = lruCache.get(2);    // returns -1 (not found)
        System.out.println(result);
        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        result = lruCache.get(1);    // return -1 (not found)
        System.out.println(result);
        result = lruCache.get(3);    // return 3
        System.out.println(result);
        result = lruCache.get(4);    // return 4
        System.out.println(result);

    }
}

class CacheNode {
    CacheNode next;
    CacheNode prev;
    int key;
    int value;

    public CacheNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

//https://takeuforward.org/data-structure/implement-lru-cache/