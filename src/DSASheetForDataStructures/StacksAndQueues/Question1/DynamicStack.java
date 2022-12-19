package src.DSASheetForDataStructures.StacksAndQueues.Question1;

public class DynamicStack extends CustomeStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {

        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy al previous items
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        // insert item
        return super.push(item);
    }
}
