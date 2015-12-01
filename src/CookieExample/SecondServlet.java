package CookieExample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CookieServletsecond", urlPatterns = { "/Cookieservlet2" })
public class SecondServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response){
	try{

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	Cookie ck[]=request.getCookies();
	out.print("Hello "+ck[0].getValue());
	out.print("Hello "+ck[1].getValue());
	
	out.close();

         }catch(Exception e){System.out.println(e);}
	}
	

}
