package a.b.c;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MyLoginPage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter po=response.getWriter();
		
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String ad1=request.getParameter("add1");
		String ad2=request.getParameter("add2");
		String city=request.getParameter("city");
		String state=request.getParameter("state");		
		String z=request.getParameter("zip");
		
		
		po.println("your email : "+email);
		po.println("your password : "+pass);
		po.println("your first address  : "+ad1);
		po.println("your second address : "+ad2);
		po.println("your city name : "+city);
		po.println("your state name: "+state);
		po.println("your zip no :"+z);
	}

}
