package Week06.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("Bob", "COMP503,COMP600"));
        studentList.add(new Student("Robin", "COMP501,COMP600"));
        studentList.add(new Student("Jamal", "COMP503"));
        System.out.println(studentList.enrolledIn("COMP503"));
    }
}