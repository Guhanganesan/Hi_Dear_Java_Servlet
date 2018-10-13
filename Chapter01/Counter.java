import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Counter")
public class Counter extends HttpServlet
{
    int i=0;
    
    public void init()//init the first, next it will not call
    {
    	i=1;
    }
    
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
    	
    	PrintWriter out = res.getWriter();
    	
    	out.println("<h2>"+ i +"</h2>");
    	
    	i++;
    	
    }
}
