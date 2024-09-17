package Database.serviceLayer;

public interface Serviceable {
	public String add(StudentBean std);
	public String delete (StudentBean std);
	public String search(StudentBean std);
	public String update(StudentBean std);

}
