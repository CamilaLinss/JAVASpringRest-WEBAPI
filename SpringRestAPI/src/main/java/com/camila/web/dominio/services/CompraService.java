package com.camila.web.dominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.web.dominio.models.Cliente;
import com.camila.web.dominio.models.Compra;
import com.camila.web.dominio.repository.RepositoryCarrinho;
import com.camila.web.dominio.repository.RepositoryCliente;
import com.camila.web.dominio.repository.RepositoryCompra;
import com.camila.web.exception.negocio.ExceptionNotFound;


@Service
public class CompraService {
	
	
	@Autowired
	private RepositoryCompra repoCompra;
	
	@Autowired
	private RepositoryCliente clienteRepo;
	
	
	
	
	
	//GET
	public List<Compra> lista (){
		
		return repoCompra.findAll();
		
		
	}	
	
	
	
	//POST
	public Compra fecharCompra (Compra compra) {
		
		
		Cliente cliente = clienteRepo.findById(compra.getCliente().getId())
				.orElseThrow(() -> new ExceptionNotFound("Cliente não encontrado"));
		
		
		//Pega carrinho associado ao cliente
		compra.setCarrinho(compra.getCliente().getCarrinho());
		
		
	return repoCompra.save(compra);
	
		
	}
	
	
	
	
	//PUT
//	public Compra compraUpdate() {
		
		
		//return null;
	
		
	//}
	
	
	
	
	
	
	
	

}
