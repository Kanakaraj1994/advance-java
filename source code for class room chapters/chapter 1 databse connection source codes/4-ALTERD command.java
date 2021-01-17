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
				
				
				
				oensconnections.execute("CREATE DATABASE IF NOT EXISTS testp");//database exits 
				 oensconnections.execute("USE testp");
		           /**
		            * Create and select a database for use. 
		            */
				 oensconnections.execute("DROP TABLE IF EXISTS people");
				 oensconnections.execute("CREATE TABLE people (" +
		                   "id BIGINT NOT NULL AUTO_INCREMENT,"
		                   + "fname VARCHAR(25),"
		                   + "lname VARCHAR(25),"
		                   + "PRIMARY KEY(id)"
		                   + ")");
				 oensconnections.execute(" ALTER TABLE people ADD COLUMN phone_no int(20)" );
				 
				 
				 System.out.println("data base created and table created and ulterd");
				  
				 con.close();
		           
			 }catch(Exception e) {
				 
				 e.printStackTrace();
			 }
		   }	
	
		
		
		
		
		
		
	

}
