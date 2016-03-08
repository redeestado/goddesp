package com.goddesp.cliente;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.ImageType;


@Entity
@Table(name = "clientepf")
public class ClientePF implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4759213715106151366L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 11)
	private String cpf;
	@Column(length = 50)
	private String nome;
	@Column(length = 15)
	private String rg;
	@Column(length = 20)
	private String te;
	@Column(length = 25)
	private String fone;
	@Column(length = 25)
	private String celular;
	@Column(length = 9)
	private String cep;
	@Column(length = 50)
	private String rua;
	@Column(length = 10)
	private String nr;
	@Column(length = 20)
	private String compl;
	@Column(length = 30)
	private String bairro;
	@Column(length = 30)
	private String cidade;
	@Column(length = 2)
	private String estado;
	private Date dtnasc;
	@Column(length = 30)
	private String naturalidade;
	@Column(length = 2)
	private String naturalestado;
	@Column(length = 50)
	private String pontoref;
	@Column(length = 30)
	private String mae;
	@Column(length = 30)
	private String pai;
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String facebook;
	@Column(length = 30)
	private String site;
	@Column(length = 1)
	private String mark;
	@Column(length = 20)
	private String permissao;
	@Column(length = 20)
	private String acc;
	@Column(length = 20)
	private String registro;
	private Date primeirahab;
	@Column(length = 20)
	private String numcnh;
	@Column(length = 50)
	private String obs;
	@Column(length = 10)
	private String categoria;
	private Date validade;
	private ImageType digital1;
	private ImageType digital2;
	private ImageType digital3;
	private ImageType digital4;
	private ImageType digital5;
	private ImageType digital6;
	private ImageType digital7;
	private ImageType digital8;
	private ImageType digital9;
	private ImageType digital10;
	private ImageType foto1;
	private ImageType foto2;
	private ImageType foto3;
	private ImageType foto4;
	private ImageType foto5;
	private Date dtcad;
	
	

	

	public ClientePF(String cpf, String nome, String rg, String te, String fone, String celular, String cep, String rua,
			String nr, String compl, String bairro, String cidade, String estado, Date dtnasc, String naturalidade,
			String naturalestado, String pontoref, String mae, String pai, String email, String facebook, String site,
			String mark, String permissao, String acc, String registro, Date primeirahab, String numcnh, String obs,
			String categoria, Date validade, ImageType digital1, ImageType digital2, ImageType digital3,
			ImageType digital4, ImageType digital5, ImageType digital6, ImageType digital7, ImageType digital8,
			ImageType digital9, ImageType digital10, ImageType foto1, ImageType foto2, ImageType foto3, ImageType foto4,
			ImageType foto5, Date dtcad) {
	
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.te = te;
		this.fone = fone;
		this.celular = celular;
		this.cep = cep;
		this.rua = rua;
		this.nr = nr;
		this.compl = compl;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.dtnasc = dtnasc;
		this.naturalidade = naturalidade;
		this.naturalestado = naturalestado;
		this.pontoref = pontoref;
		this.mae = mae;
		this.pai = pai;
		this.email = email;
		this.facebook = facebook;
		this.site = site;
		this.mark = mark;
		this.permissao = permissao;
		this.acc = acc;
		this.registro = registro;
		this.primeirahab = primeirahab;
		this.numcnh = numcnh;
		this.obs = obs;
		this.categoria = categoria;
		this.validade = validade;
		this.digital1 = digital1;
		this.digital2 = digital2;
		this.digital3 = digital3;
		this.digital4 = digital4;
		this.digital5 = digital5;
		this.digital6 = digital6;
		this.digital7 = digital7;
		this.digital8 = digital8;
		this.digital9 = digital9;
		this.digital10 = digital10;
		this.foto1 = foto1;
		this.foto2 = foto2;
		this.foto3 = foto3;
		this.foto4 = foto4;
		this.foto5 = foto5;
		this.dtcad = dtcad;
	}

	public ClientePF() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTe() {
		return te;
	}

	public void setTe(String te) {
		this.te = te;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getCompl() {
		return compl;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNaturalestado() {
		return naturalestado;
	}

	public void setNaturalestado(String naturalestado) {
		this.naturalestado = naturalestado;
	}

	public String getPontoref() {
		return pontoref;
	}

	public void setPontoref(String pontoref) {
		this.pontoref = pontoref;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public Date getPrimeirahab() {
		return primeirahab;
	}

	public void setPrimeirahab(Date primeirahab) {
		this.primeirahab = primeirahab;
	}

	public String getNumcnh() {
		return numcnh;
	}

	public void setNumcnh(String numcnh) {
		this.numcnh = numcnh;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public ImageType getDigital1() {
		return digital1;
	}

	public void setDigital1(ImageType digital1) {
		this.digital1 = digital1;
	}

	public ImageType getDigital2() {
		return digital2;
	}

	public void setDigital2(ImageType digital2) {
		this.digital2 = digital2;
	}

	public ImageType getDigital3() {
		return digital3;
	}

	public void setDigital3(ImageType digital3) {
		this.digital3 = digital3;
	}

	public ImageType getDigital4() {
		return digital4;
	}

	public void setDigital4(ImageType digital4) {
		this.digital4 = digital4;
	}

	public ImageType getDigital5() {
		return digital5;
	}

	public void setDigital5(ImageType digital5) {
		this.digital5 = digital5;
	}

	public ImageType getDigital6() {
		return digital6;
	}

	public void setDigital6(ImageType digital6) {
		this.digital6 = digital6;
	}

	public ImageType getDigital7() {
		return digital7;
	}

	public void setDigital7(ImageType digital7) {
		this.digital7 = digital7;
	}

	public ImageType getDigital8() {
		return digital8;
	}

	public void setDigital8(ImageType digital8) {
		this.digital8 = digital8;
	}

	public ImageType getDigital9() {
		return digital9;
	}

	public void setDigital9(ImageType digital9) {
		this.digital9 = digital9;
	}

	public ImageType getDigital10() {
		return digital10;
	}

	public void setDigital10(ImageType digital10) {
		this.digital10 = digital10;
	}

	public ImageType getFoto1() {
		return foto1;
	}

	public void setFoto1(ImageType foto1) {
		this.foto1 = foto1;
	}

	public ImageType getFoto2() {
		return foto2;
	}

	public void setFoto2(ImageType foto2) {
		this.foto2 = foto2;
	}

	public ImageType getFoto3() {
		return foto3;
	}

	public void setFoto3(ImageType foto3) {
		this.foto3 = foto3;
	}

	public ImageType getFoto4() {
		return foto4;
	}

	public void setFoto4(ImageType foto4) {
		this.foto4 = foto4;
	}

	public ImageType getFoto5() {
		return foto5;
	}

	public void setFoto5(ImageType foto5) {
		this.foto5 = foto5;
	}

	public Date getDtcad() {
		return dtcad;
	}

	public void setDtcad(Date dtcad) {
		this.dtcad = dtcad;
	}

	
	
}
