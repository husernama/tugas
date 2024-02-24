import java.util.Scanner;

class LibrarySystem {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isStudentLoggedIn = false;
    private static boolean isAdminLoggedIn = false;
    private static String studentNIM;
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                if (!isStudentLoggedIn) {
                    loginAsStudent();
                } else {
                    System.out.println("***** Library System *****");
                    System.out.println("1. Login as Student");
                    System.out.println("2. Login as Admin");
                    System.out.println("3. Exit");
                    System.out.print("Choose option (1-3): ");
                }
            } else if (choice == 2) {
                if (!isAdminLoggedIn) {
                    loginAsAdmin();
                } else {
                    System.out.println("===== Library System =====");
                    System.out.println("1. Login as Student");
                    System.out.println("2. Login as Admin");
                    System.out.println("3. Exit");
                    System.out.print("Choose option (1-3): ");
                }
            } else if (choice == 3) {
                System.out.println("adios (arisu @ GLM4deu) - [ - ]");
                break;
            } else {
                System.out.println("Invalid option, please choose again");
            }
        }
    }

    private static void loginAsStudent() {
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();
        if (nim.equals(studentNIM)) {
            System.out.println("Successful Login as Student");
            isStudentLoggedIn = true;
        } else {
            System.out.println("User Not Found");
        }
    }

    private static void loginAsAdmin() {
        String adminUsername = "admin";
        String adminPassword = "admin";
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Successful Login as Admin");
            isAdminLoggedIn = true;
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}