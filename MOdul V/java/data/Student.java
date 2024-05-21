package data;

import books.Book;
import exception.custom.IllegalAdminAccess;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String nim;
    private String faculty;
    private String programStudy;
    private ArrayList<Book> borrowedBooks;

    public Student(String jeneng, String nim) {
        this.name = jeneng;
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
        System.out.println("Kmau Berhasil Mengembalikan " + book.getTitle() + ".");
    }

    public void logout() {
        System.out.println("Mahasiswa logged out.");
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Menu:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Show borrowed books");
            System.out.println("3. Return a book");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("List of available books:");
                        int i = 1;
                        for (Book book : getBook()) {
                            System.out.println(i + ". " + book.getTitle());
                            i++;
                        }
                        choiceBook(getBook());
                        break;
                    case 2:
                        showBorrowedBooks();
                        break;
                    case 3:
                        System.out.print("Enter the title of the book you want to return: ");
                        String title = scanner.nextLine();
                        Book bookToReturn = null;
                        for (Book book : borrowedBooks) {
                            if (book.getTitle().equals(title)) {
                                bookToReturn = book;
                                break;
                            }
                        }
                        if (bookToReturn == null) {
                            throw new IllegalAdminAccess("Book not found in borrowed books.");
                        }
                        returnBooks(bookToReturn);
                        break;
                    case 4:
                        logout();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalAdminAccess e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private ArrayList<Book> getBook() {
        return null;
    }

    public void borrowBook(ArrayList<Book> books) {
        if (borrowedBooks.size() >= 3) {
            System.out.println("You have reached the maximum number of books you can borrow.");
            return;
        }

        if (books.isEmpty()) {
            System.out.println("There are no available books to borrow.");
            return;
        }

        System.out.println("Available books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, books.get(i).getTitle());
        }

        System.out.print("Enter the number of the book you want to borrow: ");
        Scanner scanner = new Scanner(System.in);
        int bookChoice = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (bookChoice >= 0 && bookChoice < books.size()) {
            Book bookToBorrow = books.get(bookChoice);
            borrowedBooks.add(bookToBorrow);
            books.remove(bookChoice);
            System.out.println("You have successfully borrowed " + bookToBorrow.getTitle() + ".");
        } else {
            System.out.println("Invalid book choice.");
        }

    }
    
    public String getNIM() {
        return nim;
    }
}



