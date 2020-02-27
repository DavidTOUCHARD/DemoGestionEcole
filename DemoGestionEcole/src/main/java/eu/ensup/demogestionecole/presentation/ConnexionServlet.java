package eu.ensup.demogestionecole.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.demogestionecole.domaine.Responsable;
import eu.ensup.demogestionecole.service.IResponsableService;
import eu.ensup.demogestionecole.service.ResponsableService;

/**
 * Servlet implementation class ConnexionServlet
 */
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	IResponsableService respserv = new ResponsableService();

	public ConnexionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		Responsable resp = new Responsable(login, pwd);
		List<Responsable> responsableList = new ArrayList<Responsable>();
		responsableList = respserv.lireResponsable(resp);

		if (!responsableList.isEmpty()) {
			HttpSession maSession = request.getSession();
			maSession.setAttribute("responsable", resp);
			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		} else {
			RequestDispatcher rs = request.getRequestDispatcher("404.jsp");
			rs.include(request, response);
		}
		doGet(request, response);
	}

}
