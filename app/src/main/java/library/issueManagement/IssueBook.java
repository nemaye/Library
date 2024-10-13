package library.issueManagement;

import admin.AdminControl;
import library.bookManagement.Book;
import library.bookManagement.BookMap;
import library.patron.Patron;

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

    private String issueDate;
    private String returnDate;


    @SuppressWarnings("unchecked")
    public void assignBook(Book book, Patron patron){
        if(book.isAvailaible()){
            book.setCopies(book.getCopies()-1);
            patron.setActiveBooks(book);
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

    public void returnBook(Book book, Patron patron){}

}