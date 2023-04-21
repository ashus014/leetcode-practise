package src.interviewPractise.chatGPT;

public class CacheDS {
    Node head;
    Node tail;

    void remove(Node node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    void addToFront(Node node) {
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }
}
