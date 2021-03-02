package com.veto.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.veto.dao.PersonDao;
import com.veto.model.Person;
import com.veto.model.User;


@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PersonDao registerDao = new PersonDao();

    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		register(request, response);
	}
	
	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String pswd = request.getParameter("pswd");


		User user = new User();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setPswd(pswd);


		registerDao.savePerson(user);
		
		request.getRequestDispatcher("registerSuccess.jsp").forward(request, response);
	}

}
