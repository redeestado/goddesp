package com.goddesp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/clientepf", "/clienteServlet", "/contasapagar", "/contasareceber", "/funcionario",
		"/servico", "/usuario" })
public class ClienteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7412079805826470828L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamou pelo método GET");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método POST!");

	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou o método doDelete");
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou o Método doPut");
	}

}
