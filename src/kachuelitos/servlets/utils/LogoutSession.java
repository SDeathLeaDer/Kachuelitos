package kachuelitos.servlets.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutSession
 */
@WebServlet("/LogoutSession")
public class LogoutSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogoutSession() {
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

		HttpSession session = request.getSession(false);
		if(session != null){
			session.invalidate();
		}

				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>\n" + "<head>"+ "<meta charset='ISO-8859-1'>\n"+
				"<title>Bienvenidos a Kachuelitos</title>\n"+
				"<link rel='stylesheet' href='styles/page.css' type='text/css'\n"+
				"media='screen' title='no title' charset='utf-8'>\n"+
				"</head>\n"+
				"<body>\n"+
				"<div align='center' id='main'>\n"+
				"<img id='mainlogo' src='images/logo.jpg' width='300px'>\n"+
				"<form action='/Kachuelitos/index.html' method='get'>\n"+
				"<p class='maincontent'> Se cerro session de manera satisfactoria</p>\n"+
				"<button >Aceptar</button>\n"+
				"</form>\n"+
				"</div>\n"+
				"<footer>\n"+
				"<div align='center'>\n"+
				"<hr width='50%'>\n"+
				"<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>\n"+
				"</div>\n"+
				"</footer>\n"+
				"</body>\n"+
				"</html>");
	}

}
