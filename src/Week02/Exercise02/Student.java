package Week02.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Student {
    String firstname;
    String lastname;
    String studentID;

    public Student() {
        setFirstname("UNKNOWN");
        setLastname("UNKNOWN");
        setStudentID("?");
    }

    public Student(String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);
        setStudentID("?");
    }

    public Student(String firstname, String lastname, String studentID) {
        setFirstname(firstname);
        setLastname(lastname);
        setStudentID(studentID);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        String str = "";

        str += "Student's first name: " + getFirstname() + " ";
        str += "last name: " + getLastname() + " ";
        str += "ID: " + getStudentID();

        return str;
    }
}

