package src.interviewPractise.chargpt2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LRUCache {
    private int capacity;
    private HashMap<String, Node> map;
    private Node head;
    private Node tail;
    private PriorityQueue<Node> minExpiry;
    private PriorityQueue<Node> maxPriority;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.minExpiry = new PriorityQueue<>(Comparator.comparingInt(node -> node.expiry));
        this.maxPriority = new PriorityQueue<>(Comparator.comparingInt((Node node) -> node.priority).reversed());
    }

    public String get(String key) {
        Node node = map.get(key);
        if (node == null) {
            return null;
        }
        updateNode(node);
        return node.value;
    }

    public void set(String key, String value, int priority, int expiry) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            node.priority = priority;
            node.expiry = expiry;
            updateNode(node);
            return;
        }
        Node node = new Node(key, value, priority, expiry);
        if (map.size() >= capacity) {
            evictItem();
        }
        addToCache(node);
    }

    public void evictItem() {
        if (!minExpiry.isEmpty()) {
            Node expired = minExpiry.peek();
            if (expired.expiry <= System.currentTimeMillis()) {
                removeNode(expired);
                return;
            }
        }
        Node leastPriority = maxPriority.poll();
        removeNode(leastPriority);
    }

    private void addToCache(Node node) {
        map.put(node.key, node);
        updateNode(node);
        minExpiry.offer(node);
        maxPriority.offer(node);
    }

    private void updateNode(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        if (node == head) {
            head = node.next;
        } else if (node == tail) {
            tail = node.prev;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    private void addToHead(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private static class Node {
        private final String key;
        private String value;
        private int priority;
        private int expiry;
        private Node prev;
        private Node next;

        public Node(String key, String value, int priority, int expiry) {
            this.key = key;
            this.value = value;
            this.priority = priority;
            this.expiry = expiry;
        }
    }
}
