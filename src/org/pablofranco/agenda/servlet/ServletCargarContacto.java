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
 * Servlet implementation class ServletCargarContacto
 */
@WebServlet("/ServletCargarContacto")
public class ServletCargarContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Integer id=Integer.parseInt(req.getParameter("idContacto"));
		req.setAttribute("contacto", Conexion.getInstancia().buscar(Contacto.class, id));
		despachador=req.getRequestDispatcher("contacto/editar.jsp");
		despachador.forward(req, resp);
	}

}
