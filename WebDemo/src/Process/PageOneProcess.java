package Process;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageOneProcess
 */
public class PageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String phone = request.getParameter("phone");
		
		System.out.println("Company Name: " + name);
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("add", add);
		request.getSession().setAttribute("phone", phone);
		
		response.sendRedirect("HTML/PageTwo.html");
	}

}
