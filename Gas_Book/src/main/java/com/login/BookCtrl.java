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
 * Servlet implementation class BookCtrl
 */
@WebServlet("/BookCtrl")
public class BookCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookCtrl() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String cusname = request.getParameter("cname");
		String cid = request.getParameter("cid");
		String aadhar_no = request.getParameter("ano");
		String add = request.getParameter("add");
		String order_date=request.getParameter("dt");
		String ctype =request.getParameter("ctype");
		
	
		Bookpojo bpojo = new Bookpojo();
		
		bpojo.setCusname(cusname);
		bpojo.setCid(cid);
		bpojo.setAadhar_no(aadhar_no);
		bpojo.setAdd(add);
		bpojo.setOrdet_date(ctype);
		bpojo.setCtype(ctype);
		
		Bookdao bdao = new Bookdao();
		try {
			String str = bdao.addUser(bpojo);

			
			if(str.equals("Success"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("success.html");
//				LoginCtrl.java
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("error.html");
				rd.forward(request, response);
			}
			
		} catch (Exception e) {


			e.printStackTrace();
		}
		
	}
	}


