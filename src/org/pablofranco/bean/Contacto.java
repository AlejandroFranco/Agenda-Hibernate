package org.pablofranco.bean;

public class Contacto {
	
private Integer idContacto;
private String  nombre;
private String  apellido;
private Integer telefonoCasa;
private Integer telefonoCelular;
private String correo;
private String  direccion;
private Integer idUsuario;

public Integer getIdContacto() {
	return idContacto;
}
public void setIdContacto(Integer idContacto) {
	this.idContacto = idContacto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Integer getTelefonoCasa() {
	return telefonoCasa;
}
public void setTelefonoCasa(Integer telefonoCasa) {
	this.telefonoCasa = telefonoCasa;
}
public Integer getTelefonoCelular() {
	return telefonoCelular;
}
public void setTelefonoCelular(Integer telefonoCelular) {
	this.telefonoCelular = telefonoCelular;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Integer getIdUsuario() {
	return idUsuario;
}
public void setIdUsuario(Integer idUsuario) {
	this.idUsuario = idUsuario;
}
public Contacto(Integer idContacto, String nombre, String apellido, Integer telefonoCasa, Integer telefonoCelular,
		String correo, String direccion, Integer idUsuario) {
	super();
	this.idContacto = idContacto;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefonoCasa = telefonoCasa;
	this.telefonoCelular = telefonoCelular;
	this.correo = correo;
	this.direccion = direccion;
	this.idUsuario = idUsuario;
}
public Contacto() {
	super();
	// TODO Auto-generated constructor stub
}

}
