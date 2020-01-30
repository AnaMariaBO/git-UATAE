<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("nombre")!=null) {%>

<jsp:useBean id="e1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="e1"/>
<jsp:forward page="control?op=1"></jsp:forward>
<%} %>
<form action="altacontacto.jsp" method="post">
ID: <input type="text" name="id"/><br>
Nombre: <input type="text" name="nombre"/><br>
Email: <input type="text" name="email"><br>
Telefono: <input type="text" name="telefono"><br>
<input type="submit" value="alta"/>
</form>

</body>
</html>