package books;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int stock;


    public Book(String bookId, String title, String author, int stock) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.stock = stock;

            }

    public Book(String s1, String bookId, String s) {

    }


    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }
    public String inputBook() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
            }
    @Override
    public String toString() {
        return "[" + bookId + "] " + title;
    }
}

