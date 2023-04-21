package src.interviewPractise.chatGPT;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LRUCache {

    int capacity;
    Map<String, Node> keyMap;
    Map<Integer, CacheDS> priorityMap;

    LRUCache(int capacity) {
        this.capacity = capacity;
        keyMap = new HashMap<>();
        priorityMap = new TreeMap<>();
    }

    public String get(String key) {
        if (!keyMap.containsKey(key)) {
            return null;
        }
        Node node = keyMap.get(key);
        CacheDS cacheDS = priorityMap.get(node.priority);
        cacheDS.remove(node);
        cacheDS.addToFront(node);
        return node.value;
    }

    public void put(String key, String value, int priority, long expiration) {
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            node.priority = priority;
            node.expiration = expiration;
            CacheDS cacheDS = priorityMap.get(priority);
            cacheDS.remove(node);
            cacheDS.addToFront(node);
        } else {
            if (keyMap.size() == capacity) {
                Iterator<Integer> iterator = priorityMap.keySet().iterator();
                while (iterator.hasNext()) {
                    int currPriority = (int) ((Iterator<?>) iterator).next();
                    CacheDS currCacheDS = priorityMap.get(currPriority);
                    Node currTail = currCacheDS.tail;
                    if (currTail != null && currTail.expiration < System.currentTimeMillis()) {
                        currCacheDS.remove(currTail);
                        keyMap.remove(currTail.key);
                        if (currCacheDS.head == null) {
                            iterator.remove();
                        }
                        break;
                    }
                }
            }
            Node node = new Node(key, value, priority, expiration);
            keyMap.put(key, node);
            priorityMap.computeIfAbsent(priority, k -> new CacheDS()).addToFront(node);
        }
    }
}
