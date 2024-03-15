import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static ArrayList<Book> bookList = new ArrayList<Book>();
    static ArrayList<Student> userStudent = new ArrayList<Student>();

    public static void main(String[] args) {


        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            Menu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    menuAdmin();
                    break;
                case 2:

                    String nim = inputNim();


                    if (checkNim(nim)) {

                        menuStudent();
                    } else {
                        System.out.println("NIM not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 3);

        scanner.close();
    }

    static void Menu() {
        System.out.println("=================================");
        System.out.println("Welcome to Library Management");
        System.out.println("=================================");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.println("3. Exit");
        System.out.print("Choose your role : ");
    }

    static String inputNim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your NIM (input 9 untuk back) : ");
        String nim = scanner.nextLine();
        return nim;
    }

    static boolean checkNim(String nim) {for (Student student : userStudent) { if (student.getNim().equals(nim)) { return true; } } return false; }


    static void menuAdmin() {

    }

    static void menuStudent() {

    }
}





