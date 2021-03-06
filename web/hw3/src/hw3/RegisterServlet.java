package hw3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html;charset=UTF-8");
		
		String uname=request.getParameter("uname");
		String mm=request.getParameter("mm");
		String qrmm=request.getParameter("qrmm");
		String path = request.getContextPath();
		StringBuffer url = request.getRequestURL();
		System.out.println("path:"+path);
		System.out.println("url:"+url);
		System.out.println("uname:"+uname);
		System.out.println("mm:"+mm);
		System.out.println("qrmm:"+qrmm);
		if(mm.equals(qrmm)) {
			response.sendRedirect(path+"/regist_success.html");
		}
		else {
			response.sendRedirect(path+"/regist_error.html");
		}
	}

}
