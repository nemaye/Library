package library.bookManagement;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private int year;
    private int pages;
    private String ISBN;
    private int copies;

    public Boolean isAvailaible() {
        return copies > 0;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Book(String title, String author, Genre genre, int year, int pages, String ISBN, int copies) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
        this.ISBN = ISBN;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", author=" + author + ", copies=" + copies + ", genre=" + genre + ", pages="
                + pages + ", title=" + title + ", year=" + year + "]";
    }
}
