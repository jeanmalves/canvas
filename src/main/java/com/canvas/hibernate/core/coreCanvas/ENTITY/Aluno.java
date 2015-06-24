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
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ALUNO", nullable=false)
	private int idAluno;
	
	@Column(name="NOME", nullable=false, length=200)
	private String nome;
	
	@Column(name="CURSO", nullable=false, length=100)
	private String curso;
	
	@Column(name="PERIODO", nullable=false)
	private int periodo;
	
	@Column(name="CAMPUS", nullable=false, length=100)
	private String campus;
	
	@Column(name="PERIODO", nullable=false)
	private int liderProjeto;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER, orphanRemoval = true)
	// @JoinColumn(name="ID_USUARIO", nullable=false)
	@PrimaryKeyJoinColumn
	private Usuario usuario;
	
	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public int getLiderProjeto() {
		return liderProjeto;
	}

	public void setLiderProjeto(int liderProjeto) {
		this.liderProjeto = liderProjeto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
