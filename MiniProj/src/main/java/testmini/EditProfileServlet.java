package testmini;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet {
	
   @Override
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	   Cookie c[]=req.getCookies();
	   if(c==null) {
		   req.setAttribute("msg", "Session Expired..<br>");
		   req.getRequestDispatcher("fail.jsp").forward(req, res);
	   }
	   else {
		   String fName=c[0].getValue();
		   req.setAttribute("fName", fName);
		   req.getRequestDispatcher("editprofile.jsp").forward(req, res);
	   }
   }
}
