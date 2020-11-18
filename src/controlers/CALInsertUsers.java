package controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Account;
import Bean.ErrorQue;
import modelBO.InsertBO;

/**
 * Servlet implementation class CALInsertUsers
 */
@WebServlet("/CALInsertUsers")
public class CALInsertUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CALInsertUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		ErrorQue e = new ErrorQue();
		if(id.equals("")) {
			e.setErr("ID is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("insert2.jsp");
			return;
		}else if(pass.equals("")) {
			e.setErr("PASSWORD is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("insert2.jsp");
			return;
		}else {
			Account a = new Account();
			a.setId(id);
			a.setPass(pass);
			a.setName(request.getParameter("name"));
			a.setInfo(request.getParameter("info"));
			Boolean res = InsertBO.insert(a);
			response.sendRedirect("ListUsers");
			
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
