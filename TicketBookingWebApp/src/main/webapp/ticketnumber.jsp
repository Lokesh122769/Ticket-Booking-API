<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <label> Ticket Number</label>
   <input type="text" value="${ticketnumber}">
   <a href="/getfullticket/${ticketnumber }" >Click here to get Full Ticket Details</a>


</body>
</html>