package com.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegiCtrl
 */
@WebServlet("/RegiCtrl")
public class RegiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegiCtrl() {
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
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("mno");
		String pwd = request.getParameter("pwd");
		
	
		RegiPojo rpojo = new RegiPojo();
		
		rpojo.setName(name);
		rpojo.setEmail(email);
		rpojo.setPhone(phone);
		rpojo.setPwd(pwd);
		
		Regidao rdao = new Regidao();
		try {
			String str = rdao.addUser(rpojo);

			
			if(str.equals("Success"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
//				LoginCtrl.java
				rd.forward(request, response);
			}
			
		} catch (Exception e) {


			e.printStackTrace();
		}
		
	}

}
