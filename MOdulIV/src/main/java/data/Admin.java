package data;

import books.Book;
import books.HistoryBook;
import books.StoryBook;
import books.TextBook;

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
        Student newStudent = new Student(name, nim, faculty, programStudy);
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
}