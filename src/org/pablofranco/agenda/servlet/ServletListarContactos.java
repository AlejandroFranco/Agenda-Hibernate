package org.pablofranco.agenda.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pablofranco.db.Conexion;

import javax.servlet.RequestDispatcher;

@WebServlet("/ServletListarContactos")
public class ServletListarContactos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		req.setAttribute("listaContactos", Conexion.getInstancia().listar("From Contacto"));
		despachador=req.getRequestDispatcher("contacto/index.jsp");
		despachador.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
