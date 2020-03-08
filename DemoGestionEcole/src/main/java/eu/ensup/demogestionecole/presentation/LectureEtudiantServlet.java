package eu.ensup.demogestionecole.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.service.ResponsableService;

/**
 * Servlet implementation class LectureEtudiantServlet
 */
public class LectureEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	ResponsableService respServ = new ResponsableService();
	Etudiant etudiant;

	public LectureEtudiantServlet() {
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
			System.out.println("recherche dans le doPost : " + nom + " " + prenom);
			Etudiant etu = new Etudiant(nom, prenom);
			etudiant = respServ.lireEtudiant(etudiant);
			HttpSession maSession = request.getSession();
			maSession.setAttribute("etudiant", etudiant);
			System.out.println("l'etudiant est : " + etudiant);
			RequestDispatcher rs = request.getRequestDispatcher("InfoEtudiant.jsp");
			rs.forward(request, response);
		}
		doGet(request, response);
	}

}
