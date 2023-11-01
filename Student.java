public class Student extends Person {
    private float gpa;
    private int id;

    public Student (int id, float gpa, String firstName, String lastName, int yearOfBirth) {
        super(firstName, lastName, yearOfBirth);
        this.id = id;
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Id: " + " , " + super.toString() + " GPA: " + gpa;
    }
}
