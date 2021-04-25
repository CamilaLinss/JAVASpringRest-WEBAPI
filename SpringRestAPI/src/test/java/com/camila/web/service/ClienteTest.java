package com.camila.web.service;



import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.camila.web.dominio.services.ClienteService;




public class ClienteTest {

	
	private ClienteService clienteServ;
	
	
	//GET LISTA
	@Test
	public void t() {
		
		
		assertNotNull(clienteServ.lista());
		
	
	}
	
	
	
	
	
	
	
	
}
