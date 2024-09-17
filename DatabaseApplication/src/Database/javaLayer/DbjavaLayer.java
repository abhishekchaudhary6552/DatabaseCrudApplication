package Database.javaLayer;
import java.util.Scanner;
import Database.serviceLayer.*;
import factory.classes.ServiceFactory;
import java.io.*;
public class DbjavaLayer {
static {
	System.out.println("===================================================================");
	System.out.println("WELCOME TO MY APPLICATION ");
}
	public static void main(String args []) throws IOException
	{
  
   while (true)
   {
	   System.out.println("=========================================================\n");
	   String name  ="";
	   int id = -1;
	   String course="";
	   String status="";
	   Service service=ServiceFactory.getServiceObject();
	   System.out.println("PRESS 1 FOR ADD STUDENT \nPRESS 2 FOR DELETE STUDENT\nPRESS 3 TO GET STUDENT RECORD \nPRESS 4 FOR UPDATION \nPRESS 5 FOR EXIT  "); 
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int option = Integer.parseInt(br.readLine());
	   switch(option)
	   {
	   case 1: System.out.println("ENTER THE NAME OF THE STUDENT ");
	   name = br.readLine();
	   
	   System.out.println("ENTER THE ID OF THE STUDENT ");
	   id =Integer.parseInt(br.readLine());
	   
	   System.out.println("ENTER THE COURSE OF STUDENT ");
	   course =br.readLine();
	   
	   StudentBean std = new StudentBean();
	   
	   std.setName(name);
	   std.setId(id);
	   std.setCourse(course);
	   
	  
	   
	  status =  service.add(std);
	 System.out.println(status);
	    break;
	    
	    
	   case 2:
		   System.out.println ("ENTER THE ID OF STUDENT TO DELETE RECORD ");
		   StudentBean dlbean = new StudentBean();
		   
		   id = Integer.parseInt(br.readLine());
		   dlbean.setId(id);
		 status=  service.delete(dlbean);
		System.out.println(status);
		break;
		
		
	   case 3: System.out.println("ENTER THE ID OF STUDENT ");
	   id= Integer.parseInt(br.readLine());
	   StudentBean searchbean = new StudentBean();
	   searchbean.setId(id);
	status =   service.search(searchbean);
	System.out.println(status);
	break;
	   case 4:
		   StudentBean updatebean = new StudentBean();
		   System.out.println("ENTER THE ID OF STUDENT FORM UPDATION ");
           id = Integer.parseInt(br.readLine());
		   
		   System.out.println("ENTER THE NEW NAME OF STUDENT ");
		   name=br.readLine();
		   System.out.println("ENTER THE NEW COURSE OF STUDENT ");
		 course =  br.readLine();
		 updatebean.setId(id);
		 updatebean.setName(name);
		 updatebean.setCourse(course);
		 
		 status=  service.update(updatebean);
		System.out.println(status);
		break;
	   case 5: System.exit(0);
	   }
	   
   }
	
	}
}
