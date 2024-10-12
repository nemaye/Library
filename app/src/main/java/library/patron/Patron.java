package library.patron;

import java.util.List;

import library.bookManagement.Book;

public class Patron {
        
    private int id;
    private String name;
    private String address;
    private String phone;
    private List<Book> history;
    private List<Book> activeBooks;
    
    public Patron(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public Patron(Patron patron) {
        this.id = patron.id;
        this.name = patron.name;
        this.address = patron.address;
        this.phone = patron.phone;
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHistory(List<Book> history) {
        this.history = history;
    }

    public void setActiveBooks(List<Book> activeBooks) {
        this.activeBooks = activeBooks;
    }

    public List<Book> getHistory() {
        return history;
    }

    public List<Book> getActiveBooks() {
        return activeBooks;
    }


}
