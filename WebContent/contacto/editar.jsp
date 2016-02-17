<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar un Contacto</title>
</head>
<body>
	<form action="../ServletEditarContacto.do" method="get">
		<input type="hidden" name="txtIdContacto" value="${contacto.getIdContacto()}">
		Nombre: <input type="text" name="txtNombre" value="${contacto.getNombre()}">
		Apellido: <input type="text" name="txtApellido" value="${contacto.getApellido()}">
		Telefono Casa: <input type="text" name="txtTelefonoCasa" value="${contacto.getTelefonoCasa()}">
		Telefono Celular: <input type="text" name="txtTelefonoCelular" value="${contacto.getTelefonoCelular()}">
		Correo: <input type="text" name="txtCorreo" value="${contacto.getCorreo()}">
		Direccion: <input type="text" name="txtDireccion" value="${contacto.getDireccion()}">
		<input type="submit" value="Agregar">
	</form>
</body>
</html>