package Week03.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentID;

    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public Student(String studentID) {
        setFirstName("");
        setLastName("");
        setStudentID(studentID);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student's first name: " + getFirstName() + ", last name: " + getLastName() + ", ID: " + getStudentID();
    }
}
