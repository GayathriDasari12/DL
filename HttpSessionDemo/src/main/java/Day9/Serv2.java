 package Day9;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class Day01
 */
public class Serv2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
	{
		//Cookie cookies[] = req.getCookies();// getCookies() will return a cookie array
		
		//System.out.println(cookies[0]);// will retun an obj
		//System.out.println(cookies[0].getName()+ "\t" + cookies[0].getValue());
		HttpSession session = req.getSession(false); // because we want to use same session. if it is true it will create a new session. 
		
		Integer i = (Integer) session.getAttribute("token"); // returns an obj
		System.out.println("Token"+ i);
		
		//in http session session is maintained by server side(Adv)
	}
}
