package com.canvas.hibernate.core.coreCanvas.ENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.canvas.hibernate.core.coreCanvas.UTIL.TipoUsuario;

@Entity
@Table(name="usuario")
@Embeddable
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_USUARIO", nullable=false)
	private int idUsuario;
	
	@Column(name = "TIPO_USUARIO", nullable = false)
	@Enumerated(EnumType.STRING)
	private Enum<TipoUsuario> tipoUsuario;
	
	@Column(name="EMAIL", nullable=false, length=200)
	private String email;
	
	@Column(name="SENHA", nullable=false, length=8)
	private String senha;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO", nullable=false, updatable=false)
	private Date dataCadastro;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="DT_ULTI_ALTERACAO")
	@Version
	private Date dataUltimaAlteracao;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Enum<TipoUsuario> getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(Enum<TipoUsuario> tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
