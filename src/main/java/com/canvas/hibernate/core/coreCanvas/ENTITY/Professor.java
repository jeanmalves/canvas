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
@Table(name="professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PROFESSOR", nullable=false)
	private int idProfessor;
	
	@Column(name="NOME", nullable=false, length=200)
	private String nome;
	
	@Column(name="DISCI_PRINCIPAL", nullable=false, length=100)
	private String disciplinaPrincipal;
	
	@Column(name="DEPTO", nullable=false, length=100)
	private String departamento;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	// @JoinColumn(name="ID_USUARIO", nullable=false)
	@PrimaryKeyJoinColumn
	private Usuario usuario;
	
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplinaPrincipal() {
		return disciplinaPrincipal;
	}
	public void setDisciplinaPrincipal(String disciplinaPrincipal) {
		this.disciplinaPrincipal = disciplinaPrincipal;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
