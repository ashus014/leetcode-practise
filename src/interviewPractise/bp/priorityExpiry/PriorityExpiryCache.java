package src.interviewPractise.bp.priorityExpiry;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityExpiryCache {

    private Map<String, CacheItem> cacheMap; // Hash table to store key-value pairs
    private PriorityQueue<CacheItem> priorityQueue; // Heap to store items by priority
    private PriorityQueue<CacheItem> expiryQueue; // Heap to store items by expiry time
    private int maxSize; // Maximum size of the cache

    public PriorityExpiryCache(int maxSize) {
        this.maxSize = maxSize;
        this.cacheMap = new HashMap<>();
        this.priorityQueue = new PriorityQueue<>((a, b) -> b.priority - a.priority); // Max-heap based on priority
        this.expiryQueue = new PriorityQueue<>((a, b) -> Long.compare(a.expiryTime, b.expiryTime)); // Min-heap based on expiry time
    }

    public String get(String key) {
        CacheItem item = cacheMap.get(key);
        if (item == null) {
            return null;
        }
        if (item.expiryTime < System.currentTimeMillis()) { // Check if item has expired
            evictItem((int) System.currentTimeMillis()); // Evict expired items from cache
            return null;
        }
        return item.value;
    }

    public void set(String key, String value, int priority, int expiry) {
        evictItem((int) System.currentTimeMillis()); // Evict expired items from cache
        CacheItem item = new CacheItem(key, value, priority, System.currentTimeMillis() + expiry * 1000);
        if (cacheMap.containsKey(key)) { // Update existing item
            CacheItem existingItem = cacheMap.get(key);
            priorityQueue.remove(existingItem); // Remove existing item from priority queue
            expiryQueue.remove(existingItem); // Remove existing item from expiry queue
        } else if (cacheMap.size() == maxSize) { // Remove least priority item if cache is full
            CacheItem leastPriorityItem = priorityQueue.poll();
            expiryQueue.remove(leastPriorityItem);
            cacheMap.remove(leastPriorityItem.key);
        }
        cacheMap.put(key, item);
        priorityQueue.offer(item); // Add item to priority queue
        expiryQueue.offer(item); // Add item to expiry queue
    }

    public void evictItem(int currentTime) {
        while (!expiryQueue.isEmpty() && expiryQueue.peek().expiryTime < currentTime) { // Remove all expired items
            CacheItem expiredItem = expiryQueue.poll();
            priorityQueue.remove(expiredItem);
            cacheMap.remove(expiredItem.key);
        }
    }

    private class CacheItem {
        private String key;
        private String value;
        private int priority;
        private long expiryTime;

        public CacheItem(String key, String value, int priority, long expiryTime) {
            this.key = key;
            this.value = value;
            this.priority = priority;
            this.expiryTime = expiryTime;
        }
    }
}
