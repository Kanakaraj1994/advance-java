package com.dewana;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hiddenformfield
 */
@WebServlet("/hiddenformfield")
public class hiddenformfield extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s=request.getParameter("name");
		System.out.println("hi im first severlet");
		out.print("hi welcome  "+s);
		//out.print("<a href='servelet_url2?user="+s+"'>  clik me to go to next servelet</a> "+s);
		out.print("<html><body>"+
				"<form action=\"hiddenformfield2\" >"
				+"<input type=\"hidden\" name=\"name\" value="+s+"><br>"
				+"<input type=\"submit\">"
				+"</form >"
				+"</body></html>"
				);
		
		
		
		
	}
	
	

}
