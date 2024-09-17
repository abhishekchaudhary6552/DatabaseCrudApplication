package factory.classes;
import Application.DatabaseLayer.*;
public class DatabaseObjectProvider {
private static TaskPerfomer obj;
	static {
		obj = new TaskPerfomer();
	}
	
	public static TaskPerfomer getTaskObject()
	{
		return obj;
	}
	
}
