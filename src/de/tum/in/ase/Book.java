package de.tum.in.ase;

/**
 * Book class
 */
public class Book {
    private String title;
    private String author;

    /**
     * Creates a new Book instance
     * @param title - title of the book
     * @param author - author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Gets the title of the book
     * @return - title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book
     * @param title - title to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book
     * @return - author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book
     * @param author - author to be set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Shows EQUALITY between
     * @param o - The Object to compare to
     * @return - Whether the Object is the same.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        return this.title.equals(book.getTitle()) && this.author.equals(book.getAuthor());
    }

    /**
     * This is an auto-generated hashCode Method. The same Object always returns the same hashCode. But multiple
     * elements may return the same hashCode. Same hashCode IS NOT EQUALITY!
     * @return the HashCode of the Book
     */
    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}
