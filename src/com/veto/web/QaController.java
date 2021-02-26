package com.veto.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.veto.dao.QaDao;
import com.veto.model.Qa;


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
//		System.out.println(ques);
		Qa sendQestToQaDao= new Qa();
		sendQestToQaDao.setChat(ques);
		question.saveQuestion(sendQestToQaDao);
		request.getRequestDispatcher("home.jsp").forward(request,response);
	}
	
}
