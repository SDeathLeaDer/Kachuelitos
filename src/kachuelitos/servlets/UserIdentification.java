package kachuelitos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kachuelitos.persistence.dao.User;
import kachuelitos.persistence.dao.UserDAO;



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
		
		System.out.println("esta aqui");
		String dni = request.getParameter("vdni");
		String password = request.getParameter("vpassword");

		int typeError  = 0; // No hay error
		String contentError = null;
		boolean isError = false;

		if(!dni.isEmpty() && !password.isEmpty()){

			UserDAO userdb = new UserDAO();
			User user = userdb.identificationUser(Integer.valueOf(dni), password);
			//			int result = userdb.addUser(new User(Integer.valueOf(dni), password, email, Integer.valueOf(ubigeo)));

			if(user != null){
				HttpSession session = request.getSession();
				session.setAttribute("keyuser", user);
				//Tiempo sesion es 2 minutos
				session.setMaxInactiveInterval(2*60);
				//response.sendRedirect("/Kachuelitos/UserAccount");
				typeError = 0;
				isError = false;
			}
			else{
				// El dni y password son incorrectos o no existe el usuario
				typeError = 2;
				isError = true;
			}
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
		}
		else{
			contentError = "1";
		}
		PrintWriter out = response.getWriter();		
		out.println(contentError);
	}
}