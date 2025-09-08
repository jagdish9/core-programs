package com.lfu;

public class LFUCacheNode {
    int key;
    int value;
    int frequency;
    int timestamp;

    public LFUCacheNode(int key, int value, int timestamp) {
        this.key = key;
        this.value = value;
        this.frequency = 1;
        this.timestamp = timestamp;
    }
}
