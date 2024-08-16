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
}
