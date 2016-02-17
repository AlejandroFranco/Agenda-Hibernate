package org.pablofranco.agenda.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pablofranco.bean.Contacto;
import org.pablofranco.db.Conexion;

/**
 * Servlet implementation class ServletEditarContacto
 */
@WebServlet("/ServletEditarContacto")
public class ServletEditarContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Contacto contacto = new Contacto(0,
				req.getParameter("txtNombre"),
				req.getParameter("txtApellido"),
				Integer.parseInt(req.getParameter("txtTelefonoCasa")),
				Integer.parseInt(req.getParameter("txtTelefonoCelular")),
				req.getParameter("txtCorreo"),
				req.getParameter("txtDireccion"),
				0);
		
		Conexion.getInstancia().editar(contacto);
		despachador=req.getRequestDispatcher("ServletListarContactos.do");
		despachador.forward(req, resp);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
