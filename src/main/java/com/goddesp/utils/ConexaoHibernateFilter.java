package com.goddesp.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;

/**
 * Implementa uma classe filter
 * 
 * @author Rede Estado
 *
 */
public class ConexaoHibernateFilter implements Filter {

	private SessionFactory sf;

	@Override
	public void doFilter(ServletRequest servletFilter, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		try {
			this.sf.getCurrentSession().beginTransaction();
			chain.doFilter(servletFilter, servletResponse);
			this.sf.getCurrentSession().getTransaction().commit();
			this.sf.getCurrentSession().close();
		} catch (Throwable ex) {

			try {
				if (this.sf.getCurrentSession().getTransaction().isActive()) {

					this.sf.getCurrentSession().getTransaction().rollback();

				}

			} catch (Throwable t) {

				t.printStackTrace();
			}
			throw new ServletException();

		}

	}

	@Override
	public void init(FilterConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.sf = HibernateUtil.getSession();

	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
