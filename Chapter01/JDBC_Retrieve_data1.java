package MyJDBCPackage;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

class Database2
{
  public static void main(String []args)
  {
	try{	      
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test",
	    		  "","");
	      Statement s=con.createStatement();	
	      ResultSet rs=s.executeQuery("select * from employee");
	      while(rs.next()){
	         System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+
	                            rs.getString(3));
	      }
	      con.close();	
     }
	    catch(Exception e)
	    {
	       e.printStackTrace();
	    }
  }
}

Result:-

Guhan   10000   13000
Anbhu   11000   12000
Karthik 14000   12000
Anbhu   13000   15000
Rajesh  15000   12000

Procedure:-

1. Create new project MyJDBC
2. Right click project(MyJDBC) and create new folder (mysql)
3. Right click folder(mysql) --> build path -->Configure Build path --> add external jars --> open mysql driver file 
   (download mysql driver for jdbc from mysql.com )
