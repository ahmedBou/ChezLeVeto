package com.veto.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
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
import com.veto.model.Veto;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResponseDao initRes = new ResponseDao();
	QaDao question = new QaDao();
	
	PersonDao login = new PersonDao();

    /**
     * Default constructor. 
     */
    public LoginController() {
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
		try {
			authenticate(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String username = request.getParameter("nom");
		String password = request.getParameter("pswd");
		Person p = login.validate(username, password);
		if (p !=null) {
			HttpSession session = request.getSession(true);
			if(p.getClass().equals(Veto.class)) {
				System.out.println("true admin");
				session.setAttribute("Session_USER",p );
				//request.setAttribute("User_session", session);
				request.getRequestDispatcher("admin.jsp").forward(request,response);
			}else {
				
				session.setAttribute("Session_USER",p );
				List<Response> listResponse = initRes.getResponse();
				session.setAttribute("dataResp", listResponse);
				//request.setAttribute("User_session", session);
				QaDao listOfQ = new QaDao();
				List<Question> listQuestions =listOfQ.getQuestion();
				session.setAttribute("data", listQuestions);
				request.getRequestDispatcher("home.jsp").forward(request,response);

			}

		}else {
			throw new Exception("Login not successful..");
		}
	}

}
