package first.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ser")
public class ServletP extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(req, resp);
		String a=req.getParameter("num1");
		String b=req.getParameter("num2");
		
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		//System.out.println(a1*b1);
		//to send response back to web
		resp.getWriter().print(a1*b1);
	}
}
