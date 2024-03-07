package testmini;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/logout")
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	Cookie[] ck=req.getCookies();
	ck[0].setMaxAge(0);
	res.addCookie(ck[0]);
	req.setAttribute("msg","Logout Sucessfully");
		req.getRequestDispatcher("logout.jsp").forward(req, res);
	}
}
