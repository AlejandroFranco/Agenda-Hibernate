<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda Online</title>
</head>
<body>
	<h1>Listado de Contactos</h1>
	<a href="contacto/agregar.jsp">Agregar 	Contacto</a>
	<table>
		<thead>
			<th>NOMBRE</th>
			<th>Apellido</th>
			<th>Telefono Casa</th>
			<th>Telefono Celular</th>
			<th>Correo</th>
			<th>Direccion</th>			
		</thead>
		<tbody>
			<c:forEach items="${listaContactos}" var="contacto" >
				<tr>
					<td>${contacto.getNombre()}</td>
					<td>${contacto.getApellido()}</td>
					<td>${contacto.getTelefonoCasa()}</td>
					<td>${contacto.getTelefonoCelular()}</td>
					<td>${contacto.getCorreo()}</td>
					<td>${contacto.getDireccion()}</td>
					<td><a href="ServletEliminarContacto.do?idContacto=${contacto.getIdContacto()}">Eliminar</a></td>
					<td><a href="ServletCargarContacto.do?idContacto=${contacto.getIdContacto()}">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>