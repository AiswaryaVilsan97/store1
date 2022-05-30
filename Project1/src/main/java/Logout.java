import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
response.setContentType("text/html");  
PrintWriter out=response.getWriter();  
request.getRequestDispatcher("page.html").include(request, response);  
Cookie ck=new Cookie("name","");  
ck.setMaxAge(0);  
response.addCookie(ck);  
out.print("you are successfully logged out!");  
}  
}  