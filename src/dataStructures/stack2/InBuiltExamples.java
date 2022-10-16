package src.dataStructures.stack2;

import java.util.Stack;

public class InBuiltExamples {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        System.out.println("Popping out : " + stack.pop());
        System.out.println(stack);
    }
}
