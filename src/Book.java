import java.util.Objects;

public class Book {

    private int yearPublishing;
    private String publisher;
    private Author author;

    public Book(Author author, String publisher, int yearPublishing) {
        this.yearPublishing = yearPublishing;
        this.publisher = publisher;
        this.author = author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return author + ". Издание: " + publisher + ". " + yearPublishing + "г.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(publisher, book.publisher) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, author);
    }
}
