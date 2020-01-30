<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
Datos: <%=e1.toString() %>
<%= request.getAttribute("mensaje") %>

</body>
</html>