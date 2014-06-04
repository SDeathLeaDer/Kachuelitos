package kachuelitos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employeeRegistration
 */
@WebServlet("/employeeRegistration")
public class employeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
		"<head><title>Formulario de registro</title></head>\n" +
		"<body>\n" +
		"<h1>Formulario de registro</h1>\n" +
		"</body></html>");
		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
		"<p>Nombre: " + "</p>");
		out.println ("<!DOCTYPE html>\n" + "<form>\n <input  /> </form>");
		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
				"<p>DNI: " + "</p>");
		out.println ("<!DOCTYPE html>\n" + "<form>\n <input  /> </form>");
		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
				"<p>Telefono: " + "</p>");
		out.println ("<!DOCTYPE html>\n" + "<form>\n <input  /> </form>");
		out.println ("<!DOCTYPE html>\n" + "<html>\n" +
				"<p>Direccion: " + "</p>");
		out.println ("<!DOCTYPE html>\n" + "<form>\n <input  /> </form>");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
