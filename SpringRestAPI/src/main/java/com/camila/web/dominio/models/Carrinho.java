package com.camila.web.dominio.models;

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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;



@Entity
public class Carrinho {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	
	//Foreign key
	@NotNull
	@OneToOne
	private Cliente cliente;
	
	@NotNull
	private int itemTotal;
	
	@NotNull
	private BigDecimal valorTotal;
	
	//Foreign key
	//@OneToMany(mappedBy = "carrinhos")
	//private Optional<List<Produto>> produtos;

	
	
	//public Optional<List<Produto>> getProdutos() {
	//	return produtos;
//	}

//	public void setProdutos(Optional<List<Produto>> produtos) {
	//	this.produtos = produtos;
	//}

	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}


	
	
	
	
	
	
	
	
	
}
