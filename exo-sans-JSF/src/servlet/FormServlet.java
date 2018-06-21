package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html");
		response.setCharacterEncoding("UTF-8");
		
		String pathInfo = request.getPathInfo();
		if (pathInfo == null) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/exo-JSF.jsp").forward(request, response);

		} else {
			response.setStatus(404);
			response.getWriter().append("<p>404 - La page demandée n'existe pas</p>");
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String content;
		String action2r = request.getParameter("toTheRight");
		String action2l = request.getParameter("toTheLeft");
	     
	    if (action2r != null) {
			if (!request.getParameter("A").isEmpty()) {
				content=request.getParameter("A");
				request.setAttribute("right", content);
			}
		} 
	    if (action2l != null) {
		if (!request.getParameter("B").isEmpty()) {
			content=request.getParameter("B");
			request.setAttribute("left", content);
		}
	    }
		this.getServletContext().getRequestDispatcher("/WEB-INF/exo-JSF.jsp").forward(request, response);
	}
	

}
