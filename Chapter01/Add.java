import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String x = req.getParameter("x");
		String y =req.getParameter("y");
		
		int i =Integer.parseInt(x);
		int j =Integer.parseInt(y);
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		out.println(k);
		
	}
}

Procedure:-
	
1. right click project
2. New
3. Servlet
4.Class Name: Add--> (i.e Add.java)
5. Finish
6. Type your code and restart the server 
7. Go to browser and check: localhost:8080/web1/index.html
