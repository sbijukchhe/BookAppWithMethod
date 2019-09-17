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

    public double getBookPrice(String title){
        for (Book myBook : books){
            if (title.equalsIgnoreCase((book.getTitle()))){
                price = myBook.getPrice();
                break;
            }
            return price;
        }
       return 0;
    }
}

