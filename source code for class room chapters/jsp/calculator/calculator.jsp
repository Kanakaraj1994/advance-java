<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int v=Integer.parseInt(request.getParameter("hil"));
int v2=Integer.parseInt(request.getParameter("hil2"));
out.println("sum is:"+(v+v2));
%>
</body>
</html>
