import java.util.Objects;

public class Book {
    private String titleOfBook;
    private Author author;
    private int publicationYear;

    public Book(String titleOfBook, Author author, int publicationYear) {
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitleOfBook() {
        return this.titleOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return author + "\nНазвание книги - " + this.titleOfBook + "\nГод публикации - " + this.publicationYear + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(titleOfBook, book.titleOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfBook, author, publicationYear);
    }
}
