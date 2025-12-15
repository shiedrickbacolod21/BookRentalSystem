package library;

import java.util.ArrayList;

public class BookRentalSytem {

    public static ArrayList<Book> library = new ArrayList<>();

    public static void addBooks() {
        library.add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien",
                1954));
        library.add(
                new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
        library.add(
                new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
        library.add(new NonFictionBook("Guns, Germs, and Steel",
                "Jared Diamond ", 1997));

    }

    public static void rentBooks() {
        library.get(0).rent();
        library.get(2).rent();

    }

    public static void displayAllBooks() {
        for (Book book : library) {
            System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t"
                    + book.getYearPublished());
        }
    }

    public static void displayRentedBooks() {
        System.out.println("Books rented:");
        for (Book book : library) {
            if (book.isRented()) {
                System.out.println(book.getTitle() + "\t" + book.getAuthor()
                        + "\t" + book.getYearPublished());
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        
        System.out.println("Book Rental System");
        addBooks();
        
        displayAllBooks();
        
        rentBooks();
        
        System.out.println();
        displayRentedBooks();

    }

}
