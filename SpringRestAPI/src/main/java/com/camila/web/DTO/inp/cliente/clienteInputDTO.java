package com.camila.web.DTO.inp.cliente;

import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.camila.web.dominio.models.Carrinho;
import com.camila.web.dominio.models.Compra;

public class clienteInputDTO {

	
	
	private String nome;
	private String email;
	private Long CPF;
	private String senha;
	
	
	
	//private Carrinho carrinho;
	
	
	//private List<Compra> compras;

	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCPF() {
		return CPF;
	}
	public void setCPF(Long cPF) {
		CPF = cPF;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	
	
	
	
	
}
