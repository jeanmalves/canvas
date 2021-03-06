package com.canvas.hibernate.core.coreCanvas.ENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="avaliador_externo")
public class AvaliadorExterno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDAVALIADOR_EXTERNO", nullable=false)
	private int idAvaliadorExterno;
	
	@Column(name="NOME", nullable=false, length=200)
	private String nome;
	
	@Column(name="AREAATUACAO", nullable=false, length=100)
	private String areaAtuacao;
	
	@Column(name="FORMACAO", nullable=false, length=50)
	private String formacao;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	// @JoinColumn(name="ID_USUARIO", nullable=false)
	@PrimaryKeyJoinColumn
	private Usuario usuario;
	
	
	public int getIdAvaliadorExterno() {
		return idAvaliadorExterno;
	}
	
	public void setIdAvaliadorExterno(int idAvaliadorExterno) {
		this.idAvaliadorExterno = idAvaliadorExterno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
}