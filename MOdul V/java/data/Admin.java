package data;

import books.Book;
import books.HistoryBook;
import books.StoryBook;
import books.TextBook;
import exception.custom.IllegalAdminAccess;

import java.util.ArrayList;
import java.util.Scanner;


public class Admin extends User {
    private ArrayList<Student> studentList;

    public Admin() {
        this.studentList = new ArrayList<>();

    }

    public void logout() {
        // Admin logout logic
        System.out.println("Admin logged out.");
    }

    public void addStudent(String name, String nim, String faculty, String programStudy) {
        if (nim.length()!= 15) {
            System.out.println("Invalid NIM. Must be 15 characters long.");
            return;
        }
        Student newStudent = new Student(name, nim);
        studentList.add(newStudent);
        System.out.println("Student added successfully.");
    }

    public void inputBook(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter book type (History, Story, Text): ");
        String bookType = scanner.nextLine().toLowerCase();

        Book book;
        switch (bookType) {
            case "history":
                book = new HistoryBook(title, author, stock);
                break;
            case "story":
                book = new StoryBook(title, author, stock);
                break;
            case "text":
                book = new TextBook(title, author, stock);
                break;
            default:
                System.out.println("Invalid book type.");
                return;
        }

        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks(ArrayList<Book> books) {
        super.displayBooks(books);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Input book");
            System.out.println("3. Display books");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter student NIM: ");
                        String nim = scanner.nextLine();

                        System.out.print("Enter student faculty: ");
                        String faculty = scanner.nextLine();

                        System.out.print("Enter student program study: ");
                        String programStudy = scanner.nextLine();

                        addStudent(name, nim, faculty, programStudy);
                        break;
                    case 2:
                        inputBook(getBooks());
                        break;
                    case 3:
                        displayBooks(getBooks());
                        break;
                    case 4:
                        logout();
                        return;
                    default:
                        throw new IllegalAdminAccess("Invalid option.");
                }
            } catch (IllegalAdminAccess e) {
                System.out.println(e.getMessage());
            }
        }
    }
}