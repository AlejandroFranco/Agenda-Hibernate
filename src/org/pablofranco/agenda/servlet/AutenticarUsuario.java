package org.pablofranco.agenda.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.pablofranco.bean.Usuario;
import org.pablofranco.db.Conexion;

@WebServlet("/AutenticarUsuario")

public class AutenticarUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		List<Object> usuarios = Conexion.getInstancia().autenticar(req.getParameter("txtNombre"),req.getParameter("txtPassword"));
		if(usuarios!=null && usuarios.size()>0){
			//Creo sesion
			HttpSession sesion=req.getSession(true);
			sesion.setAttribute("usuario", (Usuario)usuarios.get(0));
			
			despachador=req.getRequestDispatcher("admin/dashboard.jsp");
		}else{
			req.setAttribute("error", "verifica tus credenciales");
			despachador=req.getRequestDispatcher("index.jsp");
		}
		despachador.forward(req, resp);
	}

}
