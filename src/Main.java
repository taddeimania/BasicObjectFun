public class Main {

    public static void main(String[] args) {

        Author king = new Author("Stephen King");
        Author rowling = new Author("J.K. Rowling");

        Book theGunslinger = new Book("The Gunslinger", king, 264);
        Book it = new Book("It", king, 345);
        Book harryPotter = new Book("Harry Potter", rowling, 4000);

        Library myLibrary = new Library();
        myLibrary.addBook(theGunslinger);
        myLibrary.addBook(it);
        myLibrary.addBook(harryPotter);

        myLibrary.showBooks();
    }
}
