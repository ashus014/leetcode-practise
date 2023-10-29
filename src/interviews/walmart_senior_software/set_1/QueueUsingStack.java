package src.interviews.walmart_senior_software.set_1;

import java.util.Stack;

public class QueueUsingStack {

    private final Stack<Integer> s1 = new Stack<Integer>();
    private final Stack<Integer> s2 = new Stack<Integer>();

    void enQueue(int x)
    {
        // Move all elements from s1 to s2
        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
            //s1.pop();
        }

        // Push item into s1
        s1.push(x);

        // Push everything back to s1
        while (!s2.isEmpty())
        {
            s1.push(s2.pop());
            //s2.pop();
        }
    }

    int deQueue()
    {
        // if first stack is empty
        if (s1.isEmpty())
        {
            return -1;
        }

        // Return top of s1
//        int x = s1.peek();
        return s1.pop();
//        return x;
    }

    public static void main(String[] args)
    {
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }

}
