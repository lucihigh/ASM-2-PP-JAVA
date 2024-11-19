import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement 
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Student> students = new ArrayList<>();

    // Add students
    private static void enterStudentList() {
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1));
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();
            students.add(new Student(fullName, age, studentId));
        }
        System.out.println("Students added successfully!");
    }

    // Find students by last name
    private static void findStudentsByLastName() {
        System.out.print("Enter last name to search: ");
        String lastName = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getFullName().endsWith(lastName)) {
                student.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with last name: " + lastName);
        }
    }

    // Find and edit students by full name
    private static void findAndEditStudentByFullName() {
        System.out.print("Enter full name to search: ");
        String fullName = scanner.nextLine();
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                System.out.println("Student found:");
                student.displayInfo();
                System.out.println("Enter new information:");
                System.out.print("New Full Name: ");
                student.setFullName(scanner.nextLine());
                System.out.print("New Age: ");
                student.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("New Student ID: ");
                student.setStudentId(scanner.nextLine());
                System.out.println("Student information updated successfully!");
                return;
            }
        }
        System.out.println("No student found with full name: " + fullName);
    }

    // Menu
    private static void menu() {
        System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
        System.out.println("1. Enter student list");
        System.out.println("2. Find students by last name");
        System.out.println("3. Find and edit students by full name");
        System.out.println("4. End");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    enterStudentList();
                    break;
                case 2:
                    findStudentsByLastName();
                    break;
                case 3:
                    findAndEditStudentByFullName();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
