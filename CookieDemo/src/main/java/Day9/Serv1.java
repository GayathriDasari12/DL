package Day9;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.*;
import javax.servlet.*
import javax.servlet.http.*;

/**
 * Servlet implementation class Day01
 */
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
	{
		
		Cookie cookie = new Cookie("token","kafkj"); // new Cookie("token","value") value takes only string here
		resp.addCookie(cookie); // sending cookie
		
		PrintWriter out = resp.getWriter();//getWriter() will return a printwriter obj		
		out.print("<html> <a href='./f2'> Second Servlet</a> <html>");//sending anchor tag to redirect to second serv from ui
		
		
	}
    

}
