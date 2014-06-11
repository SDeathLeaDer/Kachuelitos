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
 * Servlet implementation class UserIdentification
 */
@WebServlet("/UserIdentification")
public class UserIdentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserIdentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Validamos los campos
		String dni = request.getParameter("idni");
		String password = request.getParameter("ipassword");

		int typeError  = 0; // No hay error
		String contentError = null;
		boolean isError = false;

		if(!dni.isEmpty() && !password.isEmpty()){

			PrintWriter out = response.getWriter();		
			UserDBManager userdb = new UserDBManager();
			User user = userdb.identificationUser(Integer.valueOf(dni), password);
//			int result = userdb.addUser(new User(Integer.valueOf(dni), password, email, Integer.valueOf(ubigeo)));

			if(user != null){
				HttpSession session = request.getSession();
				session.setAttribute("keyuser", user);
				 //Tiempo sesion es 2 minutos
	            session.setMaxInactiveInterval(2*60);
				response.sendRedirect("/Kachuelitos/UserAccount");
			}
			else{
				// El dni y password son incorrectos o no existe el usuario
				typeError = 2;
				isError = true;
			}
			out.println("</body></html>");
		}
		else{
			// Existen campos  vacios
			typeError = 1;
			isError = true;
		}

		if(isError){
			
			switch (typeError) {
			case 1:
				contentError = "Existen campos vacios, vuelva a llenar el formulario";
				break;

			case 2:
				contentError = "El dni y password son incorrectos o no existe el usuario";
				break;

			default:
				break;
			}

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html>\n" + "<head>"+ "<meta charset='ISO-8859-1'>\n"+
					"<title>Login</title>\n"+
					"<link rel='stylesheet' href='styles/page.css' type='text/css'\n"+
					"media='screen' title='no title' charset='utf-8'>\n"+
					"</head>\n"+
					"<body>\n"+
					"<div align='center' id='main'>\n"+
					"<img id='mainlogo' src='images/logo.jpg' width='300px'>\n"+
					"<form action='/Kachuelitos/LoginSession' method='post'>\n"+
					"<p class='maincontent'>"+contentError+"</p>\n"+
					"<button >Aceptar</button>\n"+
					"</form>\n"+
					"</div>\n"+
					"<footer>\n"+
					"<div align='center'>\n"+
					"<hr width='50%'>\n"+
					"<p>Derechos Reserv@dos 101Kachuelitos 2014</p>\n"+
					"</div>\n"+
					"</footer>\n"+
					"</body>\n"+
					"</html>");
		}
	}
}