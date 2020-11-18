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
			String[] users = new String[data.size()];
			for(int i=0;i<data.size();i++) {
				users[i] = new String(data.get(i)); 
			}
			dataQ d = new dataQ();
			d.data = (ArrayList<String>) data.clone();
			request.setAttribute("dataUsers", d);
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
		doGet(request, response);
	}

}
