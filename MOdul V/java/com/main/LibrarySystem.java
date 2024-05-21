package com.main;

import books.Book;
import data.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        // Initialize students ArrayList
        students.add(new Student("Ahmad", "55555"));
        students.add(new Student("Ahmaad", "555555"));

        // Initialize books ArrayList
        books.add(new Book("1", "One Piece", "oda"));
        books.add(new Book("2", "LAskar Pelangi", "dia"));
        books.add(new Book("3", "Manusia", "Lopa"));

        System.out.println("Library System\n");

        int option = 0;
        while (option != 3) {
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit\n");
            System.out.print("Choose option (1-3): ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("\nEnter your NIM: ");
                    String NIM = scanner.nextLine();
                    Student student = findStudent(students, NIM);
                    if (student != null) {
                        System.out.println("Successful Login as Student\n");
                        int choice = 0;
                        while (choice != 5) {
                            System.out.println("1. Borrow a book");
                            System.out.println("2. Return a book");
                            System.out.println("3. View borrowed books");
                            System.out.println("4. Logout");
                            System.out.println("5. Exit\n");
                            System.out.print("Choose option (1-5): ");
                            choice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            switch (choice) {
                                case 1:
                                    // Borrow a book
                                    break;
                                case 2:
                                    // Return a book
                                    break;
                                case 3:
                                    // View borrowed books
                                    break;
                                case 4:
                                    System.out.println("Logout\n");
                                    break;
                                case 5:
                                    System.out.println("GoodBye");
                                    return;
                                default:
                                    System.out.println("\nInvalid option\n");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("User Not Found\n");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter your username(admin): ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password(admin): ");
                    String password = scanner.nextLine();

                    if (username.equals("Admin") && password.equals("admin")) {
                        System.out.println("\nSuccessful Login as Admin\n");
                        int adminChoice = 0;
                        while (adminChoice != 3) {
                            System.out.println("1. Add a book");
                            System.out.println("2. Remove a book");
                            System.out.println("3. Logout\n");
                            System.out.print("Choose option (1-3): ");
                            adminChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            switch (adminChoice) {
                                case 1:
                                    // Add a book
                                    System.out.print("Enter book ID: ");
                                    String newBookID = scanner.nextLine();
                                    System.out.print("Enter book title: ");
                                    String newBookTitle = scanner.nextLine();
                                    System.out.print("Enter book author: ");
                                    String newBookAuthor = scanner.nextLine();
                                    books.add(new Book(newBookID, newBookTitle, newBookAuthor));
                                    System.out.println("Book added successfully\n");
                                    break;
                                case 2:
                                    // Remove a book
                                    System.out.print("Enter book ID to remove: ");
                                    String removeBookID = scanner.nextLine();
                                    Book bookToRemove = findBook(books, removeBookID);
                                    if (bookToRemove != null) {
                                        books.remove(bookToRemove);
                                        System.out.println("Book removed successfully\n");
                                    } else {
                                        System.out.println("Book not found\n");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Logout\n");
                                    break;
                                default:
                                    System.out.println("\nInvalid option\n");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("\nUser Not Found!!\n");
                    }
                    break;
                case 3:
                    System.out.println("\nGoodBye");
                    break;
                default:
                    System.out.println("\nInvalid option\n");
                    break;
            }
        }
        scanner.close();
    }

    private static Student findStudent(ArrayList<Student> students, String NIM) {
        for (Student student : students) {
            if (student.getNIM().equals(NIM)) {
                return student;
            }
        }
        return null;
    }

    private static Book findBook(ArrayList<Book> books, String bookID) {
        for (Book book : books) {
            if (book.getBookId().equals(bookID)) {
                return book;
            }
        }
        return null;
    }
}