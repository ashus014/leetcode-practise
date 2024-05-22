package src.ashu.arrayOperations;

public class Student {

    private String studentName;
    private String studentGrade;

    public Student(String studentName, String studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                '}';
    }
}
