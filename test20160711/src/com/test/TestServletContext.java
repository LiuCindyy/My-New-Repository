package com.test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletContext
 */
@WebServlet("/TestServletContext")
public class TestServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServletContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext application = this.getServletContext();
		
		java.io.PrintWriter out = response.getWriter();
		
		Integer accountNum = (Integer)application.getAttribute("555");
		
		if(accountNum==null) {
			out.println("Welcome, newcomer"+"<br>");
			accountNum = Integer.valueOf(0);
		}else {
			out.println("Welcome Back"+"<br>");
			accountNum = (Integer)accountNum.intValue()+1;
			out.println("Previous Num is: "+accountNum+"<br>");
		}
		
		application.setAttribute("555", accountNum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
