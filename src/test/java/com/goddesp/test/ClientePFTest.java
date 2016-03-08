package com.goddesp.test;


import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.goddesp.cliente.ClientePF;
import com.goddesp.utils.HibernateUtil;

public class ClientePFTest {

	private static Session sessao;
	private static Transaction transacao;

	/*
	 * O método abreConexao sera excutado antes de todos os métodos de teste
	 */
	@BeforeClass
	public static void abreConexao() {
		sessao = HibernateUtil.getSession().getCurrentSession();// Instancia
		transacao = sessao.beginTransaction();// persistencia no BD

	}

	/*
	 * Fecha a conexão depois dos testes realizados
	 */
	@AfterClass
	public static void fechaConexao() {

		try {
			transacao.commit();

		} catch (Throwable e) {
			System.out.println("Commit Error!!!" + e.getMessage());

		} finally {
			try {
				if (sessao.isOpen()) {
					sessao.close();
				}

			} catch (Exception e2) {
				System.out.println("Erro ao tentar encerrar a sessão!" + e2.getMessage());
			}
		}

	}

	@Before
	public void setup() {

		ClientePF cli1 = new ClientePF("11322311807", "Joselma da Silva", "258401557", null, "(15)30135555",
				"(15)998114433", "1807955", "Rua Amazonas", "244", null, "Jardim São Paulo", "Sorocaba", "SP", null,
				"Sorocaba", "SP", "Próximo ao Seagesp", "Suzana da Silva", "Mario da Silva Xavier", "jojo@gmail.com",
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, new Date());
		
		ClientePF cli2 = new ClientePF("68814377731", "Amancio Pato", "258401567", null, "(15)301125456",
				"(15)997744535", "1807955", "Rua Bruno ferro", "100", null, "Central Parque", "Sorocaba", "SP", null,
				"Sorocaba", "SP", "Próximo ao Supermercado Central", "Fabiana Pato da Silva", "Moura Pato da Silva", "pato@gmail.com",
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, new Date());
		
		ClientePF cli3 = new ClientePF("72852618745", "Jucelia de Arruda dos Santos Mello", "258401557", null, "(13)33441519",
				"(13)994414531", "1800100", "Rua Maria Luiza Infantini", "72", null, "Jardim Vera Cruz", "São Vicente", "SP", null,
				"São Vicente", "SP", null, "Arlete de Arruda dos Santos", "Alex de mello dos Santos", "juju@gmail.com",
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, new Date());
		
		ClientePF cli4 = new ClientePF("67816331630", "Roberta Gonçalves Pereira", "2584115601", null, "(19)33544135",
				"(19)997884413", "181001", "Rua Argenor do Prado", "11", null, "Jardim Planalto", "Campinas", "SP", null,
				"São Paulo", "SP", null, "Ana Gonçalves Pereira", "Bruno de Mello Pereira", "robertinha@gmail.com",
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, new Date());
		
		ClientePF cli5 = new ClientePF("08319487609", "Juvencio Neto", "2584315600", null, "(13)33456155",
				"(13)994414531", "1800100", "Rua Maria Luiza Infantini", "100", null, "Jardim Vera Cruz", "São Vicente", "SP", null,
				"São Vicente", "SP", null, "Marinete de Souza neto", "Frederico Neto", "juvis@gmail.com",
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, new Date());
		
		
		

		sessao.save(cli1);
		sessao.save(cli2);
		sessao.save(cli3);
		sessao.save(cli4);
		sessao.save(cli5);

	}

	@Test
	public void salvarClientePFTest() {		
		setup();
	}

}
