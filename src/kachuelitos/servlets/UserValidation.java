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
 * Servlet implementation class UserValidation
 */
@WebServlet("/UserValidation")
public class UserValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidation() {
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
		
		//Validamos los campos
		String dni = request.getParameter("idni");
		String password = request.getParameter("ipassword");
		String email = request.getParameter("iemail");
		String ubigeo = request.getParameter("iubigeo");

		int typeError  = 0; // No hay error
		String contentError = null;
		boolean isError = false;

		if(!dni.isEmpty() && !password.isEmpty() && !email.isEmpty() && !ubigeo.isEmpty()){

			PrintWriter out = response.getWriter();		
			UserDBManager userdb = new UserDBManager();
			
			User user = new User(Integer.valueOf(dni), password, email, Integer.valueOf(ubigeo));
			int result = userdb.addUser(user);

			if(result == 0){
				HttpSession session = request.getSession();
				session.setAttribute("keyuser", user);
				 //Tiempo sesion es 2 minutos
	            session.setMaxInactiveInterval(2*60);
				
				response.sendRedirect("/Kachuelitos/UserAccount");
			}
			else{
				// No se pudo anhadir usuario a la DB, usuario repetido
				typeError = 2;
				isError = true;
			}
			out.println("</body></html>");
		}
		else{
			// Existen campos invalidos
			typeError = 1;
			isError = true;
		}

		if(isError){
			
			switch (typeError) {
			case 1:
				contentError = "Existen campos vacios, vuelva a llenar el formulario";
				break;

			case 2:
				contentError = "No se pudo añadir el usuario, verifique si ya creo una cuenta anteriormente";
				break;

			default:
				break;
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
					"<form action='/Kachuelitos/UserRegister' method='get'>\n"+
					"<p class='maincontent'>"+contentError+"</p>\n"+
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

}
