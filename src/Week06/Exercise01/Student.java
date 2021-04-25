package Week06.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Student {
    private String student_name;
    private String paper_codes;

    public Student(String student_name, String paper_codes) {
        this.student_name = student_name;
        this.paper_codes = paper_codes;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getPaper_codes() {
        return paper_codes;
    }

    public void setPaper_codes(String paper_codes) {
        this.paper_codes = paper_codes;
    }

    @Override
    public String toString() {
        return student_name;
    }
}
