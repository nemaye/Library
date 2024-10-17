package library.patron;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import library.bookManagement.Book;

public class Patron implements UserList{
        
    private int id;
    private String name;
    private String address;
    private String phone;
    protected List<Book> history = new ArrayList<Book>();
    protected List<Book> activeBooks = new ArrayList<Book>();
    public static final HashMap<Integer,Patron> patronMap = new HashMap<>();
    
    public Patron(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;

        patronMap.put(this.id, this);        
    }


    public Patron(Patron patron) {
        this.id = patron.id;
        this.name = patron.name;
        this.address = patron.address;
        this.phone = patron.phone;

        patronMap.put(this.id, patron);
        //TODO Auto-generated constructor stub
    }

    public Patron() {
        // TODO Auto-generated constructor stub
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

    public void setHistory(Book book) {
        history.add(book);
    }

    public void setActiveBooks(Book book) {
        activeBooks.add(book);
    }

    public void removeActiveBooks(Book book){
        activeBooks.remove(book);
    }

    public List<Book> getHistory() {
        return history;
    }

    public List<Book> getActiveBooks() {
        return activeBooks;
    }

    public Patron getObjPatron(int patronId){
        return patronMap.get(patronId);
    }

    @Override
    public void addPatronToList(Patron patron) {
        // TODO Auto-generated method stub
        patronsList.add(patron);
    }


    @Override
    public List<Patron> getPatrons() {
        // TODO Auto-generated method stub
        return patronsList;
    }


    @Override
    public Boolean patronExists(int id) {
        // TODO Auto-generated method stub
        for(Patron patron: patronsList){
            if(patron.getId() == id){
                return true;
            }
        }
        return false;
    }

}
