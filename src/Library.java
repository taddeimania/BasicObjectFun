import java.util.ArrayList;

/**
 * Created by taddeimania on 7/18/17.
 */
public class Library {

    private ArrayList<Book> collection = new ArrayList<Book>();


    public void addBook(Book book) {
        collection.add(book);
    }

    public void showBooks() {
        for (Book book : collection) {
            System.out.println(book.getTitle());
        }
    }

    public ArrayList<Book> getCollection() {
        return collection;
    }
}
