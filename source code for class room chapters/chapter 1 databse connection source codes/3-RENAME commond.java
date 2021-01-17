package sq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hk {

	public static void main(String[] args) {
		
		
		String Driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";//test dbname
		String password= "";
		String userid="root";
		
		
			 try {
				 Class.forName(Driver);//loading driver first
				 //2nd key
				 Connection con = DriverManager.getConnection(url, userid, password);//three overloaded method im taking 3rd 3 parameters
				 Statement oensconnections = con.createStatement();
				// RENAME DATABASE old_db_name TO new_db_name; 
				 oensconnections.execute("RENAME DATABASE testp TO urname");//it gives error
				 
				//oensconnections.execute("CREATE DATABASE  testp");//database exits 
				 //oensconnections.execute("USE urname");
		           /**
		            * Create and select a database for use. 
		            */
				 System.out.println("data base renamed ");
				  
				 con.close();
		           
			 }catch(Exception e) {
				 
				 e.printStackTrace();
			 }
		   }	
	
		
		
		
		
		
		
	

}
