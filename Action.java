interface Action {
    boolean add(int id, String firstName, String lastName, int yearOfBirth, float gpa);
    boolean remove(int id);
    boolean modify(int id, String firstName, String lastName, int yearOfBirth, float gpa);
    void displayAll();
}
