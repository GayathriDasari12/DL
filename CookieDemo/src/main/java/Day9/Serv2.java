package Day9;

import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class Day01
 */
public class Serv2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
	{
		Cookie cookies[] = req.getCookies();// getCookies() will return a cookie array
		
		//System.out.println(cookies[0]);// will retun an obj
		System.out.println(cookies[0].getName()+ "\t" + cookies[0].getValue());
		
		
		
	}
}
