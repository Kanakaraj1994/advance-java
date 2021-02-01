package serveletui.gi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


/**
 * Servlet implementation class name2
 */
@WebServlet("/name2")
public class name2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
	   try{  
		 
		   
		   response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			
			//getting cookie
			 Cookie[] cooki=request.getCookies();
			   boolean newuser=false;
			   String name="";
			   if(cooki==null) {
				   out.println("<h1>go to home page give ur name again</h1>");  
			   }else {
				   
				   for(Cookie c:cooki) 
				       {
					   String tname=c.getName();
					         if(tname.equals("user_name")) {
					        	 newuser=true;
					        	 name=c.getValue();
					        	 out.println("<h1>hi :</h1>"+name);
					 			out.println("</body></html>");
					 		    response.setContentType("text/html");  
					         }
				       }
				   
			   }
			
			
			
			
			
			
			
			
		     
		      
		    
		  
		    out.close();  
		  
		         }catch(Exception e){System.out.println(e);}  
		    } 
	
	
	

}
