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
import modelBO.JavaEmail;

/**
 * Servlet implementation class MailService
 */
@WebServlet("/MailService")
public class MailService extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static Account a;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		a = (Account)request.getSession().getAttribute("account");
		//System.out.println(a);
		if(a!=null) {
			response.sendRedirect("mailservice.jsp");
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
		String pa = request.getParameter("pass");
		String to = request.getParameter("toAddress");
		String sub = request.getParameter("subject");
		String con = request.getParameter("content");
		ErrorQue e = new ErrorQue();
		System.out.println(to+sub+con);
		if(pa.equals("")) {
			e.setErr("Password for your email is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("mailservice.jsp");
			return;
		}else if(to.equals("")) {
			e.setErr("Need an Address to send gmail");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("mailservice.jsp");
			return;
		}else if(sub.equals("")) {
			e.setErr("Subject is necessary");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("mailservice.jsp");
			return;
		}else if(con.equals("")) {
			e.setErr("Won't send email with no content");
			System.out.println(e.getErr());
			request.getSession().setAttribute("errque", e);
			response.sendRedirect("mailservice.jsp");
			return;
		}
		else {
			if(JavaEmail.Gmail(a.getInfo().substring(0, a.getInfo().indexOf("@")),pa,to,sub,con)) {
				request.getSession().setAttribute("success", "send Email Successfully");
			}else {
				e.setErr("Error Can not send Gmail!!!");
				request.getSession().setAttribute("errque", e);
			}
			response.sendRedirect("mailservice.jsp");
		}
	}

}
