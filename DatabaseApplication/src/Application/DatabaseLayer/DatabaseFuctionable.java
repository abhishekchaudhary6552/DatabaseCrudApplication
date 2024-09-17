package Application.DatabaseLayer;
import Database.serviceLayer.*;
public interface DatabaseFuctionable {
public String add(StudentBean std);
public String delete(StudentBean std);
public String search(StudentBean std);
public String update(StudentBean std);
}
