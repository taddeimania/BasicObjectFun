/**
 * Created by taddeimania on 7/18/17.
 */
public class Book {
    private int pages;
    private String title;
    private Author author;

    public Book(String title, Author author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }
}
