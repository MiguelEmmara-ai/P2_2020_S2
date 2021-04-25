package Week06.Exercise01;

import java.util.ArrayList;

/**
 * Created by Miguel Emmara
 */
public class StudentList {
    private final ArrayList<Student> studentArrayList;


    public StudentList() {
        this.studentArrayList = new ArrayList<>();
    }

    public ArrayList<Student> enrolledIn(String paper_codes) {
        ArrayList<Student> temp = new ArrayList<>();

        for (Student student : this.studentArrayList) {
            if (student.getPaper_codes().contains(paper_codes)) {
                temp.add(student);
            }
        }

        return temp;
    }

    public void add(Student student) {
        this.studentArrayList.add(student);
    }
}
