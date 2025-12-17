package library;

import java.util.ArrayList;

/**
 * book rental system.
 */
public final class BookRentalSytem {

    private BookRentalSytem() {
        super();
    }

    /**
     * library of books.
     */
    private static ArrayList<Book> library = new ArrayList<>();

    /**
     * @return library
     */
    public static ArrayList<Book> getLibrary() {
        return library;
    }

    /**
     *list of books.
     */
    public static void addBooks() {
        final int year1 = 1954;
        final int year2 = 1960;
        final int year3 = 2000;
        final int year4 = 1997;

        library.add(new FictionBook("The Lord of the Rings",
                "J.R.R. Tolkien", year1));
        library.add(new FictionBook("To Kill a Mockingbird",
                "Harper Lee", year2));
        library.add(new NonFictionBook("The Tipping Point",
                "M. Gladwell", year3));
        library.add(new NonFictionBook("Guns, Germs, and Steel",
                "Jared Diamond ", year4));
    }

    /**
     *rent specific book.
     */
    public static void rentBooks() {
        library.get(0).rent();
        library.get(2).rent();

    }

    /**
     * display all books.
     */
    public static void displayAllBooks() {
        for (Book book : library) {
            System.out.println(book.getTitle() + "\t" + book.getAuthor() + "\t"
                    + book.getYearPublished());
        }
    }

    /**
     * display all rented books.
     */
    public static void displayRentedBooks() {
        System.out.println("Books Rented:");
        for (Book book : library) {
            if (book.isRented()) {
                System.out.println(book.getTitle() + "\t" + book.getAuthor()
                        + "\t" + book.getYearPublished());
            }
        }
    }

    /**
     * clears the library.
     */
    public static void clearLibrary() {
        library.clear();
    }

    /**
     *
     * @return the size of library.
     */
    public static int getLibrarySize() {
        return library.size();
    }

    /**
     *
     * @param args Main Function.
     */
    public static void main(final String[] args) {

        System.out.println("Book Rental System");
        System.out.println("Books Available:");
        addBooks();

        displayAllBooks();

        rentBooks();

        System.out.println();
        displayRentedBooks();

    }

}
