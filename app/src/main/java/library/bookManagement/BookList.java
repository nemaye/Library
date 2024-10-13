package library.bookManagement;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public interface BookList {
    public static final List<Book> books = new ArrayList<Book>();
    void addBookToInventory(Book book);
    List<Book> getBooks();
    Boolean bookExists(String ISBN);
}
