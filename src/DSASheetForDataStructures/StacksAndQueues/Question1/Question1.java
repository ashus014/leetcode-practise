package src.DSASheetForDataStructures.StacksAndQueues.Question1;

// Implement Custom Stack form scratch

public class Question1 {

    public static void main(String[] args) throws Exception {
        // CustomeStack s1 = new CustomeStack(5);
        // s1.push(11);
        // s1.push(22);
        // s1.push(33);
        // s1.push(44);
        // s1.push(55);
        // s1.push(66);

        // System.out.println(s1.peek());
        // System.out.println(s1.pop());
        // System.out.println(s1.peek());

        CustomeStack s1 = new DynamicStack(5);
        s1.push(11);
        s1.push(22);
        s1.push(33);
        s1.push(44);
        s1.push(55);
        // s1.push(66);
        System.out.println(s1.data.length);

    }
}
