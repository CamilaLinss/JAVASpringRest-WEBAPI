package com.camila.web.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.camila.web.dominio.models.Cliente;
import com.camila.web.dominio.services.ClienteService;



@RestController


@RequestMapping("/clientes")
public class ClienteController {

	
	
	@Autowired
	private ClienteService clienteService;
	
	
	
	
	@GetMapping
	public List<Cliente> clientes (){
		
		return clienteService.lista();
		
		
	} 
	
	
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente cadastrar(@RequestBody Cliente cliente) {
		
		
		return clienteService.cadastrar(cliente);
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
