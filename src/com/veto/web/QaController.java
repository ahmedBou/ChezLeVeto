package com.veto.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.veto.dao.PersonDao;
import com.veto.dao.QaDao;
import com.veto.model.Person;
import com.veto.model.Question;
import com.veto.model.User;


@WebServlet("/home")
public class QaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	QaDao question = new QaDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QaController() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("home.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ques = request.getParameter("question");
//		PersonDao user = new PersonDao();
		HttpSession session = request.getSession(true);
		User session_user = (User) session.getAttribute("Session_USER");
		Question sendQest = new Question(ques, session_user);
//		sendQest.setQuestion(ques);
		question.saveQuestion(sendQest);
		request.getRequestDispatcher("home.jsp").forward(request,response);
	}
	
}
