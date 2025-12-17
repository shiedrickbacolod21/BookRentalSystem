package library;

public class Book {
    /**
     * initializing title.
     */
    private String title;
    /**
     * initializing author.
     */
    private String author;
    /**
     * initializing yearPublished.
     */
    private int yearPublished;
    /**
     * initializing isRented.
     */
    private boolean isRented;

    /**
     *
     * @param tTitle
     * @param aAuthor
     * @param yYearPublished
     */
    // Constructor initialize
    public Book(final String tTitle,
            final String aAuthor,
            final int yYearPublished) {
        this.title = tTitle;
        this.author = aAuthor;
        this.yearPublished = yYearPublished;
        this.isRented = false;
    }

    /**
     *
     * @return title
     */
    public final String getTitle() {
        return title;
    }

    /**
     *
     * @return author
     */
    public final String getAuthor() {
        return author;
    }

    /**
     *
     * @return yearPublished
     */
    public final int getYearPublished() {
        return yearPublished;
    }

    /**
     *
     * @return isRented
     */
    public final boolean isRented() {
        return isRented;
    }

    /**
     *
     */
    public final void rent() {
        this.isRented = true;
    }

}
