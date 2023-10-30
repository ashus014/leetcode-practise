package src.Java8Practise.tempPrac;

import java.util.Stack;

public class AshuQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    private void enQueue (int number) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(number);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    private int deQueue () {

        return s1.pop();
    }


    public static void main(String[] args) {

        AshuQueue aq = new AshuQueue();
        aq.enQueue(1);
        aq.enQueue(2);
        aq.enQueue(3);
        aq.enQueue(4);
        System.out.println(aq.deQueue());
        System.out.println(aq.deQueue());
        System.out.println(aq.deQueue());
        System.out.println(aq.deQueue());
    }
}
