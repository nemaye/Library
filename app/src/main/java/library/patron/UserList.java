package library.patron;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public interface UserList {

    public static final List<Patron> patronsList = new ArrayList<Patron>();

    void addPatronToList(Patron patron);
    List<Patron> getPatrons();
    Boolean patronExists(int id);
}
