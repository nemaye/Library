package library.issueManagement;

import java.util.List;
import java.util.ArrayList;

import admin.AdminControl;
import library.bookManagement.Book;
import library.patron.Patron;

public class IssueBook extends Patron{

    public IssueBook(int id, String name, String address, String phone) {
        super(id, name, address, phone);
        //TODO Auto-generated constructor stub
    }

    public IssueBook(Patron patron) {
        super(patron);
        //TODO Auto-generated constructor stub
    }

    private String issueDate;
    private String returnDate;


    @SuppressWarnings("unchecked")
    public void assignBook(Book book, Patron patron){
        if(book.isAvailaible()){
            book.setCopies(book.getCopies()-1);
            patron.setActiveBooks(book);
            System.out.println("Book is assigned to "+patron.getName());
        }else {
            System.out.println("Book is not available");
        }
    }

    public void assign(String title, Patron patron){
        for(Book book: AdminControl.books){
            if(book.getTitle().equals(title)){
                assignBook(book, patron);
            }
        }
    }

    public void returnBook(Book book, Patron patron){}

}