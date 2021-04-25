package com.camila.web.dominio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.web.dominio.models.Carrinho;
import com.camila.web.dominio.models.Cliente;
import com.camila.web.dominio.models.Produto;
import com.camila.web.dominio.repository.RepositoryCarrinho;
import com.camila.web.dominio.repository.RepositoryCliente;



@Service
public class ClienteService {

	

	@Autowired
	private RepositoryCliente clienteRepo;
	
	@Autowired
	private RepositoryCarrinho carRepo;
	
	
	
	//CRUD
	
	
	//POST CADASTRAR
	public Cliente cadastrar(Cliente cliente) {

		
		Carrinho car = new Carrinho();
	
		car.setCliente(cliente);
		car.setItemTotal(0);
		car.setValorTotal(0.0);
		//car.setProdutos(Optional.ofNullable(null));
		
		
		carRepo.save(car);
		
		
		
		cliente.setCarrinho(car);
		//cliente.setCompras(List<0>);
		
		return clienteRepo.save(cliente);

		
	}
	
	
	
	
	
	
	//PUT
	public Cliente atualiza (Cliente cliente) {
		
		
		return clienteRepo.save(cliente);
		
		
	}
	
	
	
	
	
	
	//GET
	public List<Cliente> lista (){
		
		return clienteRepo.findAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	//CARRINHO
	
	
	
	
	
	
}
