package Iterator.College;

import java.util.ArrayList;

public class College implements ICollection {
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

    @Override
    public Iterator createStudentYearIterator(int year) {
        return new StudentYearIterator(year, this);
    }

}
