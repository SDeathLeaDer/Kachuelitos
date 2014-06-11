package kachuelitos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeSearch
 */
@WebServlet("/EmployeeSearch")
public class EmployeeSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		// Create object for connect to DB
		
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println ("<!DOCTYPE html>\n" + "<html>\n" +
		 "<head><title>Busqueda de un tipo de trabajo</title></head>\n" +
		 "<body>\n" + "<h1>Tipo4 "+request.getParameter("typework")+"</h1>\n" +
		 "</body></html>");
		
//		Database db = Database.getInstance();
//		db.connectionDB();
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		out.println ("<!DOCTYPE html>\n" + "<html>\n)
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
