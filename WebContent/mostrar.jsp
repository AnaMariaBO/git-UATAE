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
<h1 style="background-color:rgb(106, 90, 205);">Datos:<h1>
ID: <%=e1.getId() %><br>
Nombre: <%=e1.getNombre() %><br>
Email: <%=e1.getEmail() %><br>
Telefono: <%=e1.getTelefono() %><br>
</body>
</html>