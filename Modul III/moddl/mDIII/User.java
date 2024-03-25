import java.util.List;
import java.util.ArrayList;


public class User {
    private Book bookObj;


    public void displayBook() {

        if (bookObj != null) {

             System.out.println("Title: " + bookObj.getTitle());
             System.out.println("Author: " + bookObj.getAuthor());

        } else {
            System.out.println("No book has been added.");
        }
    }

    // Method to add the book
    public void addBook(Book bookObj) {
        // Implement the add book logic here
        this.bookObj = bookObj;
    }

    // Method to get the book
    public Book getBook() {
        return bookObj;
    }

    // Method to set the book
    public void setBook(Book bookObj) {
        this.bookObj = bookObj;
    }
}


class Student {
    private String name;
    private String faculty;
    private String nim;
    private String programStudi;
    private List<BorrowedBook> borrowedBooks;

    public Student(String name, String faculty, String nim, String programStudi) {
        this.name = name;
        this.faculty = faculty;
        this.nim = nim;
        this.programStudi = programStudi;
        this.borrowedBooks = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("\nName: " + this.name);
        System.out.println("Faculty: " + this.faculty);
        System.out.println("NIM: " + this.nim);
        System.out.println("Program Studi: " + this.programStudi);
    }

    public void showBorrowedBooks() {
        System.out.println("\nBorrowed Books: ");
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.println(borrowedBook.getBook().getTitle() + " - " + borrowedBook.getDueDate());
        }
    }

    public void displayBooks() {
        // Display the list of available books
    }

    public void logout() {
        System.out.println("\nLogout successful. Goodbye " + this.name + "!");
    }

    public void returnBooks() {
        // Process the return of borrowed books
    }

    public void borrowBook(BorrowedBook borrowedBook) {
        // Process the borrowing of a book
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public List<BorrowedBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}

class BorrowedBook {
    private Book book;
    private String dueDate;

    public BorrowedBook(Book book, String dueDate) {
        this.book = book;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}



class Admin {
    private String adminUsername;
    private String adminPassword;
    private String[] studentList;

    public Admin(String adminUsername, String adminPassword, String[] studentList) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.studentList = studentList;
    }

    public void addStudent() {
        // Add a new student to the student list
    }

    public void inputBook() {
        // Add a new book to the library
    }

    public void displayBook() {
        // Display the list of available books in the library
    }

    public void displayStudents() {
        System.out.println("Students: ");
        for (String student : studentList) {
            System.out.println(student);
        }
    }

    public boolean isAdmin() {
        // Implement the logic to check if the user is an admin
        return this.adminUsername != null && this.adminPassword != null;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String generate() {
        // Generate a report or a string based on the current state of the `Admin` object
        return "Admin Report";
    }
}


