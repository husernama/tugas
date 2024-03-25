public class Book {
    private String bookid;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;

    public Book(String bookid, String title, String author, String category, int stock, int duration) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
 }

class HistoryBook extends Book {

    public HistoryBook(String bookid, String title, String author, String category, int stock, int duration) {
        super(bookid, title, author, category, stock, duration);

    }


}

class TextBook extends Book {

    public TextBook(String bookid, String title, String author, String category, int stock, int duration) {
        super(bookid, title, author, category, stock, duration);

    }

    }

class StoryBook extends Book {

    public StoryBook(String bookid, String title, String author, String category, int stock, int duration) {
        super(bookid, title, author, category, stock, duration);

    }

}