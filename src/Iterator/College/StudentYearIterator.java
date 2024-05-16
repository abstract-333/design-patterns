package Iterator.College;

import java.util.ArrayList;

public class StudentYearIterator implements Iterator {
    private int year;
    private College college;
    private int curretIndex = 0;

    public StudentYearIterator(int year, College college) {
        this.year = year;
        this.college = college;
    }

    @Override
    public boolean hasNext() {
        ArrayList<Student> students = college.getStudents();
        for (int index = curretIndex; index < students.size(); index++) {
            if (students.get(index).getYear() == this.year) {
                this.curretIndex = index;
                return true;
            }

        }
        return false;
    }

    @Override
    public Student next() {
        ArrayList<Student> students = college.getStudents();
        Student nextChannel = students.get(curretIndex);
        curretIndex++;
        return nextChannel;
    }

    @Override
    public void reset() {
        this.curretIndex = 0;
    }

}
