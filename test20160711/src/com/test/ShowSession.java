package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowSession
 */
@WebServlet("/ShowSession")
public class ShowSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		java.io.PrintWriter out = response.getWriter();
		
	
		
		Integer accessCount = (Integer) session.getAttribute("123");
		
		if (accessCount == null) {
			out.println("Welcome, Newcomer"+"<br>");
			accessCount =Integer.valueOf(0);
			
			
		}else {
			out.println("Welcome back"+"<br>");
			accessCount = Integer.valueOf(accessCount.intValue()+1);
			out.println("Number of previous Accesses:"+accessCount+"<br>");
			out.println("Session Id: "+session.getId()+"<br>");
			out.println("Creation time: "+new java.util.Date(session.getCreationTime())+"<br>");
			out.println("Time of Last Access: "+new java.util.Date(session.getLastAccessedTime())+"<br>");
			
			
		}
		
		
		session.setAttribute("123", accessCount);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
