package com.veto.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.veto.dao.RdvDao;
import com.veto.model.Person;
import com.veto.model.RendezVs;

/**
 * Servlet implementation class RendezVsController
 */
@WebServlet("/rendezVs")
public class RendezVsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RdvDao rvs = new RdvDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RendezVsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String motif = request.getParameter("motif");

		HttpSession session = request.getSession(true);
		Person session_user = (Person) session.getAttribute("Session_USER");
		RendezVs rVs = new RendezVs(motif, session_user);
		
		
		doGet(request, response);
	}

}
