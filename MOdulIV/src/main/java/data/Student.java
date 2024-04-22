package data;

import books.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String nim;
    private String faculty;
    private String programStudy;
    private ArrayList<Book> borrowedBooks;

    public Student(String name, String nim, String faculty, String programStudy) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudy = programStudy;
        this.borrowedBooks = new ArrayList<>();
    }

    public void choiceBook(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("List of available books:");
            int i = 1;
            for (Book book : books) {
                System.out.println(i + ". " + book.getTitle());
                i++;
            }

            System.out.println("Enter the number of the book you want to borrow or 0 to exit:");
            choice = scanner.nextInt();

            if (choice > 0 && choice <= books.size()) {
                Book selectedBook = books.get(choice - 1);
                borrowBook(selectedBook, books);
            }
        } while (choice!= 0);

        System.out.println("Thank you for using the library. Goodbye!");
        scanner.close();
    }

    public void borrowBook(Book book, ArrayList<Book> books) {
        borrowedBooks.add(book);
        books.remove(book);
        System.out.println("You have successfully borrowed " + book.getTitle() + ".");
    }

    public void showBorrowedBooks() {
        System.out.println("List of borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void returnBooks(Book book) {
        borrowedBooks.remove(book);
        System.out.println("You have successfully returned " + book.getTitle() + ".");
    }

    public void logout() {
        System.out.println("Student logged out.");
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}