package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionInfoServlet
 */
@WebServlet("/SessionInfoServlet")
public class SessionInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);	
		java.io.PrintWriter out =response.getWriter();
		
		out.println("is this session a new session: "+session.isNew()+"<br>");
		out.println("what's the Id of this session? "+session.getId()+"<br>");
		out.println("session creation time: "+new java.util.Date(session.getCreationTime())+"<br>");
		out.println("Session Last Accessed Time: "+new java.util.Date(session.getLastAccessedTime())+"<br>");
		out.println("What's the session Id of this session "+request.getRequestedSessionId()+"<br>");
		out.println("is this session from cookies? "+request.isRequestedSessionIdFromCookie()+"<br>");
		out.println("what's the session Id from URL? "+request.isRequestedSessionIdFromURL()+"<br>");
		out.println("what is the session Id valid "+request.isRequestedSessionIdValid()+"<br>");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
