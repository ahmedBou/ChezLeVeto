package com.veto.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.veto.dao.PersonDao;
import com.veto.dao.QaDao;
import com.veto.dao.ResponseDao;
import com.veto.model.Person;
import com.veto.model.Question;
import com.veto.model.Response;
import com.veto.model.User;


@WebServlet("/home")
public class QaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	QaDao question = new QaDao();
       
	ResponseDao initRes = new ResponseDao();
    public QaController() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		QaDao listOfQ = new QaDao();
//		listOfQ.getQuestion();
		List<Question> listQuestions =listOfQ.getQuestion();
		session.setAttribute("data", listQuestions);
	
		request.getRequestDispatcher("home.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ques = request.getParameter("question");

		HttpSession session = request.getSession(true);
		Person session_user = (Person) session.getAttribute("Session_USER");
		Question sendQest = new Question(ques, session_user);

		question.saveQuestion(sendQest);
		doGet(request, response);
		//request.getRequestDispatcher("home.jsp").forward(request,response);
	}
	
}
