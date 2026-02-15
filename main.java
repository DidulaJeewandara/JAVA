import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        student_manager manager = new student_manager();


        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Save to File");
            System.out.println("3. Load from File");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    student s = new student(name, id, age, password);
                    manager.addStudent(s);
                    break;
                case 2:
                    try {
                        manager.saveToFile("didula.ser");
                        System.out.println("Students saved to file.");
                     
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                    
                case 3:
                    try {
                        manager.loadFromFile("didula.ser");
                        System.out.println("Students loaded from file.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

}