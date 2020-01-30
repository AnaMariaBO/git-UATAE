<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("id")!=null) {%>

<jsp:useBean id="e1" class="app.modelo.Contacto" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="e1"/>
<jsp:forward page="control?op=2"></jsp:forward>
<%} %>
<form action="bajacontacto.jsp" method="post">
ID: <input type="text" name="id"/><br>
<input type="submit" value="baja"/>
</form>
</body>
</html>