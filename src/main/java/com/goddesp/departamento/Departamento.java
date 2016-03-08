package com.goddesp.departamento;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="departamento")
public class Departamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8254437649606548348L;
	@Id
	@GeneratedValue
	private Integer id_dep;
	private String descricao;
	public Integer getId_dep() {
		return id_dep;
	}
	public void setId_dep(Integer id_dep) {
		this.id_dep = id_dep;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
