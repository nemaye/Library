package library.issueManagement;

import java.util.Date;

import admin.AdminControl;
import library.bookManagement.Book;
import library.bookManagement.BookMap;
import library.patron.Patron;
import java.time.LocalDate;

public class IssueBook extends Patron implements BookMap{

    public IssueBook(int id, String name, String address, String phone) {
        super(id, name, address, phone);
        //TODO Auto-generated constructor stub
    }

    public IssueBook(Patron patron) {
        super(patron);
        //TODO Auto-generated constructor stub
    }

    public IssueBook(){

    }


    @SuppressWarnings("unchecked")
    public void assignBook(Book book, Patron patron){
        if(book.isAvailaible()){
            book.setCopies(book.getCopies()-1);
            LocalDate now = LocalDate.now();
            LocalDate then = LocalDate.now().plusDays(7);
            patron.setActiveBooks(book);
            book.setIssueDate(now);
            book.setReturnDate(then);
            System.out.println("issued date: " + book.getIssueDate());
            System.out.println("return date: " + book.getReturnDate());
            System.out.println("Book " + book.getTitle() + " with ISBN " +book.getISBN() + " is assigned to "+patron.getName() + ". User Id: " + patron.getId());
        }else {
            System.out.println("Book is not available");
        }
    }

    public void assign(String isbn, Patron patron){
        for(Book book: AdminControl.books){
            System.out.println("hello");
            if(book.getISBN().equals(isbn)){
                assignBook(book, patron);
            }
        }
    }

    public void assign(int patronId, String isbn){
        
        Book bObj = bookMap.get(isbn);
        Patron pObj = patronMap.get(patronId); 
        assignBook(bObj, pObj);
    }

    public void returnBook(Book book, Patron patron){
        book.setCopies(book.getCopies() + 1);
        patron.removeActiveBooks(book);
        patron.setHistory(book);

    }

    public void returnToLibrary(int patronId, String isbn){
        
        Book bObj = bookMap.get(isbn);
        Patron pObj = patronMap.get(patronId); 
        returnBook(bObj, pObj);
    }

}