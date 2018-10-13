import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form1")
public class Form1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException 
	{
		processRequest(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException 
	{
		processRequest(req, res);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String x= req.getParameter("x");
		String y=req.getParameter("y");
		
		int i=Integer.parseInt(x);
		int j=Integer.parseInt(y);
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		out.println(k);
		
   }
	
}
