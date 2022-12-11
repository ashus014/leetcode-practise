package src.DSASheetForDataStructures.StacksAndQueues.Question1;

public class CustomeStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomeStack(int size) {
        this.data = new int[size];
    }

    public CustomeStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't pop from empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // data at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
