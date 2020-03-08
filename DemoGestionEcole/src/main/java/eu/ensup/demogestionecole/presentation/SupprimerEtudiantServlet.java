package eu.ensup.demogestionecole.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.service.IResponsableService;
import eu.ensup.demogestionecole.service.ResponsableService;

/**
 * Servlet implementation class SupprimerEtudiantServlet
 */
public class SupprimerEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	IResponsableService respserv = new ResponsableService();

	public SupprimerEtudiantServlet() {
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
		if (request.getParameter("button1") != null) {
			Long idetudiant = Long.parseLong(request.getParameter("idetudiant"));
			Etudiant etudiant1 = new Etudiant(request.getParameter("nom"), request.getParameter("prenom"));
			Etudiant etudiant = new Etudiant("test", "test", "01236466", "labas", "03/03/03", "test@test");
			System.out.println("l'etudiant supprimé est :" + etudiant);
			respserv.supprimerEtudiant(idetudiant);

			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		}
		doGet(request, response);
	}

}
