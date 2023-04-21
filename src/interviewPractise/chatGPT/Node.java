package src.interviewPractise.chatGPT;

public class Node {

    String key;
    String value;
    int priority;
    long expiration;
    Node prev;
    Node next;

    Node(String key, String value, int priority, long expiration) {
        this.key = key;
        this.value = value;
        this.priority = priority;
        this.expiration = expiration;
    }
}
