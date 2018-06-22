package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogicServlet
 */
@WebServlet("/Logic")
public class LogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int val1 = (int)(Math.random() * 100) + 1;
		int val2 = (int)(Math.random() * 100) + 1;
		
		int result = val1 + val2;
		request.setAttribute("v1", val1);
		request.setAttribute("v2", val2);
		request.setAttribute("result", result);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
		requestDispatcher.forward(request,response);
	}

}