/*
Create a project in IntelliJ called BookApplication.

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor and
a method called getDisplayText() which prints the author, title and description.

The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall create an instance of
 a Book and print the Author, Title and Description.

Publish your solution to GitHub and submit your GitHub url as the assignment.


***********************   Add this method to the previous BookApplication ************************************

Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100,
if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide).
 */

public class Book {

    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {
    }

    public Book(String SKU, String title, String author, String description) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public Book(String SKU, String title, String author, String description, double price) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public Book(String SKU, String title, String author, String description, double price, boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "SKU='" + SKU + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isInStock=" + isInStock +
                '}';
    }
}
