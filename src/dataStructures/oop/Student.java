package src.dataStructures.oop;

public class Student {
    int rollNumber;
    String name;
    float marks;

    Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + ", rollNumber=" + rollNumber + "]";
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(11, "Ashu Singh", 99.12f);
        System.out.println(s1);
    }
}
