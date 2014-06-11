package kachuelitos.servlets.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSession
 */
@WebServlet("/LoginSession")
public class LoginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	

		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
				"<head>\n" +
				"<meta charset='ISO-8859-1'>\n" +
				"<title>Login</title>\n" +
				"<link rel='stylesheet' href='styles/page.css' type='text/css'\n" +
				"media='screen' title='no title' charset='utf-8'>\n" +
				"</head>\n" +
				"<body>\n" +
				"<div id='main' align='center'>\n" +
				"<img id='mainlogo' alt='logo' src='images/logo.jpg' width='300px'>\n" +
				"<form action='/Kachuelitos/UserIdentification' method='post'>\n" +
				"<fieldset style='width: 300px'>\n" +
				"<legend align='left'>Login</legend>\n" +
				"<p class='maincontent'>\n" +
				"DNI <input name='idni' type='number'/>\n" +
				"</p>\n" +
				"Password <input name='ipassword' type='password' />\n" +
				"</p>\n" +
				"<p class='maincontent'>\n" +
				"<button>Iniciar Sesión</button>\n" +
				"</p>\n" +
				"</fieldset>\n" +
				"</form>\n" +
				"<form action='/Kachuelitos/UserRegister' method='get'>"+
				"<p class='maincontent2'>"+
					"¿Quiere ser parte de la red de trabajadores de 101 Kachuelitos? "+
					"<button>Unete</button>" +
					"</p>"+
					"</form>"+
				"</div>\n" +
				"<footer>\n" +
				"<div align='center'>\n" +
				"<hr width='50%'>\n" +
				"<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>\n" +
				"</div>\n" +
				"</footer>\n" +
				"</body>");
	}
}
