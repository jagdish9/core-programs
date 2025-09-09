package programs.lfu;

import java.util.HashMap;
import java.util.Map;

public class LFUCache {

    private final Map<Integer, Integer> valueMap = new HashMap<>(4);
    private final Map<Integer, Integer> frequencyMap = new HashMap<>(4);

    public void put(int key, int value) {
        if(!valueMap.containsKey(key)) {
            valueMap.put(key, value);
            frequencyMap.put(key, 1);
        } else {
            valueMap.put(key, value);
            frequencyMap.put(key, frequencyMap.get(key) + 1);
        }
    }

    public int get(int key) {
        if(!valueMap.containsKey(key)) {
            return -1;
        }
        frequencyMap.put(key, frequencyMap.get(key) + 1);
        return valueMap.get(key);
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache();
        lfuCache.put(1, 100);
        lfuCache.put(2, 200);
        System.out.println(lfuCache.get(2));
        lfuCache.put(3, 300);
        System.out.println(lfuCache.get(3));
        lfuCache.put(4, 400);
        lfuCache.put(5, 500);
        System.out.println(lfuCache.get(5));
        lfuCache.put(6, 600);
        System.out.println(lfuCache.get(7));
        lfuCache.put(8, 800);
        lfuCache.put(7, 700);
        System.out.println(lfuCache.get(7));
    }
}
