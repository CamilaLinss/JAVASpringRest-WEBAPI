package com.camila.web.dominio.models;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String senha;
	
	
	private String nome;
	private String resumoTecnico;
	private String descricao;
	
	@ElementCollection(targetClass = String.class)
	private List<BufferedImage> imagens = new ArrayList<>();
	
	
	
	private BigDecimal preco;
	private int quantidade;
	private int estoque;
	
	
	//Foreign key
//	@ManyToOne
	//private Optional<List<Carrinho>> carrinhos;

	
	
	//public Optional<List<Carrinho>> getCarrinhos() {
	//	return carrinhos;
	//}
	//public void setCarrinhos(Optional<List<Carrinho>> carrinhos) {
	//	this.carrinhos = carrinhos;
	//}
	
	
	
	
	
	
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResumoTecnico() {
		return resumoTecnico;
	}
	public void setResumoTecnico(String resumoTecnico) {
		this.resumoTecnico = resumoTecnico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<BufferedImage> getImagens() {
		return imagens;
	}
	public void setImagens(List<BufferedImage> imagens) {
		this.imagens = imagens;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
	
	
}
