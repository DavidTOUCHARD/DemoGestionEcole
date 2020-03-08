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
 * Servlet implementation class CreationEtudiantServlet
 */
public class CreationEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	IResponsableService respserv = new ResponsableService();

	public CreationEtudiantServlet() {
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
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String tel = request.getParameter("telephone");
			String adresse = request.getParameter("adresse");
			String datenaissance = request.getParameter("datenaissance");
			String mail = request.getParameter("email");
			Etudiant etudiant = new Etudiant(nom, prenom, tel, adresse, datenaissance, mail);
			System.out.println(etudiant);
			respserv.ajouterEtudiant(etudiant);

			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		}
		doGet(request, response);
	}

}
