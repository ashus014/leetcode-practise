package src.dataStructures.linkedList;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedListDemo lDemo = new LinkedListDemo();
        lDemo.insertFirst(4);
        lDemo.insertFirst(3);
        lDemo.insertFirst(2);
        lDemo.insertFirst(1);
        lDemo.insertLast(6);
        lDemo.insert(5, 4);
        lDemo.insertFirst(0);

        lDemo.display();

    }
}
