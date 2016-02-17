<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="../include/validarsesion.jsp" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DASHBOARD ADMIN</title>
</head>
<body>
	BIENVENIDO ${usuario.getNombre()}
	<a href="ServletCerrarSesion.do">Cerrar Sesion</a>
	<a href="ServletListarContactos.do">Operaciones sobre Contactos</a>
</body>
</html>