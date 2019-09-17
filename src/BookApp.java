import java.util.List;
import java.util.Scanner;

public class BookApp {

    double price = 0.0;
    //String title;

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

    // Overloaded method to return the price of books requested
//    public double getPrice(Book book, String title) {
//        if (title.equalsIgnoreCase(book.getTitle())) {
//            price = book.getPrice();
//        }
//        return price;
//    }

    // Overloaded method to return the price of books requested
//    public double getPrice(String title, int number){
//        price = getPrice();
//        }


    public static void main(String[] args) {

        String title;
        int numBooks;
        double price;
        Book book = new Book();
        BookDatabase bd = new BookDatabase();
        List<Book> myBooks = bd.getBooks();
        getDisplayText(myBooks);

        BookApp bookApp = new BookApp();
        System.out.println("\n************************");
        System.out.println("Total Price: " + bookApp.getPrice(myBooks));
        System.out.println("************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of books");
        numBooks = input.nextInt();
        input.nextLine();
        System.out.println("Enter book title");
        title = input.nextLine();



            price = bd.getBookPrice(title)* numBooks;
            System.out.println("Total price now is : " + price);

    }
}

