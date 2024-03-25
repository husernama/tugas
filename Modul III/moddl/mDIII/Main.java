import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n1. Student Menu");
        System.out.println("2. Admin Menu");
        System.out.print  ("Input Menu: ");
    }

    public static String inputNim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        return scanner.nextLine();
    }

    public static Object[] checkNim(String nim) {
        // Implement your logic to check the NIM and return an array of objects
        // containing student information
        return null;
    }

    public static void menuStudent() {
        System.out.println("\n1. Buku terpinjam");
        System.out.println("2. Pinjam buku");
        System.out.println("3. Kembalikan buku");
        System.out.println("4. Pinjam Buku atau Logout");
        System.out.print("Choose option (1-4): ");
    }

    public static void menuAdmin() {
        System.out.println("\n1. Add TempStudent");
        System.out.println("2. Add TempBooks");
        System.out.print("Choose option (1-2): ");
    }

    public static void addTempStudent() {
        // Implement your logic to add a temporary student
    }

    public static void addTempBooks() {
        // Implement your logic to add temporary books
    }

    public static void main(String[] args) {
        while (true) {
            // Display the menu
            menu();

            // Get user input
            String input = new Scanner(System.in).nextLine();

            // Process the user input
            switch (input) {
                case "1":
                    // Student menu
                    while (true) {
                        // Display the student menu
                        menuStudent();

                        // Get user input
                        String studentInput = new Scanner(System.in).nextLine();

                        // Process the student menu input
                        // You can implement the logic for each option here
                        if (studentInput.equals("2")) {
                            // Pinjam buku
                        } else if (studentInput.equals("3")) {
                            // Kembalikan buku
                        } else if (studentInput.equals("4")) {
                            // Pinjam Buku atau Logout
                            break;
                        }
                    }
                    break;
                case "2":
                    // Admin menu
                    while (true) {
                        // Display the admin menu
                        menuAdmin();

                        // Get user input
                        String adminInput = new Scanner(System.in).nextLine();

                        // Process the admin menu input
                        if (adminInput.equals("1")) {
                            // Add TempStudent
                        } else if (adminInput.equals("2")) {
                            // Add TempBooks
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Input tidak valid. Silahkan coba lagi.");
            }
        }
    }
}