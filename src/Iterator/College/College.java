package Iterator.College;

import java.util.ArrayList;

public class College {
    private ArrayList<Student> students;

    public College() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    Iterator createStudentYearIterator(int year) {
        return new StudentYearIterator(year, this);
    }

}
