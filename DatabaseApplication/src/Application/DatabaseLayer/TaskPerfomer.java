package Application.DatabaseLayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import Database.serviceLayer.*;
import factory.classes.*;
public class TaskPerfomer implements DatabaseFuctionable {

	@Override
	public String add(StudentBean std ) {
		String status ="";
		try
		{
		Connection connect = ConnectionProvider.connect();
		Statement statement = connect.createStatement();
				ResultSet rs = statement.executeQuery("select * from student where regno="+std.getId()+";");
	boolean check = rs.next();
	if(check ==true)
	{
		status ="Student Already Existed ";
	}
	else
	{
		int updatecount = statement.executeUpdate("insert into student value('"+std.getName()+"',"+std.getId()+",'"+std.getCourse()+"');");
	if(updatecount == 1)
	{
		status = "STUDENT REGISTERED SUCCESSFULLY ";
	}
	else 
	{
		status ="SOMETHING WENT WRONG";
	}
	}
	
	}
	
	catch(Exception e )
	{
		status ="SOMETHING WENT WRONG ";
	}
		return status;
}
	public String delete (StudentBean std )
	{
		String status ="";
		try {
		Connection connect = ConnectionProvider.connect();
		Statement statement = connect.createStatement();
	

		ResultSet rs = statement.executeQuery("select * from student where regno="+std.getId()+";");
		boolean check = rs.next();
		if(check == true)
		{
			int updatecount = statement.executeUpdate("delete from student where regno="+std.getId()+";");
			if(updatecount == 1)
			{
				status = "STUDENT DELETED FROM RECORDS  ";
			}
			else 
			{
				status ="SOMETHING WENT WRONG";
			}
		}
		else
		{
			status ="PLEASE CHECK STUDENT ID AND TRY AGAIN ";
		}
		}
		catch(Exception e)
		{
			
		}
		return status;
	}
	public String search(StudentBean std)
	{
		String status ="";
		try {
		Connection connect = ConnectionProvider.connect();
		Statement statement = connect.createStatement();
	

		ResultSet rs = statement.executeQuery("select * from student where regno="+std.getId()+";");
		boolean check = rs.next();
		if(check==true)
		{
			status=status+ "NAME          "+rs.getString("name");
			status=status+"\n";
			status=status+"ID             "+rs.getInt("regno");
			status=status+"\n";
			status=status+"COURSE         "+rs.getString("course");
		}
		else 
		{
			status ="SOMETHING WENT WRONG ";
		}
		}
		catch(Exception e)
		{
			status="exception occurs ";
		}
		return status;
	}
	public String update(StudentBean std)
	{
		String status ="";
		try {
		Connection connect = ConnectionProvider.connect();
		Statement statement = connect.createStatement();
	

		ResultSet rs = statement.executeQuery("select * from student where regno="+std.getId()+";");
		boolean check = rs.next();
		if(check == true)
		{
			int updatecount = statement.executeUpdate("update student set name ='"+std.getName()+"',course='"+std.getCourse()+"' where regno="+std.getId()+";");
			if(updatecount == 1)
			{
				status = "STUDENT UPDATED SUCCESSFULLY	 ";
			}
			else 
			{
				status ="SOMETHING WENT WRONG";
			}
		}
		else
		{
			status ="PLEASE CHECK STUDENT ID AND TRY AGAIN ";
		}
		}
		catch(Exception e)
		{
			
		}
		return status;
	}
}
