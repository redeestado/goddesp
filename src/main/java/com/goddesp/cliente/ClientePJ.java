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
@Table(name = "clientepj")
public class ClientePJ implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 368079952917478176L;
	@Id
	@GeneratedValue
	private long id;
	@Column(length = 15)
	private String cnpj;
	@Column(length = 50)
	private String nome;
	@Column(length = 20)
	private String ie;
	@Column(length = 20)
	private String im;
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
	private Date dtfund;
	@Column(length = 30)
	private String responsavel;
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String facebook;
	@Column(length = 30)
	private String site;
	@Column(length = 1)
	private String mark;
	@Column(length = 50)
	private String obs;
	private ImageType foto1;
	private ImageType foto2;
	private ImageType foto3;
	private ImageType foto4;
	private ImageType foto5;
	private Date dtcad;

	public ClientePJ() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
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

	public Date getDtfund() {
		return dtfund;
	}

	public void setDtfund(Date dtfund) {
		this.dtfund = dtfund;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
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

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
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