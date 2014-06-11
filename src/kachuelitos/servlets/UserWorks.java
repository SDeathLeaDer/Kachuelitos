package kachuelitos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kachuelitos.model.User;
import kachuelitos.model.UserDBManager;

/**
 * Servlet implementation class UserWorks
 */
@WebServlet("/UserWorks")
public class UserWorks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserWorks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	

		//Recuperamos la session	
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("keyuser");

		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
				"<head><title>Mi trabajos</title>\n"+ 
				"<link rel='stylesheet' href='styles/tab.css' type='text/css' media='screen'"+
				"title='no title' charset='utf-8'>\n"+
				"<link rel='stylesheet' href='styles/page.css' type='text/css' media='screen'"+
				"title='no title' charset='utf-8'>\n"+
				"</head>\n" + "<body>\n" + 
				"<div id='header'>\n"+
				"<img id='logo' src='images/logo.jpg' width='250px'>\n"+
				"<form action='/Kachuelitos/LogoutSession' method='post'>\n"+
				"<button id ='buttonTop'>Cerrar Sesion</button>\n"+
				"</form>\n"+
				"</div>\n"+
				"<div id='tabContainer'>\n"+
				"<ul id='topTab'>\n"+
				"<li><a href='/Kachuelitos/UserAccount' title='Home'>Mi Cuenta</a></li>\n"+
				"<li><a href='/Kachuelitos/UserWorks' title='Home'  class='current'>Mis Trabajos</a></li>\n"+
				"<li><a href='/Kachuelitos/UserCV' title='Home'>Mi CV</a></li>\n"+
				"</ul>\n"+
				"</div>\n"+
				"<div id='content'>\n"+
				"<p>Bienvenido: "+user.getName()+"</p>\n"+
				"</div>\n"+
				"<footer>\n"+
				"<div align='center'>\n"+
				"<hr width='50%''>\n"+
				"<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>\n"+
				"</div>\n"+
				"</footer>\n"+
				"</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
