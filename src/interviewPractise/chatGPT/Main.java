package src.interviewPractise.chatGPT;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(5);
        cache.put("key1", "value1", 1, 5);
        cache.put("key2", "value2", 2, 10);
        cache.put("key3", "value3", 1, 2);
        cache.put("key4", "value4", 3, 15);
        cache.put("key5", "value5", 2, 8);

        System.out.println(cache.get("key1")); // output: value1
        System.out.println(cache.get("key3")); // output: value3
        System.out.println(cache.get("key6")); // output: null
    }
}
