package testmini;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	String uN=req.getParameter("uname");
	String pW=req.getParameter("pword");
	UserBean ub=new LoginDAO().login(uN, pW);
	if(ub==null) {
		req.setAttribute("msg", "Invalid Login Process..<br>");
		RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
		rd.forward(req, res);
	}else {
		ServletContext sct=req.getServletContext();//Accessing ServletContext-Object
		sct.setAttribute("ubean", ub);
		Cookie ck=new Cookie("fname", ub.getfName());
		res.addCookie(ck);//AddingCookie
		RequestDispatcher rd=req.getRequestDispatcher("LogSuccess.jsp");
		rd.forward(req, res);
	}
 }
}
