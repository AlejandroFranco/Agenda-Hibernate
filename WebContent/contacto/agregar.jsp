<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar un nuevo Contacto</title>
</head>
<body>
	<form action="../ServletAgregarContacto.do" method="get">
		Nombre: <input type="text" name="txtNombre">
		Apellido: <input type="text" name="txtApellido">
		Telefono Casa:<input type="text" name="txtTelefonoCasa">
		Telefono Celular: <input type="text" name="txtTelefonoCelular">
		Correo: <input type="text" name="txtCorreo">
		Direccion:<input type="text" name="txtDireccion">
		<input type="submit" value="Agregar">
	</form>
</body>
</html>