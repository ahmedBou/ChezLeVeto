package com.veto.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.veto.dao.QaDao;
import com.veto.dao.ResponseDao;
import com.veto.model.Person;
import com.veto.model.Question;
import com.veto.model.Response;

/**
 * Servlet implementation class ResController
 */
@WebServlet("/admin")
public class ResController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResponseDao initRes = new ResponseDao();
       

    public ResController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	
//		listOfQ.getQuestion();
		List<Response> listResponse = initRes.getResponse();
		session.setAttribute("data", listResponse);
		request.getRequestDispatcher("admin.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String resp = request.getParameter("response");
		HttpSession session = request.getSession(true);
		Person session_user = (Person) session.getAttribute("Session_USER");
		Response res = new Response(resp, session_user);
		
		initRes.saveResponse(res);
		
		
		
		
	}

}
