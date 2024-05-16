package Iterator.College;

public class Main {
    public static void main(String[] args) throws Exception {

        College ief = new College();
        ief.addStudent(new Student("Ahmad", 5));
        ief.addStudent(new Student("Samer", 3));
        ief.addStudent(new Student("Ali", 5));
        ief.addStudent(new Student("Zein", 5));

        Iterator fifthYearIterator = new StudentYearIterator(5, ief);
        while (fifthYearIterator.hasNext()) {
            System.out.println(fifthYearIterator.next().getName());
        }
    }
}
