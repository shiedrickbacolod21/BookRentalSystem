package library;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isRented;

    // Constructor initialize
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        this.isRented = true;
    }


}
