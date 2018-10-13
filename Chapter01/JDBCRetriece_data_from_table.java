package Data;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.spi.DirStateFactory.Result;

class Database1
{
  public static void main(String []args)
  {
	try{
	      
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test",
	    		  "","");
	      Statement s=con.createStatement();	//creating statement
	      ResultSet rs=s.executeQuery("select * from employee");	//executing statement
	      while(rs.next()){
	         System.out.println(rs.getString(1));
	      }
	      con.close();	//closing connection
     }
	    catch(Exception e)
	    {
	       e.printStackTrace();
	    }
  }
}


Result:-
Guhan
Anbhu
Karthik
Anbhu
Rajesh

Procedure:-

1. Go to mysql.com to download jdbc driver
   https://dev.mysql.com/downloads/connector/j/
   
2. Create new project Database1

3. Right click the project and create new folder (mysql)

4. Extract your dowloaded mysql jdbc driver

5. Open the mysql jdbc diver folder and find the mysql_connector jar file (copy this file)

6. Right click the mysql folder and paste the mysql connector jar file

7. Right click the jar file --> build path --> configure build path-- add external jars-> open the jar file

Ref:-
https://www.youtube.com/watch?v=CrHZIW9pnnQ

Incase any error:
Ref:

http://www.java67.com/2015/07/javalangclassnotfoundexception-com.mysql.jdbc.Driver-solution.html
