package src.interviewPractise.bp;

public class Main {

    public static void main(String[] args) {

        LRUCache l1 = new LRUCache(3);

        // empty cache
//        System.out.println(l1.get(3));

        // entering first value
        l1.put(1,11);
//        System.out.println(l1.get(1));

        l1.put(2,22);
        l1.put(3,33);
//        System.out.println(l1.get(1));

        l1.put(4,44);

        System.out.println(l1.get(1));
    }
}
