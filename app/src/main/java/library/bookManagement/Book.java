package library.bookManagement;

import java.util.List;
import java.time.LocalDate;


public class Book implements BookList, BookMap {
    private String title;
    private String author;
    private Genre genre;
    private int year;
    private int pages;
    private String ISBN;
    private int copies;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book(){

    }

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

    public int getCopies(String ISBN) {
        for(Book book: books){
            if(book.getISBN().equals(ISBN)){
                return book.getCopies();
            }
        }
        return 0;
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

        addBookToInventory(this);
        bookMap.put(this.ISBN, this);
    }

    public Book(Book book){
        this.title = book.title;
        this.author = book.author;
        this.genre = book.genre;
        this.year = book.year;
        this.pages = book.pages;
        this.ISBN = book.ISBN;
        this.copies = book.copies;    
   
        addBookToInventory(book);
        bookMap.put(this.ISBN, book);
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", author=" + author + ", copies=" + copies + ", genre=" + genre + ", pages="
                + pages + ", title=" + title + ", year=" + year + "]";
    }

    @Override
    public void addBookToInventory(Book book) {
        // TODO Auto-generated method stub
        books.add(book);
    }

    @Override
    public List<Book> getBooks() {
        // TODO Auto-generated method stub
        return books;
    }

    @Override
    public Boolean bookExists(String ISBN) {
        // TODO Auto-generated method stub

        
        for(Book book: books){
            if(book.getISBN().equals(ISBN)){
                return true;
            }
        }
        return false;
    }
}
