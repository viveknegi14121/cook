package CookieExample;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CookieServletfirst", urlPatterns = { "/Cookieservlet1" })
public class FirstServlet extends HttpServlet {

	@Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
		
	}
	
	
  public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	String n=request.getParameter("userName");
	out.print("Welcome "+n);
	
	Cookie ck=new Cookie("uname",n);//creating cookie object
	Cookie ck1=new Cookie("uname1","abc");
       	response.addCookie(ck);//adding cookie in the response
       	response.addCookie(ck1);
	//creating submit button
	out.print("<form action='Cookieservlet2'>");
	out.print("<input type='submit' value='go'>");
	out.print("</form>");
		
	out.close();

        }catch(Exception e){System.out.println(e);}
  }
}

