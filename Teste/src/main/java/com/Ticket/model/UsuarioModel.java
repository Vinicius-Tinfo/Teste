package com.Ticket.model;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario", schema = "ticket")
public class UsuarioModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id_usuario;


	@Column(name = "cpf") 
	private String cpf;
	
	@Column(name = "email") 
	private String email;
	
	@Column(name = "senha") 
	private String senha;
	
	@Column(name = "data_expiracao") 
	private String data_expiracao;

	@Column(name = "permissao") 
	private int permissao;
	
	public int getPermissao() {
		return permissao;
	}

	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getData_expiracao() {
		return data_expiracao;
	}

	public void setData_expiracao(String data_expiracao) {
		this.data_expiracao = data_expiracao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
