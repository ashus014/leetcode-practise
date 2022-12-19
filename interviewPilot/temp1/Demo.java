package interviewPilot.temp1;

public class Demo {

    int i;

    public static void main(String[] args) {

        Demo d = new Demo();
        d.print();
    }

    private void print() {
        i = 6;
        System.out.println(this.i);
    }

}
