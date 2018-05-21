package Process;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageTwoProcess
 */
public class PageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		
		int result = Integer.parseInt(first) + Integer.parseInt(second);
		request.getSession().setAttribute("fir", first);
		request.getSession().setAttribute("sec", second);
		request.getSession().setAttribute("result", result);
		response.sendRedirect("JSP/Result.jsp");
	}

}
