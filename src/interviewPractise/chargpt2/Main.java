package src.interviewPractise.chargpt2;

public class Main {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);

        cache.set("a", "apple", 1, 5);
        cache.set("b", "banana", 2, 3);
        cache.set("c", "cherry", 3, 10);

        System.out.println(cache.get("a")); // prints "apple"
        System.out.println(cache.get("b")); // prints "banana"
        System.out.println(cache.get("c")); // prints "cherry"

        cache.evictItem();

        System.out.println(cache.get("a")); // prints null, item has expired
        System.out.println(cache.get("b")); // prints "banana"
        System.out.println(cache.get("c")); // prints "cherry"

        cache.set("d", "date", 4, 7);

        System.out.println(cache.get("b")); // prints "banana", "c" was evicted due to priority
        System.out.println(cache.get("c")); // prints null, item has been evicted
        System.out.println(cache.get("d")); // prints "date"
    }

}
