package src.ashu.arrayOperations;

public class ThisLinkedlList {

    int value;
    ThisLinkedlList next;

    public ThisLinkedlList(int value) {
        this.value = value;
//        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ThisLinkedlList getNext() {
        return next;
    }

    public void setNext(ThisLinkedlList next) {
        this.next = next;
    }
}
