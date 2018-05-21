<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

The Company Name: &nbsp;<%= session.getAttribute("name") %><br>
The Company Address: &nbsp;<%= session.getAttribute("add") %> <br>
The Company Phone: &nbsp;<%= session.getAttribute("phone") %><br>
<br>
<br>
<hr>

First Number = &nbsp; <%= session.getAttribute("fir") %><br>
Second Number = &nbsp;<%= session.getAttribute("sec") %><br>
<br>
<bold>The Result = &nbsp;</bold>
<%= session.getAttribute("result") %>
</body>
</html>