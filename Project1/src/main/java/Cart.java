import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        HttpSession session = request.getSession(false);  

if(session!=null)
{       String name= (String) session.getAttribute("name");
		int p1=Integer.parseInt(request.getParameter("p1"));
		int r1=Integer.parseInt(request.getParameter("r1"));
		
		int p2=Integer.parseInt(request.getParameter("p2"));
		int r2=Integer.parseInt(request.getParameter("r1"));
		
		int p3=Integer.parseInt(request.getParameter("p3"));
		int r3=Integer.parseInt(request.getParameter("r1"));
		
		
		int total=(p1*r1)+(p2*r2)+(p3*r3);
		out.print("Hi, "+name);
		out.println(" total price is " + total);
        out.close();  
    }else {
    	out.print("You ar not logged in");
}
	
}
}
