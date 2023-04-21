package src.interviewPractise.bp.priorityExpiry;

public class Main {

    public static void main(String[] args) {
        PriorityExpiryCache cache = new PriorityExpiryCache(3); // Create a cache with capacity 3

        // Set some values with different priorities and expiry times
        cache.set("key1", "value1", 1, 1000); // Priority 1, expires in 1 second
        cache.set("key2", "value2", 2, 2000); // Priority 2, expires in 2 seconds
        cache.set("key3", "value3", 3, 3000); // Priority 3, expires in 3 seconds

        // Wait for some time
        try {
            Thread.sleep(5500); // Wait for 1.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get a value that has not expired yet
        String value1 = cache.get("key1"); // Returns "value1"
        System.out.println("Value for key1: " + value1);

        // Get a value that has expired
        String value2 = cache.get("key2"); // Returns null
        System.out.println("Value for key2: " + value2);

        // Set another value to evict the expired one
        cache.set("key4", "value4", 4, 4000); // Priority 4, expires in 4 seconds

        // Get the expired value again (should be null)
        String value2Again = cache.get("key2"); // Returns null
        System.out.println("Value for key2 again: " + value2Again);
    }

}
