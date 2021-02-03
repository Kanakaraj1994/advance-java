<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@page import = "java.sql.*"
 
  %>
<%

String driver="com.mysql.jdbc.Driver";

String url="jdbc:mysql://localhost:3306/";
String id="root";
String password="";
try {
	
	
	
	Class.forName(driver);
	 Connection con = DriverManager.getConnection(url, id, password);//three overloaded method im taking 3rd 3 parameters
		
	 Statement stt = con.createStatement();
	
	stt.execute("CREATE DATABASE IF NOT EXISTS sham12");//database exits 
	
	
	  System.out.println("data base got created");
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  %>
  
  <h1>hjjhhg</h1>
</body>
</html>
