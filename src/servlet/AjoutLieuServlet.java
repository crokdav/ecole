package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.ILieuDAO;
import dao.LieuDAO;

import modele.Lieu;

/**
 * Servlet implementation class AjoutLieuServlet
 */
@WebServlet("/ajoutlieu")
public class AjoutLieuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue/lieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lieu li= new Lieu();
		li.setAdresse(request.getParameter("adresse"));
		li.setVille(request.getParameter("ville"));
		ILieuDAO dao = new LieuDAO();
		
		dao.creat(li);
		
		this.getServletContext().getRequestDispatcher("/listelieu").forward(request, response);
	}

}
