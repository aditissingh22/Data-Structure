package ejbdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.bean.AddBean;
import ejb.bean.AddEJBBean;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	@EJB
	AddEJBBean addEJBBean;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		//Way1
		//int k = i+j;//We can write the business logic here as well, but it is not recommended to write business logic like this. We should create a diffeent class/method for this.
		
		//Way2
		//AddBean addBean = new AddBean();//Here we are creating dependency
		//addBean.add();
		
		//Way3
		
		addEJBBean.setI(i);
		addEJBBean.setJ(j);
		
		addEJBBean.add();
		int k =addEJBBean.getK();
		
		PrintWriter out = response.getWriter();
		out.println("The addition by EJB is:" + k);
	}

}
