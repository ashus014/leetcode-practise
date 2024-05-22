package src.ashu.arrayOperations;

public class Empl {


    private String state;
    private String department;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Empl(String state, String department) {
        this.state = state;
        this.department = department;
    }
}
