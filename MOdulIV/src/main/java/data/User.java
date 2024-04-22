package data;

import books.Book;
import java.util.ArrayList;

abstract class User {
    public void displayBooks(ArrayList<Book> books) {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Stock: " + book.getStock());
            System.out.println("------------------------");
        }
    }
}