package com.dewana;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servelet_url1
 */
@WebServlet("/servelet_url1")
public class servelet_url1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servelet_url1() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		out.print("<a href='servelet_url2?user="+s+"'>  clik me to go to next servelet</a> "+s);
		//RequestDispatcher rd= request.getRequestDispatcher("s2");
		//rd.forward(request, response);
	
		
	}

}
