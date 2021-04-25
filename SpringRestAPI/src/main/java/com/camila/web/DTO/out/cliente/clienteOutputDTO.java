package com.camila.web.DTO.out.cliente;

import com.camila.web.dominio.models.Carrinho;

public class clienteOutputDTO {

	
	private String nome;
	private String email;
	private Long CPF;
	private String senha;
	
	//private Carrinho carrinho;
	
	
	
	
	//public Carrinho getCarrinho() {
	//	return carrinho;
	//}
	//public void setCarrinho(Carrinho carrinho) {
	//	this.carrinho = carrinho;
	//}
	
	
	
	
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
