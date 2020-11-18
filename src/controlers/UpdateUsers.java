package controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import Bean.Account;
import Bean.ErrorQue;
import modelBO.InsertBO;
import modelBO.UpdateBO;

/**
 * Servlet implementation class UpdateUsers
 */
@WebServlet("/UpdateUsers")
public class UpdateUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Account aa = (Account)request.getSession().getAttribute("account");
		//System.out.println(a);
		if(aa!=null) {
			String id = request.getParameter("id");
			System.out.println(id);
			Account a = UpdateBO.getAcc(id);
			System.out.println(a);
			request.getSession().setAttribute("updateU", a);
			response.sendRedirect("update.jsp");
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
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		ErrorQue e = new ErrorQue();
		if(id.equals("")) {
			e.setErr("ID is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("update.jsp");
			return;
		}else if(pass.equals("")) {
			e.setErr("PASSWORD is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("update.jsp");
			return;
		}else {
			Account a = new Account();
			a.setId(id);
			a.setPass(pass);
			a.setName(request.getParameter("name"));
			a.setInfo(request.getParameter("info"));
			Boolean res = UpdateBO.uptodate(a);
			request.getSession().setAttribute("updateU", null);
			response.sendRedirect("ListUsers");
			
		}
	}

}
