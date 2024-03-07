package testmini;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Experied...<br>");
			req.getRequestDispatcher("fail.jsp").forward(req, res);
			
		}
		else {
			String fName=c[0].getValue();
			req.setAttribute("fname", fName);
			UserBean ub=(UserBean)req.getServletContext().getAttribute("ubean");
			ub.setAddr(req.getParameter("addr"));
			ub.setmId(req.getParameter("mid"));
			ub.setPhNo(Long.parseLong(req.getParameter("phno")));
			int k=new UpdateprofileDAO().update(ub);
			if(k>0) {
				req.setAttribute("msg", "profile Updated Sucessfully");
				req.getRequestDispatcher("updatedprofile.jsp").forward(req, res);
			}
		}
	}
	
}
