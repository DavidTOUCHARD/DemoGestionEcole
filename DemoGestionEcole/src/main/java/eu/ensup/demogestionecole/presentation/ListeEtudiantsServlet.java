package eu.ensup.demogestionecole.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import eu.ensup.demogestionecole.domaine.Etudiant;
import eu.ensup.demogestionecole.service.ResponsableService;

/**
 * Servlet implementation class ListeEtudiantsServlet
 */
@WebServlet("/liste-etudiants")
public class ListeEtudiantsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListeEtudiantsServlet() {
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
		System.out.println("COUCOU ICI LA");
		ResponsableService service = new ResponsableService();
		List<Etudiant> listeEtudiants = service.listerEtudiants();

		if (!listeEtudiants.isEmpty()) {
			System.out.println(listeEtudiants);
			RequestDispatcher rs = request.getRequestDispatcher("listeEtudiants.jsp");
			HttpSession maSession = request.getSession();
			maSession.setAttribute("listeEtudiants", listeEtudiants);
			rs.forward(request, response);
		} else {

			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}