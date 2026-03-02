import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(10);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    manager.addStudent(new Student(id, name, dept, marks));
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();
                    Student s = manager.findById(searchId);
                    if (s != null)
                        s.display();
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    System.out.print("New Marks: ");
                    double newMarks = sc.nextDouble();
                    manager.updateMarks(updateId, newMarks);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();
                    manager.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}