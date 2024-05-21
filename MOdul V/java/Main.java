import books.Book;
import data.Admin;
import data.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== Library System ===");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Role: Student
                    System.out.println("\n-- Student Menu --");
                    System.out.print("Enter your name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter your NIM: ");
                    String studentNIM = scanner.nextLine();
                    System.out.print("Enter your faculty: ");
                    String studentFaculty = scanner.nextLine();
                    System.out.print("Enter your program study: ");
                    String studentProgramStudy = scanner.nextLine();

                    Student student = new Student(studentName, studentNIM);
                    int studentChoice;
                    do {
                        System.out.println("\nStudent: " + studentName);
                        System.out.println("1. Tampilkan Buku yang Tersedia");
                        System.out.println("2. Pinjam buku");
                        System.out.println("3. Kembalikan Buku yang Dipinjam");
                        System.out.println("4. Logout");
                        System.out.println("   Choose option (1-4):");
                        studentChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (studentChoice) {
                            case 1:
                                student.choiceBook(books);
                                break;
                            case 2:
                                student.borrowBook(books);
                                break;
                            case 3:
                                student.showBorrowedBooks();
                                System.out.print("Enter the Book ID to return: ");
                                String bookIdToReturn = scanner.nextLine();
                                Book bookToReturn = findBookById(student.getBorrowedBooks(), bookIdToReturn);
                                if (bookToReturn!= null) {
                                    student.returnBooks(bookToReturn);
                                } else {
                                    System.out.println("You haven't borrowed a book with ID " + bookIdToReturn + ".");
                                }
                                break;
                            case 4:
                                student.logout();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (studentChoice!= 4);
                    break;
                case 2:
                    int adminChoice;
                    do {
                        System.out.println("\n-- Admin Menu --");
                        System.out.println("1. Add Student");
                        System.out.println("2. Input Book");
                        System.out.println("3. Display Available Books");
                        System.out.println("4. Logout");
                        System.out.print("Enter your choice: ");
                        adminChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (adminChoice) {
                            case 1:
                                System.out.print("Enter student name: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter student NIM: ");
                                String nim = scanner.nextLine();
                                System.out.print("Enter student faculty: ");
                                String faculty = scanner.nextLine();
                                System.out.print("Enter student program study: ");
                                String programStudy = scanner.nextLine();
                                admin.addStudent(name, nim, faculty, programStudy);
                                break;
                            case 2:
                                System.out.println("\n-- Input Book --");
                                admin.inputBook(books);
                                break;
                            case 3:
                                admin.displayBooks(books);
                                break;
                            case 4:
                                admin.logout();
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (adminChoice!= 4);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice!= 3);
        scanner.close();

    }

    // Method untuk mencari buku berdasarkan ID
    private static Book findBookById(ArrayList<Book> books, String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }
}