package testmini;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class viewProfileServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		Cookie c[]=req.getCookies();//Getting Cookies from Request Object
		if(c==null)
		{
			req.setAttribute("msg","session Experied");
			RequestDispatcher rd=req.getRequestDispatcher("fail.jsp");
			rd.forward(req, res);
		}
		else {
			String fN=c[0].getValue();
			req.setAttribute("fName", fN);
			RequestDispatcher rd=req.getRequestDispatcher("viewprofile.jsp");
			rd.forward(req, res);
		}
	}
}
