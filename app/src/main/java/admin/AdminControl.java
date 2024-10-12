package admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import library.bookManagement.Book;

public class AdminControl {
    public static List<Book> books;

    public AdminControl(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        String total = "\n";
        Iterator<Book> it = books.iterator();
        while(it.hasNext()){
            Book b = it.next();
            total += b.toString();
        }
        return total;
    }
}
