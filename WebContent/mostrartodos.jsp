<%@page import="app.modelo.Contacto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<%ArrayList<Contacto> todos=(ArrayList<Contacto>) request.getAttribute("todos");
%>
<table>
<tr>
<th>Id Contacto</th>
<th>Nombre</th>
<th>Email</th>
<th>Telefono</th>
</tr>
<%
	for(Contacto e : todos){
%>
<tr>
<td><%=e.getId() %>
<td><%=e.getNombre() %>
<td><%=e.getEmail() %>
<td><%=e.getTelefono() %>
</tr>
<%} %>
</table>
</body>
</html>