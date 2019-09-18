import java.util.ArrayList;
import java.util.List;

public class BookDatabase {

    private Book book;
    private List<Book> books;
    double price;

    public BookDatabase() {
        books = new ArrayList<>();

        books.add(new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, true));

        books.add(new Book("Java1002","Thinking in Java","Bruce Eckel",
                "Details about Java under the hood", 20.00, true));

        books.add(new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky",
                "Everything you need to know in one place", 45.00, true));

        books.add(new Book("Python1004","Automate the Boring Stuff with Python","Al Sweigart",
                "Fun with Python", 10.50, true));
    }

    public Book getBook(String SKU){
        for (Book myBook : books){
            if (SKU.equalsIgnoreCase((book.getSKU()))){
                book = myBook;
                break;
            }
        }
        return book;
    }
    public BookDatabase(String SKU){
        this();
        book = getBook(SKU);
    }

    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    // method to return the author, title and description.
    public static void getDisplayText(List<Book> books) {

        for (Book myBook : books) {
            System.out.println();
            System.out.println("Title: " + myBook.getTitle() + "\t\tAuthor: " + myBook.getAuthor() +
                    "\t\tDescription: " + myBook.getDescription());
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    // method to return the total price for books in the list
    public double getPrice(List<Book> books) {

        for (Book myBooks : books) {
            for (int i = 0; i < books.size(); i++) {
                if (myBooks.isInStock() == true) {
                    price += myBooks.getPrice();
                }
            }
        }
        return price;
    }
    // method to return the price for books by title
    public double getBookPrice(String title){
        for (Book myBook : books){
            if (title.trim().equalsIgnoreCase((myBook.getTitle()))){
                price = myBook.getPrice();
            }
        }
        return price;
    }
}

