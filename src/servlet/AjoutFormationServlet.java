package servlet;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Formationdao;
import dao.IFormationdao;
import dao.ILieuDAO;
import dao.LieuDAO;
import modele.Formation;
import modele.Lieu;


/**
 * Servlet implementation class AjoutFormationServlet
 */
@WebServlet("/AjoutFormation")
public class AjoutFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ILieuDAO dao = new LieuDAO();
		List <Lieu> liste = new ArrayList<Lieu>();
		liste=dao.getLieux();
		
		request.setAttribute("lieu", liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/formation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation fr= new Formation();
		fr.setTheme(request.getParameter("theme"));
		IFormationdao dao = new Formationdao();
		
		
		Lieu l=new Lieu();
		l.setidLieu(Integer.parseInt(request.getParameter("idLieu")));
		fr.setLieu(l);
		dao.creat(fr);
		
		this.getServletContext().getRequestDispatcher("/listeformations").forward(request, response);
		
	}

}
