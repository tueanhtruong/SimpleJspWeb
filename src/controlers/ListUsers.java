package controlers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Account;
import Bean.dataQ;
import modelBO.ListusersBO;

/**
 * Servlet implementation class ListUsers
 */
@WebServlet("/ListUsers")
public class ListUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Account a = (Account)request.getSession().getAttribute("account");
		//System.out.println(a);
		if(a!=null) {
			ArrayList<String> data = ListusersBO.getData(); 
//			dataQ d = new dataQ();
//			d.data = (ArrayList<String>) data.clone();
			dataQ.data = data;
			response.sendRedirect("listusers.jsp");
		}
		else {
		response.sendRedirect("login.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = request.getParameter("search");
		String op = request.getParameter("option");
		ArrayList<String> data = ListusersBO.searchData(s.toLowerCase(),op); 
		//dataQ.data = (ArrayList<String>) data.clone();
		dataQ.data = data;
		response.sendRedirect("listusers.jsp");
	}

}
