package kachuelitos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// Verifico la session del usuario
		HttpSession session = request.getSession();

		if(session.getAttribute("keyuser") == null){

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();	

			out.println ("<!DOCTYPE html>\n" + "<html>\n" +
					"<head>\n" +
					"<meta charset='ISO-8859-1'>\n" +
					"<title>Registro de Usuario</title>\n" +
					"<link rel='stylesheet' href='styles/page.css' type='text/css'\n" +
					"media='screen' title='no title' charset='utf-8'>\n" +
					"</head>\n" +
					"<body>\n" +
					"<div id='main' align='center'>\n" +
					"<img id='mainlogo' alt='logo' src='images/logo.jpg' width='300px'>\n" +
					"<form action='/Kachuelitos/UserValidation' method='post'>\n" +
					"<fieldset style='width: 300px'>\n" +
					"<legend align='left'>Formulario de registro</legend>\n" +
					"<p class='maincontent'>\n" +
					"DNI <input name='idni' type='number' />\n" +
					"</p>\n" +
					"<p class='maincontent'>\n" +
					"Ubigeo <input name='iubigeo' type='number' />\n" +
					"</p>\n" +
					"<p class='maincontent'>\n" +
					"Correo <input name='iemail' type='email' />\n" +
					"</p>\n" +
					"<p class='maincontent'>\n" +
					"Password <input name='ipassword' type='password' />\n" +
					"</p>\n" +
					"<p class='maincontent'>\n" +
					"<button>Registrarse</button>\n" +
					"</p>\n" +
					"</fieldset>\n" +
					"</form>\n" +
					"</div>\n" +
					"<footer>\n" +
					"<div align='center'>\n" +
					"<hr width='50%'>\n" +
					"<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>\n" +
					"</div>\n" +
					"</footer>\n" +
					"</body>");
		}
		else{
			response.sendRedirect("/Kachuelitos/index.html");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
