package Database.serviceLayer;
import factory.classes.*;
import Application.DatabaseLayer.*;
public class Service implements Serviceable {
	public String add(StudentBean std)
	{
	TaskPerfomer obj = DatabaseObjectProvider.getTaskObject();
	
	String Status = obj.add(std);
	return Status;
		
	}
	public String delete(StudentBean std)
	{
		TaskPerfomer obj = DatabaseObjectProvider.getTaskObject();
		String status = obj.delete(std);
		return status;
	}
public String search(StudentBean std)
{
	TaskPerfomer obj = DatabaseObjectProvider.getTaskObject();
	String status = obj.search(std);
	return status;
}
public String update (StudentBean std )
{
	TaskPerfomer obj = DatabaseObjectProvider.getTaskObject();
	String status = obj.update(std);
	return status;
}
}
