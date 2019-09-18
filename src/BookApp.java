import java.util.List;
import java.util.Scanner;

public class BookApp {


    public static void main(String[] args) {

        String title;
        int numBooks;
        String response = "";

        Book book = new Book();
        BookDatabase bd = new BookDatabase();
        List<Book> myBooks = bd.getBooks();
        bd.getDisplayText(myBooks);

        System.out.println("\n*******************************************************");
        System.out.println("Total Price of books in the list : " + bd.getPrice(myBooks));
        System.out.println("********************************************************");

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to check the price of book? Y/N ");
        response = input.nextLine();

        while(!(response.equalsIgnoreCase("N"))) {

            if (!(response.equalsIgnoreCase("N"))) {
                System.out.println("Enter number of books");
                numBooks = input.nextInt();
                input.nextLine();
                System.out.println("Enter book title - Head First Java, Thinking in Java, " +
                        "OCP: Oracle Certified Professional Java SE, Automate the Boring Stuff with Python");
                title = input.nextLine();

                double bPrice = numBooks * bd.getBookPrice(title);
                System.out.println("Total price now is : " + bPrice);
                System.out.println("--------------------------------");
            }
            System.out.println("\nDo you want to continue? Y/N");
            response = input.nextLine();
        }
    }
}

