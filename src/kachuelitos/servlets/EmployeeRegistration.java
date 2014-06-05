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
public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistration() {
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
		"<head><title>Formulario de registro</title>"+
		"<link rel='stylesheet' href='styles/page.css' type='text/css' media='screen' title='no title' charset='utf-8'>"
		+ "</head>" +
		"<body> <div class = 'content' align='center'>"+
		"<img class='image' alt='logo' src='images/logo.jpg' width='300px'> \n"+
		"<form action='/Kachuelitos/registrar' method='get'>"+
		"<fieldset style='width:300px'>" +
		"<legend align='left'>Fomulario de registro</legend>"+
		"<p>DNI <input type='' name='idni'/></p>"+ 	
		"<p>Password <input name='ipassword'/></p>"+ 	
		"<p>Correo <input name='icorreo'/></p>" +
		"<p> ds<button> Registrarse </button></p>" +
		"</fieldset>"+ 
		"</form>"+
		"</div>"+ "</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
