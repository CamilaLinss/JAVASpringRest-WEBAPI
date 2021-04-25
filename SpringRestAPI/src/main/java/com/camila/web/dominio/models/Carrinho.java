package com.camila.web.dominio.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
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
	private Long id;
	
	
	//Foreign key
	@NotNull
	//cascade=CascadeType.PERSIST aqui em peço para que assim que o cliente for salvo o carrinho também seja junto
	//Solução para um erro que tive ao criar o cliente e seu carrinho(outra entidade) no mesmo metodo
	@OneToOne(cascade=CascadeType.PERSIST)
	private Cliente cliente;
	
	
	@NotNull
	private int itemTotal;
	
	@NotNull
	private Double valorTotal;
	
	//Foreign key
	@ManyToMany
	private List<Produto> produtos = new ArrayList<>();

	

	
	
	
	
	
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

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	
	
	
	
	
	
	
	
	
}
