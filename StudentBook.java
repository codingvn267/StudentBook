public class StudentBook implements Action{
    private Student[] students = new Student[10];
    private int index = 0;

    @Override
    public boolean add(int id, String firstName, String lastName, int yearOfBirth, float gpa) {
        if (id <= 0 || firstName == null || lastName == null || yearOfBirth <= 1920 || gpa < 0) {
            return false;
        }

        for (Student student:students) {
            if (student != null && student.getId() == id) {
                return false;
            }
        }

        if (index < students.length) {
            students[index++] = new Student(id, gpa, firstName, lastName, yearOfBirth);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return true;
            }
        }
        return false;
    } 

    @Override
    public boolean modify(int id, String firstName, String lastName, int yearOfBirth, float gpa) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = new Student(id, gpa, firstName, lastName, yearOfBirth);
                return true;
            } 
        }
        return false;
    }

    @Override
    public void displayAll() {
        System.out.println("Current student list: ");

        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
