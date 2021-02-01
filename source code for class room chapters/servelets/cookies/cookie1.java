package serveletui.gi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class name
 */
@WebServlet("/name")
public class name extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("na1");
		
		Cookie val=new Cookie("user_name",name);
		response.addCookie(val);
		
		out.println("<html><body>");
		out.println("<h1>welcome to first page:</h1>"+name);
		
		
		out.println("<h1><a href='name2'>go to servelet two</a></h1>");
		out.println("</body></html>");
		//out.println(v);
		//System.out.println("hi im ver");
	
	}

}
