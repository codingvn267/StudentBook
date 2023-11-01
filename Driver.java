import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        StudentBook studentBook = new StudentBook();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1 - Add a new student.");
            System.out.println("2 - Remove a student.");
            System.out.println("3 - Display all students.");
            System.out.println("4 - Modify a student.");
            System.out.println("0 - Quit.");
            System.out.println("Enter your option: ");
            option = scanner.nextInt();
        

            switch (option) {
                case 1:
                    System.out.println("Please, provide id: ");
                    int id = scanner.nextInt();
                    System.out.println("Please, provide first name: ");
                    String firstName = scanner.next();
                    System.out.println("Please, provide last name: ");
                    String lastName = scanner.next();
                    System.out.println("Please, provide year of birth: ");
                    int yearOfBirth = scanner.nextInt();
                    System.out.println("Please, provide gpa: ");
                    float gpa = scanner.nextFloat();

                    if (studentBook.add(id, firstName, lastName, yearOfBirth, gpa)) {
                        System.out.println("Student succcessfully added.");
                    } else {
                        System.out.println("Student could not be added. ");
                    }
                    break;
                
                case 2:
                    System.out.println("Please, provide the id of the student to remove: ");
                    id = scanner.nextInt();

                    if(studentBook.remove(id)) {
                        System.out.println("Student successfully removed.");
                    } else {
                        System.out.println("Student could not be removed.");
                    }
                    break;
                
                case 3: 
                    studentBook.displayAll();
                    break;
                
                case 4:   
                    System.out.println("Please, provide id: ");
                    id = scanner.nextInt();
                    System.out.println("Please, provide first name: ");
                    firstName = scanner.next();
                    System.out.println("Please, provide last name: ");
                    lastName = scanner.next();
                    System.out.println("Please, provide year of birth: ");
                    yearOfBirth = scanner.nextInt();
                    System.out.println("Please, provide gpa: ");
                    gpa = scanner.nextFloat();

                    if (studentBook.modify(id, firstName, lastName, yearOfBirth, gpa)) {
                        System.out.println("Student successfully modified.");
                    } else {
                        System.out.println("Student could not be modified.");
                    }
                    break;
                
                case 0:
                    System.out.println("Bye!");
                    break;
                
                default: 
                    System.out.println("Invalid input!");
                    break;
            }
        } 
        
        while (option != 0);

        scanner.close();
    }
}
