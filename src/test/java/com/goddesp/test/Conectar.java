package com.goddesp.test;

import org.hibernate.Session;

import com.goddesp.utils.HibernateUtil;

public class Conectar {
	
	public static void main(String[] args) {
		Session sessao = null;
		
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou!!!");		
			
		}finally{
			sessao.close();
			System.out.println("Conexão encerrada!!!");
			
		}
	}

}
